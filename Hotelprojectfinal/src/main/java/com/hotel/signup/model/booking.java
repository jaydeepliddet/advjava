package com.hotel.signup.model;

public class booking {

	private String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	public int getStay() {
		return stay;
	}
	public void setStay(int stay) {
		this.stay = stay;
	}
	public int getGuest() {
		return guest;
	}
	public void setGuest(int guest) {
		this.guest = guest;
	}
	private String date;
	@Override
	public String toString() {
		return "booking [username=" + username + ", date=" + date + ", location=" + location + ", hotel=" + hotel
				+ ", stay=" + stay + ", guest=" + guest + "]";
	}
	private String location;
	private String hotel;
	private int stay;
	private int guest;


}
