import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  url = "http://localhost:8085/api/user/"

  constructor(private httpClient: HttpClient) { }
  
  userSignUp(user: any) {
    return this.httpClient.post(`${this.url}`, user);
  }
}