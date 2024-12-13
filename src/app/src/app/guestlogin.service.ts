import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class GuestloginService {
  url = "http://localhost:8085/api/user/login"

  constructor(private httpClient: HttpClient) { }

  userLogin(user:any){
    return this.httpClient.post(`${this.url}`, user);
  }
}