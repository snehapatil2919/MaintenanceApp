package com.example.demo.model;

public class CreateRandomNumber {

	public static String generateCode()  
    {
		int randomPin =(int) (Math.random()*900000)+100000; // from 100000 to 900000 it will generate otp
        String otp  = String.valueOf(randomPin); 
        return otp;
    }
	
}
