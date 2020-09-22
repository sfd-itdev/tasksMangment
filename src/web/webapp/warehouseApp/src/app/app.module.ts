import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SharedModule } from './shared/shared.module';
import { InMemoryWebApiModule } from 'angular-in-memory-web-api';
import { InMemoryDataService } from './shared/inmemory-db/inmemory-db.service';
import { HttpClientModule } from '@angular/common/http';
import { UnitComponent, AddUnitDialogComponent, UpdateUnitDialogComponent} from './pages/unit/unit.component';
import {MatCardModule} from '@angular/material/card';
import {MatFormFieldModule} from '@angular/material/form-field';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {MatDialogModule} from '@angular/material/dialog';
import {MatSnackBar, MatSnackBarModule} from '@angular/material/snack-bar';
import {MatTableModule} from '@angular/material/table';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatButtonToggleModule} from '@angular/material/button-toggle';
import {MatSlideToggleModule} from '@angular/material/slide-toggle';
import {CommonModule} from '@angular/common';
import {MatPaginatorModule} from '@angular/material/paginator';
import {NgxEchartsModule} from 'ngx-echarts';
import {MatInputModule} from '@angular/material/input';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatMenuModule} from '@angular/material/menu';
import {MatGridListModule} from '@angular/material/grid-list';
import {MatSortModule} from '@angular/material/sort';
import {MatAutocompleteModule} from '@angular/material/autocomplete';
import {MatTabsModule} from '@angular/material/tabs';
import {MatTooltipModule} from '@angular/material/tooltip';
import {MatButtonModule} from '@angular/material/button';
import {MatSelectModule} from '@angular/material/select';
import {NgxDatatableModule} from '@swimlane/ngx-datatable';
import {MatIconModule} from '@angular/material/icon';
import {MatListModule} from '@angular/material/list';
import {MatStepperModule} from '@angular/material/stepper';
import {MatSidenavModule} from '@angular/material/sidenav';
import {PerfectScrollbarModule} from 'ngx-perfect-scrollbar';
import {MatProgressSpinnerModule} from '@angular/material/progress-spinner';
import {MatRadioModule} from '@angular/material/radio';
import {MatSliderModule} from '@angular/material/slider';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import {SharedComponentsModule} from './shared/components/shared-components.module';
import {MatNativeDateModule} from '@angular/material/core';
import {LayoutModule} from '@angular/cdk/layout';

@NgModule({
  declarations: [
    AppComponent,
    UnitComponent,
    AddUnitDialogComponent,
    UpdateUnitDialogComponent
  ],
    imports: [
        BrowserModule,
        SharedModule,
        HttpClientModule,
        BrowserAnimationsModule,
        InMemoryWebApiModule.forRoot(InMemoryDataService, {passThruUnknownUrl: true}),
        AppRoutingModule,
        MatStepperModule,
        MatFormFieldModule,
        MatSelectModule,
        MatTableModule,
        ReactiveFormsModule,
        MatInputModule,
        MatToolbarModule,
        MatCardModule,
        MatButtonModule,
        FormsModule,
        MatDialogModule,
        MatTabsModule,
        MatTooltipModule,
        MatRadioModule,
        MatDatepickerModule,
        MatNativeDateModule,
        MatIconModule,
        MatSnackBarModule,
        MatAutocompleteModule,
        PerfectScrollbarModule,
        NgbModule,
        CommonModule,
        SharedComponentsModule,
        NgxEchartsModule,
        NgxDatatableModule,
        MatGridListModule,
        MatPaginatorModule,
        MatProgressSpinnerModule,
        MatSortModule,
        MatSliderModule,
        MatSlideToggleModule,
        MatButtonToggleModule,
        LayoutModule,
        MatSidenavModule,
        MatListModule,
        MatMenuModule
    ],
  providers: [],
  bootstrap: [AppComponent],
    entryComponents: [
        AddUnitDialogComponent,
        UpdateUnitDialogComponent
    ]
})
export class AppModule { }
