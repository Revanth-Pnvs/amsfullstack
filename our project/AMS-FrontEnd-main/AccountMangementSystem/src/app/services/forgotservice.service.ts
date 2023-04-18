import { Injectable } from '@angular/core';
import { ForgotPass } from '../models/forgotpass';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ForgotserviceService {

  constructor(private http: HttpClient) { }

  getforgotpass(): Observable<ForgotPass> {

    return this.http.get<ForgotPass>('http://localhost:8028/forgotpass');
  }
}