import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { UserDetails } from 'src/app/models/userdetails';

@Component({
  selector: 'app-user-login',
  templateUrl: './user-login.component.html',
  styleUrls: ['./user-login.component.css']
})
export class UserLoginComponent implements OnInit{
  public userdetails = new UserDetails;
  constructor(private router:Router){}
  ngOnInit(): void {
    
  }

  OnSubmit(form:NgForm){
    if(form.valid){
      this.router.navigateByUrl('/user');
     
    }
    else{
      alert('Invalid Credentials');
    }
  }

}
