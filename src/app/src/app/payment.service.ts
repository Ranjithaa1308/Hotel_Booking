import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PaymentService {
 
  url = "http://localhost:8085/api/payment/";
  url1="http://localhost:8085/api/bankserver";

  constructor(private httpClient: HttpClient) { }

  getPaymentByID(paymentId: any) {
    return this.httpClient.get(`${this.url}${paymentId}`);
  }

  addPayment(payment: any,userId:any) {
    return this.httpClient.post(`${this.url}${userId}`,payment);
  }
  checkBankDetails(cardNumber: String, nameOnCard: String, expYear: String, cvv: number) {
    return this.httpClient.get(`${this.url1}/findbankdetails/${cardNumber}/${nameOnCard}/${expYear}/${cvv}`);
  }
}