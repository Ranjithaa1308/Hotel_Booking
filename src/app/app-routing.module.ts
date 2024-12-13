import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UserRegisterComponent } from './user-register/user-register.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { AdminHomeComponent } from './admin-home/admin-home.component';
import { AdminPageComponent } from './admin-page/admin-page.component';
import { AddHotelComponent } from './add-hotel/add-hotel.component';
import { DisplayhotelComponent } from './displayhotel/displayhotel.component';
import { RoomComponent } from './room/room.component';
import { DeleteHotelComponent } from './delete-hotel/delete-hotel.component';
import { UpdateHotelComponent } from './update-hotel/update-hotel.component';
import { GuestloginComponent } from './guestlogin/guestlogin.component';
import { DisplayuserComponent } from './displayuser/displayuser.component';
import { BookingComponent } from './booking/booking.component';
import { PaymentComponent } from './payment/payment.component';

const routes: Routes = [{path:"",component:WelcomeComponent},
{path:"user-register",component:UserRegisterComponent},
{path:"contact-us",component:ContactUsComponent},
{path:"about-us", component:AboutUsComponent},
{path:"admin-login",component:AdminHomeComponent},
{path:"admin-page",component:AdminPageComponent},
{path:"add-hotel",component:AddHotelComponent},
{path:"displayAdminHotel",component:DisplayhotelComponent},
{path:"displayhotel/:userId/:name",component:DisplayuserComponent},
{path:"booking/:userId/:name",component:BookingComponent},
{path:"displayrooms",component:RoomComponent},
{path:"updatehotel/:hotelId",component:UpdateHotelComponent},
{path:"delete-hotel",component:DeleteHotelComponent},
{path:"guestlogin",component:GuestloginComponent},
{path:"payment/:totalPrice/:userId",component:PaymentComponent},
{path:"welcomepage",component:WelcomeComponent}
]


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
