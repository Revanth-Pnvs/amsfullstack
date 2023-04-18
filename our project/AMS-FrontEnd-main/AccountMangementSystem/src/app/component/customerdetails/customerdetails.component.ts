import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CustomerDetails } from 'src/app/models/customerdetails';
import { CustomerdetailsserviceService } from 'src/app/services/customerdetailsservice.service';

@Component({
  selector: 'app-customerdetails',
  templateUrl: './customerdetails.component.html',
  styleUrls: ['./customerdetails.component.css']
})
export class CustomerdetailsComponent implements OnInit {

  constructor(private service: CustomerdetailsserviceService, private router: Router) { }

  public customerdetails = new CustomerDetails;

  ngOnInit(): void {
    this.getCustomer();
  }

  getCustomer() {
    this.service.getCustomers().subscribe((data: any) => {
      //console.log(data);
      this.customerdetails = data;
    })
  }

  onDelete(id: any) {
    this.service.removeCustomer(id).subscribe((data: any) => {
      this.getCustomer();
    })
  }

  onUpdate(id: any) {
    console.log(id);
  }
}


