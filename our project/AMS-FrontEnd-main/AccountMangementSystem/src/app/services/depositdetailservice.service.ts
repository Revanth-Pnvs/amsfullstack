import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { DepositDetails } from '../models/depositdetails';

@Injectable({
  providedIn: 'root'
})
export class DepositdetailserviceService {

  constructor(private http:HttpClient) { }

  getDepositDetails(): Observable<DepositDetails>{

    return this.http.get<DepositDetails>('http://localhost:8028/alldeposit');

  }
  addDepositDetails(depositdetails:any){
    return this.http.post('http://localhost:8028/addDeposit',depositdetails);
  }

}
