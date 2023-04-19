import { Component, OnInit } from '@angular/core';
import { FormBuilder, NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { UserDetails } from 'src/app/models/userdetails';
import { UserdetailserviceService } from 'src/app/services/userdetailservice.service';
import Swal from 'sweetalert2';
@Component({
  selector: 'app-userregister',
  templateUrl: './userregister.component.html',
  styleUrls: ['./userregister.component.css']
})
export class UserregisterComponent implements OnInit {
 
 constructor(private service:UserdetailserviceService,private router:Router,private db:FormBuilder){}
 public userdetails = new UserDetails;

  ngOnInit(): void {
   

  }
  OnSubmit(form:NgForm){
    if(form.valid){
      this.service.addUserDetails(this.userdetails).subscribe(data=>{
        
      })
      Swal.fire('Success','Request Sent Successfully','success')
      
      this.router.navigateByUrl('/user-login');

      // this.router.navigateByUrl('/admin');

    }
    else{
      Swal.fire('Error','Enter valid Details','error');
    }
  }

}
