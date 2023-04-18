import { Component, OnInit } from '@angular/core';
import { DepositdetailserviceService } from 'src/app/services/depositdetailservice.service';
import { TransferdetailserviceService } from 'src/app/services/transferdetailservice.service';
import { WithdrawdetailserviceService } from 'src/app/services/withdrawdetailservice.service';

@Component({
  selector: 'app-transctions',
  templateUrl: './transctions.component.html',
  styleUrls: ['./transctions.component.css']
})
export class TransctionsComponent implements OnInit{
 
  
  constructor(
    private service:TransferdetailserviceService,
    private withdrawService: WithdrawdetailserviceService,
    private depositService: DepositdetailserviceService

    ){

  }
 
  public transferdetails:any;

  public withdrawdetails:any;

  public depositdetails:any;

  
  ngOnInit(): void {
   this.getTransferDetails();
   this.getWithdrawDetails();
   this.getDepositDetails();
    
  }

   //Transfer
  getTransferDetails() {
    this.service.getTransferDetails().subscribe(data=>{
      this.transferdetails=data;
    })
  }
  getWithdrawDetails() {
    this.withdrawService.getWithdrawDetails().subscribe(data=>{
      this.withdrawdetails=data;
    })
  }
  getDepositDetails() {
    this.depositService.getDepositDetails().subscribe(data=>{
      this.depositdetails=data;
    })
  }

  

  

}
