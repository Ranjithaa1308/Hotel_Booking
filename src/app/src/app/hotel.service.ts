import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class HotelService {
  url = "http://localhost:8085/api/hotel/"
  constructor(private httpClient: HttpClient) { }
  getAllHotel() {
    return this.httpClient.get(`${this.url}`);
  }

  hotelSignUp(hotel: any) {
    return this.httpClient.post(`${this.url}`, hotel);
  }
  addHotel(hotel: any) {
    return this.httpClient.post(this.url, hotel);
  }

  getHotelById(hotelId: number) {
    return this.httpClient.get(`${this.url}${hotelId}`);
  }

  updateHotel(hotelId: number, hotel: any) {
    return this.httpClient.put(`${this.url}${hotelId}`, hotel);
  }

  deleteHotelById(hotelId: number) {
    return this.httpClient.delete(`${this.url}${hotelId}`);
  }
}