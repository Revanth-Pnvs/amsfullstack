import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { UserDetails } from 'src/app/models/userdetails';

@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrls: ['./admin-login.component.css']
})
export class AdminLoginComponent implements OnInit {

  public userdetails = new UserDetails;
  constructor(private router:Router){}
  ngOnInit(): void {
    
  }

  OnSubmit(form:NgForm){
    if(form.valid){
      this.router.navigateByUrl('/admin');
      
     
    }
    else{
      alert('Invalid Credentials');
    }
  }

}
