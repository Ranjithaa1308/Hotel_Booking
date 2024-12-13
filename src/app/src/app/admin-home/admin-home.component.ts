import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AdminHomeService } from '../admin-home.service';
import { Admin } from '../admin-home';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-admin-home',
  templateUrl: './admin-home.component.html',
  styleUrl: './admin-home.component.css',
  standalone:true,
  imports:[FormsModule,CommonModule]
})
export class AdminHomeComponent implements OnInit{
  admin = new Admin(0,"","");

  adminName: any;
  adminPassword:any;
  constructor(private adminService: AdminHomeService,private router:Router){}
  
  ngOnInit(): void {}
  adminlogin()
  {
  this.adminService.adminlogin(this.admin).subscribe(
    (response:any)=>{
      if(response!=null){
      this.router.navigate(['/admin-page']);
      }
      else{
      alert("Login Failed "+response);
      }
    },(error) =>{
      alert('an error occurred during login');
    }
  );
  }
  goBack()
  {
    this.router.navigate(['welcomepage']);
  }
}