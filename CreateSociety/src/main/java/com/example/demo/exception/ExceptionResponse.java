package com.example.demo.exception;

import java.util.Date;

public class ExceptionResponse {

	private Date timestamp;
	private String message;
	private String description;
	
	public ExceptionResponse() {
		// TODO Auto-generated constructor stub
	}

	public ExceptionResponse(Date timestamp, String message, String description) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.description = description;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDescription() {
		return description;
	}

}
