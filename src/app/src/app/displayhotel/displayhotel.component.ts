import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HotelService } from '../hotel.service';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-displayhotel',
  templateUrl: './displayhotel.component.html',
  styleUrl: './displayhotel.component.css',
  standalone:true,
  imports: [FormsModule,CommonModule]
})
export class DisplayhotelComponent implements OnInit {
logOut() {
this.router.navigate(['admin-login'])
}

  hotelList: any;
  constructor(private hotelService: HotelService, private router: Router) { }
  ngOnInit(): void {
    this.hotelService.getAllHotel().subscribe(
      (response: any) => {
        this.hotelList = response
      })
  }
  displayRoom() {
    this.router.navigate(['/room'])
  }
  updatehotel(hotelId: number) {
    this.router.navigate(['updatehotel', hotelId])
  }
  deleteHotel(hotelId: number) {
    this.hotelService.deleteHotelById(hotelId).subscribe(
      (response: any) => {
        this.hotelList = response
      })
  }
}