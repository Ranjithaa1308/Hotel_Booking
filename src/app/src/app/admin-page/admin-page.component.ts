import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin-page',
  templateUrl: './admin-page.component.html',
  styleUrl: './admin-page.component.css',
})
export class AdminPageComponent  {
logOut() {
  this.route.navigate(['/welcomepage'])
}
  
  constructor(private route :Router) { }
  
  ngOnInit(): void {
  }
  addhotel()
{
  this.route.navigate(['/add-hotel'])
}
displayHotel()
{
  this.route.navigate(['/displayAdminHotel'])
}
}