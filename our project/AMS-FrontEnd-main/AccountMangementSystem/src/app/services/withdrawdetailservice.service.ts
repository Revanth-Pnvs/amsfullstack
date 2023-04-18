import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { WithdrawDetails } from '../models/withdrawdetails';

@Injectable({
  providedIn: 'root'
})
export class WithdrawdetailserviceService {

  constructor(private http:HttpClient) { }

  getWithdrawDetails():Observable<WithdrawDetails>{
    return this.http.get<WithdrawDetails>('http://localhost:8028/allwithdraw');

  }
  addWithdrawDetails(withdrawdetails: any){
    return this.http.post('http://localhost:8028/addWithdraw',withdrawdetails);
  }
}
