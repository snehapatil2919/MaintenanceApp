package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Complaint;
import com.example.demo.service.ComplaintService;

@RestController
public class ComplaintController {

	@Autowired
	private ComplaintService complaintService;
	
	@PostMapping(value = "/saveComplaintData" , headers = "Accept=application/json")
	public ResponseEntity<Complaint> saveDataOfComplaint(@Valid @RequestBody Complaint complaint){
		Complaint saveComplaintData = complaintService.saveComplaintData(complaint);
		return new ResponseEntity<Complaint>(saveComplaintData, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/getComplaintDataById/{id}" , produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Optional<Complaint>> getDataOfComplaintById(@PathVariable("id") Long id){
		Optional<Complaint> gettDataById = complaintService.getComplaintDataById(id);
		return new ResponseEntity<Optional<Complaint>>(gettDataById, HttpStatus.FOUND);
	}
	
	@GetMapping(value = "/getAllComplaints" , produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Complaint>> getAllDataOfComplaint(){
		List<Complaint> getAllData = complaintService.getAllComplaintData();
		return new ResponseEntity<List<Complaint>>(getAllData, HttpStatus.FOUND);
	}
	
	@PutMapping(value = "/updateComplaints" , consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Complaint> updateDataOfComplaint(@Valid @RequestBody Complaint complaint){
		Complaint updateComplaintData = complaintService.updateComplaintData(complaint);
		return new ResponseEntity<Complaint>(updateComplaintData, HttpStatus.CREATED);
	}
	
	@DeleteMapping(value = "/deleteComplaintsById/{id}")
	public ResponseEntity<Optional<Complaint>> deleteComplaintById(@PathVariable("id") Long id){
		Optional<Complaint> deleteComplaintById = complaintService.deleteComplaintById(id);
		return new ResponseEntity<Optional<Complaint>>(deleteComplaintById, HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/deleteAllComplaints")
	public ResponseEntity<Void> deleteAllComplaintData(){
		complaintService.deleteAllComplaintData();
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
