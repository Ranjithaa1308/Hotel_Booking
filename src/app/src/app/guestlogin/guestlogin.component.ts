import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { GuestloginService } from '../guestlogin.service';
import { User } from '../guestlogin';

@Component({
  selector: 'app-guestlogin',
  templateUrl: './guestlogin.component.html',
  styleUrl: './guestlogin.component.css',
  standalone: true,
  imports: [FormsModule, CommonModule]
})
export class GuestloginComponent implements OnInit {

  user = new User(0, "", "");
  userId:any;
  name:any;
  email: any;
  password: any;
  constructor(private guestloginService: GuestloginService, private router: Router) { }

  ngOnInit(): void { }


  userLogin() {
    this.guestloginService.userLogin(this.user).subscribe(
      (response: any) => {
        if (response != null) {
          this.user = response;
          this.userId = response.userId;
          this.name = response.name;
          this.router.navigate(['displayhotel', this.userId, this.name]);
        }
        else {
          alert("Login Failed " + response);
        }
      }, (error) => {
        alert('an error occurred during login');
      }
    );
  }
  goBack()
  {
    this.router.navigate(['user-register']);
  }
}