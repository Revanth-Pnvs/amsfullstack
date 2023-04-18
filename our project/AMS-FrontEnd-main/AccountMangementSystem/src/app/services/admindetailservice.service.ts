import { Injectable } from '@angular/core';
import { AdminDetails } from '../models/admindetails';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AdmindetailserviceService {

  constructor(private http:HttpClient) { }

  getAdminDetails(): Observable<AdminDetails>{

    return this.http.get<AdminDetails>('http://localhost:8028/getAdmin');

  }
  addAdminDetails(admindetails:any){
    return this.http.post('http://localhost:8028/alladmins',admindetails);
  }

}