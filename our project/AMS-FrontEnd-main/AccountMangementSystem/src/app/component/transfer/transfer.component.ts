import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { TransferDetails } from 'src/app/models/transferdetails';
import { TransferdetailserviceService } from 'src/app/services/transferdetailservice.service';

@Component({
  selector: 'app-transfer',
  templateUrl: './transfer.component.html',
  styleUrls: ['./transfer.component.css']
})
export class TransferComponent implements OnInit{
  constructor(private service:TransferdetailserviceService,private router:Router){}

  public transferdetails = new TransferDetails;
  
  ngOnInit(): void {
    
  }
  OnSubmit(form:NgForm){
    if(form.valid){
      this.service.addTransferDetails(this.transferdetails).subscribe(data=>{
        
      })
      alert('Transfer Done');
    }
    else{
      alert('Transfer Not Done');
    }
  }

}
