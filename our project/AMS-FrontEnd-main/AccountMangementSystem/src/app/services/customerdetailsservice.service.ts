import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { CustomerDetails } from '../models/customerdetails';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerdetailsserviceService {

  constructor(private http: HttpClient) { }

  getCustomers():Observable<CustomerDetails>{
    return this.http.get<CustomerDetails>('http://localhost:8028/customer');
  }

  getCustomer(id: any):Observable<CustomerDetails>{
    return this.http.get<CustomerDetails>('http://localhost:8082/customer/${id}');
  }
  
  addCustomer(customer: any){
    return this.http.post('http://localhost:8082/customer', customer);
  }

  removeCustomer(id: any){
    return this.http.delete(`http://localhost:8082/customer/${id}`);
  }

  updateCustomer(id: any,customer: any){
    return this.http.put(`http://localhost:8082/customer${id}`, customer);
  }
}