import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './component/header/header.component';
import { FooterComponent } from './component/footer/footer.component';
import { AdminComponent } from './component/admin/admin.component';
import { UserLoginComponent } from './component/user-login/user-login.component';
import { AdminLoginComponent } from './component/admin-login/admin-login.component';
import { HomeComponent } from './component/home/home.component';
import { UserComponent } from './component/user/user.component';
import { ForgotComponent } from './component/forgot/forgot.component';
import { UsersuccessresetComponent } from './component/usersuccessreset/usersuccessreset.component';
import { AdminsuccessregisterComponent } from './component/adminsuccessregister/adminsuccessregister.component';
import { AdminsuccessresetComponent } from './component/adminsuccessreset/adminsuccessreset.component';
import { UsersuccessregisterComponent } from './component/usersuccessregister/usersuccessregister.component';
import { WithdrawComponent } from './component/withdraw/withdraw.component';
import { DepositComponent } from './component/deposit/deposit.component';
import { TransferComponent } from './component/transfer/transfer.component';
import { CheckbalanceComponent } from './component/checkbalance/checkbalance.component';
import { UserregisterComponent } from './component/userregister/userregister.component';
import { FormsModule , NgForm} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { TransctionsComponent } from './component/transctions/transctions.component';
import { AdminregisterComponent } from './component/adminregister/adminregister.component';
import { CustomerdetailsComponent } from './component/customerdetails/customerdetails.component';
import { CustomerrequestComponent } from './component/customerrequest/customerrequest.component';



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    AdminComponent,
    UserLoginComponent,
    AdminLoginComponent,
    HomeComponent,
    UserComponent,
    ForgotComponent,
    UsersuccessresetComponent,
    UsersuccessregisterComponent,
    AdminsuccessregisterComponent,
    AdminsuccessresetComponent,
    WithdrawComponent,
    DepositComponent,
    TransferComponent,
    CheckbalanceComponent,
    UserregisterComponent,
    TransctionsComponent,
    AdminregisterComponent,
    CustomerdetailsComponent,
    CustomerrequestComponent,
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
