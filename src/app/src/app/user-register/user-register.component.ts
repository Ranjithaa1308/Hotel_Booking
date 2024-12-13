import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../user.service'
import { User } from '../user';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-user-register',
  templateUrl: './user-register.component.html',
  styleUrl: './user-register.component.css',
  standalone: true,
  imports: [FormsModule, CommonModule]
})
export class UserRegisterComponent implements OnInit {

  user = new User(0, "", "", "");

  constructor(private userService: UserService, private router: Router) { }
  ngOnInit(): void { }
  userLogin() {
    this.router.navigate(['/guestlogin'])
  }
  Signup() {
    this.userService.userSignUp(this.user).subscribe(
      (data: any) => {
        alert("Signup successful");
      }
    )
  }
  goBack()
  {
    this.router.navigate(['welcomepage']);
  }
}