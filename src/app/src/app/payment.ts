export class Payment {
   paymentId: number;
   totalPrice: number;
   nameOnCard: String;
   cardNumber: String;
   cvv: number;
   expYear: String;


   constructor(paymentId: number,
      totalPrice: number,
      nameOnCard: String,
      cardNumber: String,
      cvv: number,
      expYear: String
      ) {
      this.paymentId = paymentId;
      this.totalPrice = totalPrice;
      this.nameOnCard = nameOnCard;
      this.cardNumber = cardNumber;
      this.cvv = cvv;
      this.expYear = expYear;
      
   }
}