import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { CheckBalance } from 'src/app/models/checkbalance';
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
      Swal.fire('Successfully','Your Account balance:50000', 'success');
     // this.router.navigateByUrl('/transctions');
     
    }
    else {
      Swal.fire('Error', 'Invalid data', 'warning');
    }

  }
}