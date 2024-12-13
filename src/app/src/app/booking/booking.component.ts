import { Component, OnInit } from '@angular/core';
import { BookingService } from '../booking.service';
import { Booking } from '../booking';
import { RoomService } from '../room.service';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrl: './booking.component.css',
  standalone: true,
  imports: [FormsModule, CommonModule]
})
export class BookingComponent implements OnInit {

  booking: Booking = new Booking(0, "", "", "", "", "");
  room: any;
  curruserId: any;
  currname: any;
  selectedRoomTypeId: any;
  dateCount: number | null = null;
  totalPrice: any;
  daycount: any;
  roomList: any;
  currdate:any;


  constructor(private bookingService: BookingService, private roomService: RoomService, private route: Router, private activatedRoute: ActivatedRoute) { }
  ngOnInit(): void {
    this.curruserId = this.activatedRoute.snapshot.params['userId'];
    this.currname = this.activatedRoute.snapshot.params['name'];
    this.roomdetails();
    this.currdate=new Date();
  }

  paymentInfo() {
    this.route.navigate(['payment', this.totalPrice,this.curruserId]);
    /*this.bookingService.payment(this.paymentInfo).subscribe
      (
        (response: any) => { alert("Information stored") }
      )
*/
  }

  onRoomTypeChange($event: Event) {
    this.selectedRoomTypeId = ($event.target as HTMLSelectElement).value;
    console.log(this.selectedRoomTypeId);
    this.getRoomById(this.selectedRoomTypeId);
  }

  calculateDays() {
    const arrivalDate = new Date(this.booking.checkin_date);
    const departureDate = new Date(this.booking.checkout_date);

    if (arrivalDate && departureDate) {
      const timeDifference = departureDate.getTime() - arrivalDate.getTime();
      this.dateCount = Math.ceil(timeDifference / (1000 * 3600 * 24)) + 1;
      console.log(this.dateCount);
      this.daycount = this.dateCount;
      this.calculateTotalPrice();
      if (this.dateCount < 1) {
        alert('Departure date must be on or after arrival date.');
        return;
      }
      // Recalculate after setting day count
    } else {
      alert('Please enter valid dates.');
    }
  }


  getRoomById(room_Id: any) {
    this.roomService.getRoomByID(room_Id).subscribe((response: any) => {
      this.roomList = response;
      console.log(this.roomList.rId);
      this.calculateDays();
    })
  }

  roomdetails() {
    this.roomService.roomdetails().subscribe((response: any) => {
      this.room = response;
      console.log(this.room);
    });
  }
  calculateTotalPrice() {

    console.log(this.roomList);
    this.totalPrice = this.roomList.room_price * this.daycount;
    console.log(this.roomList.room_price);
    console.log(this.daycount);
    console.log(this.totalPrice);
  }
  logOut() {
    this.route.navigate(['/welcomepage'])
  }
}