import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { UserDetails } from '../models/userdetails';

@Injectable({
  providedIn: 'root'
})
export class UserdetailserviceService {
  [x: string]: any;
  
  postUserdetails: any;
  deleteUserByAdmin(id: any) {
    throw new Error('Method not implemented.');
  }

  constructor(private http:HttpClient) { }

  getUserDetails(): Observable<UserDetails>{
    return this.http.get<UserDetails>('http://localhost:8028/allusers');
  }
  addUserDetails(userdetails:any){
    return this.http.post('http://localhost:8028/addUser',userdetails);
  }
  deleteUser(accountnumber: any) {
    return this.http.delete(`http://localhost:8028/allusers/${accountnumber}`);
  }
   //Jwt
   verifyUser(userdetails:any){
    return this.http.post('http://localhost:8028/login',userdetails,{responseType:'text'});
  }
  
}
