import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { AdminDetails } from 'src/app/models/admindetails';
import { CheckBalance } from 'src/app/models/checkbalance';
import { AdmindetailserviceService } from 'src/app/services/admindetailservice.service';
import { CheckbalanceserviceService } from 'src/app/services/checkbalanceservice.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-checkbalance',
  templateUrl: './checkbalance.component.html',
  styleUrls: ['./checkbalance.component.css']
})
export class CheckbalanceComponent {


constructor(private service:CheckbalanceserviceService , private router: Router) { }
  public checkbalance = new CheckBalance;

  ngOnInit(): void {

  }
  onSubmit(form: NgForm) {
    if (form.valid) {
      this.service.addCheckBalance(this.checkbalance).subscribe(data => {
      })
      this.router.navigateByUrl('/transctions');
     
    }
    else {
      Swal.fire('Error', 'Invalid data', 'warning');
    }

  }
}