import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AdminHomeComponent } from './admin-home/admin-home.component';
import { UserRegisterComponent } from './user-register/user-register.component'
import { WelcomeComponent } from './welcome/welcome.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { AdminPageComponent } from './admin-page/admin-page.component';
import { AddHotelComponent } from './add-hotel/add-hotel.component';
import { DisplayhotelComponent } from './displayhotel/displayhotel.component';
import { GuestloginComponent } from './guestlogin/guestlogin.component';
import { UpdateHotelComponent } from './update-hotel/update-hotel.component';
import { RoomComponent } from './room/room.component';
import { DeleteHotelComponent } from './delete-hotel/delete-hotel.component';
import { BookingComponent } from './booking/booking.component';
import { DisplayuserComponent } from './displayuser/displayuser.component';
import { PaymentComponent } from './payment/payment.component';



@NgModule({
  declarations: [
    AppComponent,
    WelcomeComponent,
    ContactUsComponent,
    AboutUsComponent,
    AdminPageComponent,
    DisplayuserComponent
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    DeleteHotelComponent,
    RoomComponent,
    UpdateHotelComponent,
    UserRegisterComponent,
    AddHotelComponent,
    BookingComponent,
    GuestloginComponent,
    DisplayhotelComponent,
    PaymentComponent
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
