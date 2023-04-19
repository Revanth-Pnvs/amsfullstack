import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { UserDetails } from 'src/app/models/userdetails';
import { UserdetailserviceService } from 'src/app/services/userdetailservice.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-user-login',
  templateUrl: './user-login.component.html',
  styleUrls: ['./user-login.component.css']
})
export class UserLoginComponent implements OnInit{
  public userdetails = new UserDetails;
  constructor(private router:Router, private service:UserdetailserviceService){}
  ngOnInit(): void {
    
  }

  OnSubmit(form:NgForm){
    if(form.valid){
      // localStorage.setItem('email',this.)
      //this.router.navigateByUrl('/user');

       //Jwt
       this.service.verifyUser(this.userdetails).subscribe((res:any)=>{
        localStorage.setItem('token',res.token);
        this.router.navigateByUrl('/user');
        Swal.fire('Success','Login in Successfully','success')
      },
      (error)=>{
        Swal.fire('Error','Invalid Credentials','error');
      })
     
    }
    // else{
    //   Swal.fire('Success','Login in Successfully','success')
    // }
  }

}
