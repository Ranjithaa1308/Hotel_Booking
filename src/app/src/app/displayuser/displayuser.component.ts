import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { HotelService } from '../hotel.service';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-displayuser',
  templateUrl: './displayuser.component.html',
  styleUrl: './displayuser.component.css',
  standalone:false,
  //imports: [FormsModule,CommonModule]
})
export class DisplayuserComponent implements OnInit {
logOut() {
  this.router.navigate(['/welcomepage'])
}
  hotelList: any;
  bookingService: any;
  currUserId:any;
  currName:any;

  constructor(private router: Router, private hotelService: HotelService, private activatedRoute:ActivatedRoute) { }

  ngOnInit(): void {
    this.currUserId = this.activatedRoute.snapshot.params['userId'];
    this.currName = this.activatedRoute.snapshot.params['name'];
    this.hotelService.getAllHotel().subscribe(
      (response: any) => {
        this.hotelList = response
      })
  }
  displayRooms() {
    this.router.navigate(['/booking', this.currUserId, this.currName]);
  }
}