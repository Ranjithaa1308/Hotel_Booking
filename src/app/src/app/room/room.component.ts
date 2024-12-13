import { Component, OnInit } from '@angular/core';
import { Room } from '../room';
import { RoomService } from '../room.service';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';

@Component({
  selector: 'app-room',
  templateUrl: './room.component.html',
  styleUrl: './room.component.css',
  standalone: true,
  imports: [FormsModule, CommonModule]
})
export class RoomComponent implements OnInit{
  
  roomdetails() { }
  // room = new Room(0, "", 0, "");
  
  room: any;
  totalPrice:any;
  constructor(private roomService: RoomService, private router: Router) { }
  
  ngOnInit(): void{
    this.roomdetails();
   }
  
  bookingbtn() {
    this.router.navigate(['/booking']);
  }
}