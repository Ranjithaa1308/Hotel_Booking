package com.example.demo.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Booking")

public class Booking {

	@Id
	@Column(name = "booking_Id")
	private int bookingId;

	@Column(name = "customer_name", length = 50)
	private String cname;

	@Column(name = "customer_address")
	private String caddress;

	@Column(name = "customer_contact")
	private String ccontact;

	@Column(name = "checkin_date")
	private LocalDate checkin;

	@Column(name = "checkout_date")
	private LocalDate checkout;

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	public String getCcontact() {
		return ccontact;
	}

	public void setCcontact(String ccontact) {
		this.ccontact = ccontact;
	}

	public LocalDate getCarrival_date() {
		return checkin;
	}

	public void setCarrival_date(LocalDate checkin) {
		this.checkin = checkin;
	}

	public LocalDate getCdeparture_date() {
		return checkout;
	}

	public void setCdeparture_date(LocalDate checkout) {
		this.checkout = checkout;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", cname=" + cname + ", caddress=" + caddress + ", ccontact="
				+ ccontact + ", checkin=" + checkin + ", checkout=" + checkout + "]";
	}
	
	
}