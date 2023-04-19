import { Component, OnInit } from '@angular/core';
import { UserDetails } from 'src/app/models/userdetails';
import { UserdetailserviceService } from 'src/app/services/userdetailservice.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  constructor(private service: UserdetailserviceService) {

  }
  public userdetails: any;


  ngOnInit(): void {

    this.getUserDetails();

  }
  isLoggedIn = true;

  getUserDetails() {
    this.service.getUserDetails().subscribe(data => {
      this.userdetails = data;
    })
  }


  //This deletes the user
  /*delete(id:any){
    this.service.deleteUserDetails(id).subscribe((y:any)=>{
     this.getUserDetails()
   
    })
  }*/
  deleteUser(accountnumber: String) {
    if (confirm('Please click OK to delete the user!!')) {
      this.service.deleteUser(accountnumber).subscribe(
        (response) => {
          // console.log(response); // log the response to the console
          Swal.fire('Success', 'User deleted successfully!', 'success');
          this.getUserDetails();
        },
        (error) => {
          console.log(error); // log the error to the console
          Swal.fire('Error', 'Error deleting user!', 'warning');
        }
      );
    }
  }




  /*approved(c:any){
    const data={
      AccountNumber:c.accountnumber,
      Ifsc:c.ifsc,
      FirstName:c.firstName,
      LastName:c.lastName,
      Email:c.email,
      Address:c.address,
      DateOfBirth:c.dateOfBirth,
      Phone:c.phone
    
    }
    this.service.postUserdetails(data).subscribe((x:any)=>{
      console.log("dfgh",x)
      
    })
  }*/



}
