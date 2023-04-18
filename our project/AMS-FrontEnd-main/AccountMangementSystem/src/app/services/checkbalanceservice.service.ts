import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { CheckBalance } from '../models/checkbalance';

@Injectable({
  providedIn: 'root'
})

export class CheckbalanceserviceService {

  constructor(private http: HttpClient) { }

  getCheckbalance(): Observable<CheckBalance> {

    return this.http.get<CheckBalance>('http://localhost:8028/allcheckbalance');

  }
  addCheckBalance(checkbalance: any) {
    return this.http.post('http://localhost:8028/addcheckbalance', checkbalance);
  }

}