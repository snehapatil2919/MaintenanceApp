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
public class Complaint {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Long userId;
	
	@NotNull(message = "please enter complaint category..")
	private String complaintCategory;
	
	private String complaintCustomMessage;
	
	private Date dateOfCreation = new Date();
	
	public Complaint() {
		// TODO Auto-generated constructor stub
	}

	public Complaint(Long id, Long userId,
			@NotNull(message = "Please choose complaint type!...") String complaintCategory,
			String complaintCustomMessage, Date dateOfCreation) {
		super();
		this.id = id;
		this.userId = userId;
		this.complaintCategory = complaintCategory;
		this.complaintCustomMessage = complaintCustomMessage;
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

	public String getComplaintCategory() {
		return complaintCategory;
	}

	public void setComplaintCategory(String complaintCategory) {
		this.complaintCategory = complaintCategory;
	}

	public String getComplaintCustomMessage() {
		return complaintCustomMessage;
	}

	public void setComplaintCustomMessage(String complaintCustomMessage) {
		this.complaintCustomMessage = complaintCustomMessage;
	}

	public Date getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	@Override
	public String toString() {
		return "Complaint [id=" + id + ", userId=" + userId + ", complaintCategory=" + complaintCategory
				+ ", complaintCustomMessage=" + complaintCustomMessage + ", dateOfCreation=" + dateOfCreation + "]";
	}
	
}
