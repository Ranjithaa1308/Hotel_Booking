import { Component, OnInit } from '@angular/core';
import { Payment } from '../payment';
import { ActivatedRoute, Router } from '@angular/router';
import { PaymentService } from '../payment.service';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrl: './payment.component.css',
  standalone: true,
  imports: [FormsModule, CommonModule]
})
export class PaymentComponent implements OnInit {
  payment = new Payment(0, 0, "", "", 0, "");
  totalPrice: any;
  curruserId: any;

  addPayment() {
    console.log("clicked");
    this.paymentService.checkBankDetails(this.payment.cardNumber,this.payment.nameOnCard,this.payment.expYear, this.payment.cvv).subscribe(
      (data:any)=>{
        console.log("data returned")
        console.log(data);
        if(data!=null)
        {
          this.payment.totalPrice=this.totalPrice;
          console.log(this.payment);
          console.log(this.curruserId);
          this.paymentService.addPayment(this.payment,this.curruserId).subscribe(
            (data: any) => {
              console.log(data);
              alert("Payment added succesfully");
              this.route.navigate(['/displayhotel/:userId/:name']);
            }
          )
        }else
        alert("invalid card details");
      }
    )
    
  }

  constructor(private paymentService: PaymentService, private route: Router, private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.curruserId = this.activatedRoute.snapshot.params['userId'];
    this.totalPrice = this.activatedRoute.snapshot.params['totalPrice'];
    /*  this.paymentService.getPaymentByID(this.customerId).subscribe(
        (data:any)=>
        {
          this.payment=data;
        }
      )*/
  }
  logOut() {
    this.route.navigate(['/welcomepage'])
  }
}