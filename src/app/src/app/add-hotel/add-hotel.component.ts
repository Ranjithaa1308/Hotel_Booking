import { Component } from '@angular/core';
import { HotelService } from '../hotel.service';
import { FormsModule } from '@angular/forms';
import { Hotel } from '../hotel';
import { CommonModule } from '@angular/common';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-add-hotel',
  templateUrl: './add-hotel.component.html',
  styleUrl: './add-hotel.component.css',
  standalone:true,
  imports:[FormsModule,CommonModule]
})
export class AddHotelComponent {

  hotel: Hotel = new Hotel(0, "", "", "", "", "", "", "");
  constructor(private addHotelService: HotelService, router:Router) { }

  addhotel() {
    this.addHotelService.addHotel(this.hotel).subscribe(
      (response: any) => {
        if(response!=null){
          alert("Added hotel successfully");
        }
      },
      (error) => {
        alert('An error occurred during adding.');
      }
    );
  }
//   goBack()
//   {
//     this.router.navigate(['admin-page']);
//   }
}