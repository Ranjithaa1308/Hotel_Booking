import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrl: './welcome.component.css',
})
export class WelcomeComponent implements OnInit {
  constructor(private route: Router) { }
  ngOnInit(): void { }
  adminLogin() {
    this.route.navigate(['/admin-login'])
  }
  customerSignUp() {
    this.route.navigate(['/user-register'])
  }
  contactUs() {
    this.route.navigate(['/contact-us'])
  }
  aboutUs() {
    this.route.navigate(['/about-us'])
  }
}