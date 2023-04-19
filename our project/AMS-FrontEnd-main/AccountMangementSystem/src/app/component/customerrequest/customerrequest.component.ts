import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-customerrequest',
  templateUrl: './customerrequest.component.html',
  styleUrls: ['./customerrequest.component.css']
})
export class CustomerrequestComponent {
 
 onSubmit() {

  Swal.fire('Success','Request has been sent','success');

 }
 onclick() {

  Swal.fire('Success','Request has been sent','success');

 }

}