import {Component, Inject, OnInit, Optional, Output} from '@angular/core';
import {UnitModel} from '../model/UnitModel';
import {UnitService} from '../services/UnitService';
import {MAT_DIALOG_DATA, MatDialog, MatDialogRef} from '@angular/material/dialog';
import {MatSnackBar} from '@angular/material/snack-bar';
import {Router} from '@angular/router';

@Component({
  selector: 'app-unit',
  templateUrl: './unit.component.html',
  styleUrls: ['./unit.component.scss']
})
export class UnitComponent implements OnInit {

  data: UnitModel[] = [];
  originalData: UnitModel[];

  constructor(private api: UnitService, public unitDialog: MatDialog, private router: Router, private snackBar: MatSnackBar ) {
  }

  ngOnInit() {
    this.api.getAllUnits().subscribe(res => {
      this.data = res;
      this.originalData = res;
    }, err => {
      console.log(err);
    });
  }

  openAddUnitDialog(action, obj) {
    obj.action = action;
    const unitDialogRef = this.unitDialog.open(AddUnitDialogComponent, {
      width: '20%',
      height: '35%',
      data: obj,

    });

    unitDialogRef.afterClosed().subscribe(result => {
      if (result.event === 'AddUnit') {
        this.addUnit(result.data);
      } else if (result.event === 'Cancel') {
      }
    });
  }

  addUnit(rowObj) {
    const unit = new UnitModel(0);
    unit.nameAr = rowObj.nameAr;
    unit.nameEn = rowObj.nameEn;

    this.api.addNewUnit(unit).subscribe(result => {
      this.snackBar.open('تم إضافة وحدة جديدة بنجاح', '', {
        verticalPosition: 'top',
        horizontalPosition: 'end',
        duration: 2000
      });
      this.ngOnInit();
    }, error => {
      console.log(error);
    });

  }

  openUpdateUnitDialog(action, obj) {
    obj.action = action;
    // this.getOneUnitByUnitId(obj.unitId);
    const unitDialogRef = this.unitDialog.open(UpdateUnitDialogComponent, {
      width: '20%',
      height: '45%',
      data: obj,

    });

    unitDialogRef.afterClosed().subscribe(result => {
      if (result.event === 'UpdateUnit') {
        this.updateUnit(result.data);
      } else if (result.event === 'Cancel') {
        this.ngOnInit();
      }
    });
  }

  updateUnit(rowObj) {
    const unit = new UnitModel(0);
    unit.id = rowObj.id;
    unit.nameAr = rowObj.nameAr;
    unit.nameEn = rowObj.nameEn;
    this.api.updateUnit(unit.id, unit).subscribe(result => {
      this.snackBar.open('تم تعديل بيانات الوحدة بنجاح', '', {
        verticalPosition: 'top',
        horizontalPosition: 'end',
        duration: 2000
      });
      this.ngOnInit();
    }, error => {
      console.log(error);
    });

  }

  // getOneUnitByUnitId(unitId: number){
  //   this.api.getOneUnitByUnitId(unitId).subscribe(res => {
  //     this.data = res;
  //     this.originalData = res;
  //   }, err => {
  //     console.log(err);
  //   });
  // }

  deleteUnit(unitId: number) {
    this.api.deleteUnit(unitId).subscribe(result => {
      this.snackBar.open('تم حذف الوحدة بنجاح', '', {
        verticalPosition: 'top',
        horizontalPosition: 'end',
        duration: 2000
      });
      this.ngOnInit();
    }, error => {
      console.log(error);
    });
  }


}

@Component({
  selector: 'app-add-unit-dialog',
  templateUrl: './add-unit-dialog.html',
  styleUrls: ['./unit.component.scss']
})
export class AddUnitDialogComponent implements OnInit {


  constructor(
      public dialogRef: MatDialogRef<AddUnitDialogComponent>,
      @Optional() @Inject(MAT_DIALOG_DATA) public data: any) {
  }

  ngOnInit(): void {

  }

  addUnit() {
    this.dialogRef.close({event: 'AddUnit', data: this.data});
  }

  closeDialog() {
    this.dialogRef.close({event: 'Cancel'});
  }


}

@Component({
  selector: 'app-update-unit-dialog',
  templateUrl: './update-unit-dialog.html',
  styleUrls: ['./unit.component.scss']
})
export class UpdateUnitDialogComponent implements OnInit {


  constructor(
      public dialogRef: MatDialogRef<UpdateUnitDialogComponent>,
      @Optional() @Inject(MAT_DIALOG_DATA) public data: any) {
  }

  ngOnInit(): void {

  }

  updateUnit() {
    this.dialogRef.close({event: 'UpdateUnit', data: this.data});
  }

  closeDialog() {
    this.dialogRef.close({event: 'Cancel'});
  }


}

