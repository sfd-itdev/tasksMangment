import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Injectable} from '@angular/core';
import {UnitModel } from '../model/UnitModel';
import { environment } from 'src/environments/environment';


@Injectable({providedIn: 'root'})
export class UnitService {
    applicationUrl: string;


    constructor(private http: HttpClient) {
        this.applicationUrl = 'http://localhost:8090/api/warehouse/unit';
    }

    public getAllUnits(): Observable<UnitModel[]>
    {
        return this.http.get<UnitModel[]>(this.applicationUrl + '/units');
    }

    public addNewUnit(unit: UnitModel) {

        return this.http.post<UnitModel>(this.applicationUrl + '/addUnit' , unit);

    }

    public updateUnit(unitId, unit: UnitModel)
    {
        return this.http.put(this.applicationUrl + '/updateUnit/' + unitId , unit);
        // return this.http.put(this.applicationUrl + '/updateUnit/' + unitId);
    }

    public deleteUnit(unitId) {
        return this.http.delete(this.applicationUrl + '/deleteUnit/' + unitId);
    }

    public getOneUnitByUnitId(unitId) {
        return this.http.get<UnitModel[]>(this.applicationUrl + '/getOneUnitByUnitId/' + unitId);
    }
}
