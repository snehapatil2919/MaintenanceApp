package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Complaint {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Long userId;
	
	@NotBlank(message = "Please choose complaint type!...")
	private String complaintCategory;
	
	private String complaintCustomMessage;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date dateOfCreation = new Date();
}
