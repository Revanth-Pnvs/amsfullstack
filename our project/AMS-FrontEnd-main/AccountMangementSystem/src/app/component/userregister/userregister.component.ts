import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { UserDetails } from 'src/app/models/userdetails';
import { UserdetailserviceService } from 'src/app/services/userdetailservice.service';

@Component({
  selector: 'app-userregister',
  templateUrl: './userregister.component.html',
  styleUrls: ['./userregister.component.css']
})
export class UserregisterComponent implements OnInit {
 
 constructor(private service:UserdetailserviceService,private router:Router){}
 public userdetails = new UserDetails;

  ngOnInit(): void {
   

  }
  OnSubmit(form:NgForm){
    if(form.valid){
      this.service.addUserDetails(this.userdetails).subscribe(data=>{
        
      })
      alert('usercreated')
      this.router.navigateByUrl('/');
    }
    else{
      alert('user notcreated');
    }
  }


}
