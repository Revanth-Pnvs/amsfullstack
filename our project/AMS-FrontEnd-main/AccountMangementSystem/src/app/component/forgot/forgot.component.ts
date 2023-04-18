import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { ForgotPass } from 'src/app/models/forgotpass';

@Component({
  selector: 'app-forgot',
  templateUrl: './forgot.component.html',
  styleUrls: ['./forgot.component.css']
})
export class ForgotComponent implements OnInit {


  public forgotpass = new ForgotPass;
  constructor(private router: Router) { }
  ngOnInit(): void {

  }

  OnSubmit(form: NgForm) {
    if (form.valid) {
      this.router.navigateByUrl('/admin-login');


    }
    else {
      alert('Enter valid Password!!');
    }
  }
}
