export class Booking {
    bookingId: number;
    cname: string;
    caddress: string;
    ccontact:string;
    checkin_date: string;
    checkout_date: string;
  
    constructor(bookingId: number,
      cname: string,
      caddress: string,
      ccontact:string,
      checkin_date: string,
      checkout_date: string) {
      this.bookingId = bookingId;
      this.cname = cname;
      this.caddress = caddress;
      this.ccontact=ccontact;
      this.checkin_date = checkin_date;
      this.checkout_date = checkout_date;
    }
  }