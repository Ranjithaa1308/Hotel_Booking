package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Room")

public class Room {

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "hotel_id", nullable = false)
	private Hotel hotel;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "room_id")
	private int rId;

	@Column(name = "room_type", length = 50)
	private String room_type;

	@Column(name = "room_price")
	private int room_price;

	@Column(name = "avaliability_status", length = 50)
	private String avaliability_status;

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public int getrId() {
		return rId;
	}

	public void setrId(int rId) {
		this.rId = rId;
	}

	public String getRoom_type() {
		return room_type;
	}

	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}

	public int getRoom_price() {
		return room_price;
	}

	public void setRoom_price(int room_price) {
		this.room_price = room_price;
	}

	public String getAvaliability_status() {
		return avaliability_status;
	}

	public void setAvaliability_status(String avaliability_status) {
		this.avaliability_status = avaliability_status;
	}

	@Override
	public String toString() {
		return "Room [hotel=" + hotel + ", rId=" + rId + ", room_type=" + room_type + ", room_price=" + room_price
				+ ", avaliability_status=" + avaliability_status + "]";
	}
}