import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { WithdrawDetails } from 'src/app/models/withdrawdetails';
import { WithdrawdetailserviceService } from 'src/app/services/withdrawdetailservice.service';

@Component({
  selector: 'app-withdraw',
  templateUrl: './withdraw.component.html',
  styleUrls: ['./withdraw.component.css']
})
export class WithdrawComponent implements OnInit{
  constructor(private service:WithdrawdetailserviceService,private router:Router){}
  public withdrawdetails = new WithdrawDetails;
  ngOnInit(): void {
    
  }
  OnSubmit(form:NgForm){

    if(form.valid){
      this.service.addWithdrawDetails(this.withdrawdetails).subscribe(data=>{

      })
      alert('Withdraw Successfull');
    }
    else{
      alert('Withdraw Failed');
    }

  }

}
