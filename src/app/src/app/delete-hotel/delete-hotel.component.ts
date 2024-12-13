
import { Component } from '@angular/core';
import { HotelService } from '../hotel.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-delete-hotel',
  templateUrl: './delete-hotel.component.html',
  styleUrls: ['./delete-hotel.component.css'],
  standalone:true,
  imports:[FormsModule,CommonModule]
})
export class DeleteHotelComponent {
  hId: number = 0;

  constructor(private deleteHotelService: HotelService) { }

  deleteHotel() {
    if (this.hId > 0) {
      this.deleteHotelService.deleteHotelById(this.hId).subscribe(
        (data: any) => {
          alert("Hotel deleted successfully");
        },
        (error: any) => {
          alert("Error deleting hotel: " + error.message);
        }
      );
    } else {
      alert("Please enter a valid Hotel ID");
    }
  }
}