package com.example.demo.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class CreateSociety {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Long userId;

	@NotBlank(message = "Society name should not be empty!...")
	private String societyName;

	@NotNull(message = "please enter total number of wings in your society!...")
	private int totalNoOfWings;

	@NotNull(message = "please enter total number of floors in your society!...")
	private int totalNoOfFloors;

	@NotNull(message = "please enter total number of rooms per floor in your society!...")
	private int totalNoOfRoomsPerFloor;

	@NotBlank(message = "Please enter your address!...")
	private String address;

	@NotBlank(message = "Please enter your city!...")
	private String city;

	@NotBlank(message = "Please enter your state!...")
	private String state;

	private String role = "admin";

	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date dateOfCreation = new Date();

	public CreateSociety() {
		
	}

	public CreateSociety(Long id, Long userId,
			@NotBlank(message = "Society name should not be empty!...") String societyName,
			@NotNull(message = "please enter total number of wings in your society!...") int totalNoOfWings,
			@NotNull(message = "please enter total number of floors in your society!...") int totalNoOfFloors,
			@NotNull(message = "please enter total number of rooms per floor in your society!...") int totalNoOfRoomsPerFloor,
			@NotBlank(message = "Please enter your address!...") String address,
			@NotBlank(message = "Please enter your city!...") String city,
			@NotBlank(message = "Please enter your state!...") String state, String role, Date dateOfCreation) {
		super();
		this.id = id;
		this.userId = userId;
		this.societyName = societyName;
		this.totalNoOfWings = totalNoOfWings;
		this.totalNoOfFloors = totalNoOfFloors;
		this.totalNoOfRoomsPerFloor = totalNoOfRoomsPerFloor;
		this.address = address;
		this.city = city;
		this.state = state;
		this.role = role;
		this.dateOfCreation = dateOfCreation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getSocietyName() {
		return societyName;
	}

	public void setSocietyName(String societyName) {
		this.societyName = societyName;
	}

	public int getTotalNoOfWings() {
		return totalNoOfWings;
	}

	public void setTotalNoOfWings(int totalNoOfWings) {
		this.totalNoOfWings = totalNoOfWings;
	}

	public int getTotalNoOfFloors() {
		return totalNoOfFloors;
	}

	public void setTotalNoOfFloors(int totalNoOfFloors) {
		this.totalNoOfFloors = totalNoOfFloors;
	}

	public int getTotalNoOfRoomsPerFloor() {
		return totalNoOfRoomsPerFloor;
	}

	public void setTotalNoOfRoomsPerFloor(int totalNoOfRoomsPerFloor) {
		this.totalNoOfRoomsPerFloor = totalNoOfRoomsPerFloor;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Date getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	@Override
	public String toString() {
		return "CreateSociety [id=" + id + ", userId=" + userId + ", societyName=" + societyName + ", totalNoOfWings="
				+ totalNoOfWings + ", totalNoOfFloors=" + totalNoOfFloors + ", totalNoOfRoomsPerFloor="
				+ totalNoOfRoomsPerFloor + ", address=" + address + ", city=" + city + ", state=" + state + ", role="
				+ role + ", dateOfCreation=" + dateOfCreation + "]";
	}
	
}
