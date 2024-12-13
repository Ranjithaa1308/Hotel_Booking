import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BookingService {
  booking(booking: { bookingId: BigInteger; 
    cname: string; 
    caddress: string; 
    ccontact: string; 
    carrival_date: string; 
    cdeparture_date: string; 
  }) { }

  constructor(private http: HttpClient) { }

  getBookings() {
    return this.http.get('http://localhost:8085/api/booking/');
  }

  payment(payment: any) {
    return this.http.post('http://localhost:8085/api/payment/', payment);
  }
}