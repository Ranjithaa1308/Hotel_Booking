import { Component, OnInit } from '@angular/core';
import { HotelService } from '../hotel.service';
import { FormsModule } from '@angular/forms';
import { ActivatedRoute, Route, Router } from '@angular/router';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-update-hotel',
  templateUrl: './update-hotel.component.html',
  styleUrl: './update-hotel.component.css',
  standalone: true,
  imports: [FormsModule, CommonModule]
})
export class UpdateHotelComponent implements OnInit {
  hotelId: any
  hotel: any
  constructor(private hotelService: HotelService, private activatedRoute: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    this.hotelId = this.activatedRoute.snapshot.params['hotelId'];
    this.hotelService.getHotelById(this.hotelId).subscribe(
      (response: any) => {
        this.hotel = response;
      }
    )
  }

  updateHotel() {
    this.hotelService.updateHotel(this.hotelId, this.hotel).subscribe(
      (response: any) => {
        alert("Updated hotel successfully");
        this.router.navigate(['displayhotel']);
      },
      (error) => {
        alert('No records found to Update.');
      }
    );
  }
}