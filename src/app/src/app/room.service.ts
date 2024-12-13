import { Injectable } from '@angular/core';
import { Room } from './room';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class RoomService {
  url = "http://localhost:8085/api/room/"
  url1 = "http://localhost:8085/api/room"

  getRoomByID(rId: any) {
    return this.httpClient.get(`${this.url1}/${rId}`);
  }

  constructor(private httpClient: HttpClient) { }
  roomdetails() {
    return this.httpClient.get(`${this.url}`);
  }
}