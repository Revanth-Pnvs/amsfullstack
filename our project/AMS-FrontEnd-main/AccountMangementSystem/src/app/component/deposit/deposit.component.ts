import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { DepositDetails } from 'src/app/models/depositdetails';
import { DepositdetailserviceService } from 'src/app/services/depositdetailservice.service';

@Component({
  selector: 'app-deposit',
  templateUrl: './deposit.component.html',
  styleUrls: ['./deposit.component.css']
})
export class DepositComponent implements OnInit{
  
  constructor(private service:DepositdetailserviceService,private router:Router){}

  public depositdetails = new DepositDetails;

  ngOnInit(): void {
    
  }

  OnSubmit(form:NgForm){
    if(form.valid){
      this.service.addDepositDetails(this.depositdetails).subscribe(data=>{

      })
      alert('Deposit Done');
    }
    else{
      alert('Deposit Failed');
    }
  }

}
