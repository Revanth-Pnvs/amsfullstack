import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { AdminDetails } from 'src/app/models/admindetails';
import { AdmindetailserviceService } from 'src/app/services/admindetailservice.service';

@Component({
  selector: 'app-adminregister',
  templateUrl: './adminregister.component.html',
  styleUrls: ['./adminregister.component.css']
})
export class AdminregisterComponent implements OnInit {

  constructor(private service: AdmindetailserviceService, private router: Router) { }
  public admindetails = new AdminDetails;

  ngOnInit(): void {



  }
  onSubmit(form: NgForm) {
    if (form.valid) {
      this.service.addAdminDetails(this.admindetails).subscribe(data => {
      })
      alert('Admin Registered');
    } else {
      alert('not Registered');
    }

  }


}