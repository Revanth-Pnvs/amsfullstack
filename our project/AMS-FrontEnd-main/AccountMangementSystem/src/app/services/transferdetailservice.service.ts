import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { TransferDetails } from '../models/transferdetails';

@Injectable({
  providedIn: 'root'
})
export class TransferdetailserviceService {
  getDepositDetails() {
    throw new Error('Method not implemented.');
  }

 
  constructor(private http:HttpClient) { }

  getTransferDetails(): Observable<TransferDetails>{
    return this.http.get<TransferDetails>('http://localhost:8028/alltransfers');
  }
  addTransferDetails(transferdetails:any){
    return this.http.post('http://localhost:8028/addTransfer',transferdetails);
  }
 

  
}
