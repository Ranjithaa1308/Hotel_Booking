package com.example.demo.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bankserver {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	
	@Column (name="nameoncard",length=30)
	private String nameOnCard;

	@Column(unique = true)
	private Long cCardnumber;
	
	@Column(unique = true)
	private Integer cCvvnumber;
	
	/*
	 * @Column(unique = true) private String cUpi;
	 */
	
	private String expiryDate;

	public Bankserver() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Bankserver(Integer id, String nameOnCard, Long cCardnumber, Integer cCvvnumber, String expiryDate) {
		super();
		this.id = id;
		this.nameOnCard = nameOnCard;
		this.cCardnumber = cCardnumber;
		this.cCvvnumber = cCvvnumber;
		this.expiryDate = expiryDate;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getcCardnumber() {
		return cCardnumber;
	}

	public void setcCardnumber(Long cCardnumber) {
		this.cCardnumber = cCardnumber;
	}

	public Integer getcCvvnumber() {
		return cCvvnumber;
	}

	public void setcCvvnumber(Integer cCvvnumber) {
		this.cCvvnumber = cCvvnumber;
	}

	/*
	 * public String getcUpi() { return cUpi; }
	 * 
	 * public void setcUpi(String cUpi) { this.cUpi = cUpi; }
	 */

	

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}


	@Override
	public String toString() {
		return "Bankserver [id=" + id + ", nameOnCard=" + nameOnCard + ", cCardnumber=" + cCardnumber + ", cCvvnumber="
				+ cCvvnumber + ", expiryDate=" + expiryDate + "]";
	}

	
}