package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Hotel")

public class Hotel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hId;
	
	@Column(name = "hotel_name", length = 50)
	private String hname;

	@Column(name = "hotel_address")
	private String haddress;

	@Column(name = "hotel_city")
	private String hcity;
	
	@Column(name = "hotel_contact")
	private String hcontact;
	 
	@Column(name = "hotel_description",length=1000)
	private String hdescription;
	
	@Column(name = "hotel_ratings")
	private String hratings;

	@Column(name = "hotel_image" ,columnDefinition="TEXT")
	private String himage;
	
	 @OneToMany(mappedBy = "hotel")
	private List<Room> room;

	public int gethId() {
		return hId;
	}

	public void sethId(int hId) {
		this.hId = hId;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public String getHaddress() {
		return haddress;
	}

	public void setHaddress(String haddress) {
		this.haddress = haddress;
	}

	public String getHcity() {
		return hcity;
	}

	public void setHcity(String hcity) {
		this.hcity = hcity;
	}

	public String getHcontact() {
		return hcontact;
	}

	public void setHcontact(String hcontact) {
		this.hcontact = hcontact;
	}

	public String getHdescription() {
		return hdescription;
	}

	public void setHdescription(String hdescription) {
		this.hdescription = hdescription;
	}

	public String getHratings() {
		return hratings;
	}

	public void setHratings(String hratings) {
		this.hratings = hratings;
	}

	public String getHimage() {
		return himage;
	}

	public void setHimage(String himage) {
		this.himage = himage;
	}

	public List<Room> getRoom() {
		return room;
	}

	public void setRoom(List<Room> room) {
		this.room = room;	
	}

	@Override
	public String toString() {
		return "Hotel [hId=" + hId + ", hname=" + hname + ", haddress=" + haddress + ", hcity=" + hcity + ", hcontact="
				+ hcontact + ", hdescription=" + hdescription + ", hratings=" + hratings + ", himage=" + himage
				+ ", room=" + room + "]";
	}
}