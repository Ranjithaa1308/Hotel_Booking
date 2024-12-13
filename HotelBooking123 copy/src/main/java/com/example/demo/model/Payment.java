package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "payment")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long paymentId;

	@Column(name = "total_price")
	private int totalPrice;

	@Column(name = "name_on_card")
	@NotEmpty
	@Size(min = 3, message = "name must contain atleast 3 characters")
	private String nameOnCard;

	@Column(name = "card_number")
	@NotEmpty
	@Size(min = 16, max = 16, message = "cardNumber must contain 16 digits")
	private String cardNumber;

	@Column(name = "exp_year")
	private String expYear;

	@Column(name = "cvv")
	@NotNull
	private int cvv;
	
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;
	
	public long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpYear() {
		return expYear;
	}

	public void setExpYear(String expYear) {
		this.expYear = expYear;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", totalPrice=" + totalPrice + ", nameOnCard=" + nameOnCard
				+ ", cardNumber=" + cardNumber + ", expYear=" + expYear + ", cvv=" + cvv + ", user=" + user + "]";
	}
}