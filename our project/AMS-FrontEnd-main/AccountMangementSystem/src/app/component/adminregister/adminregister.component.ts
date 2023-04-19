import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { AdminDetails } from 'src/app/models/admindetails';
import { AdmindetailserviceService } from 'src/app/services/admindetailservice.service';
import Swal from 'sweetalert2';

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
      Swal.fire('Success', 'Admin Created Successfully', 'success');
      this.router.navigateByUrl('/admin-login');
    } else {

      Swal.fire('Error', 'Invalid Data', 'warning');
    }
  }
}
