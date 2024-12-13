import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class AdminHomeService {

  url = "http://localhost:8085/api/admin/login"

  constructor(private httpClient: HttpClient) { }

  adminlogin(admin: any) {
    return this.httpClient.post(`${this.url}`, admin);
  }
}