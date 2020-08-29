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
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.CreateSociety;
import com.example.demo.service.CreateSocietyService;

@RestController
public class CreateSocietyController {

	@Autowired
	private CreateSocietyService createSocietyService; 
	
	@PostMapping(value = "/saveCreateSocietyData" , headers = "Accept=application/json")
	public ResponseEntity<CreateSociety> saveDataOfCreateSociety(@Valid @RequestBody CreateSociety createSociety) {
		CreateSociety saveData = createSocietyService.saveCreateSocietyData(createSociety);
		return new ResponseEntity<CreateSociety>(saveData, HttpStatus.CREATED);	
	}	
	
	@GetMapping(value = "/getCreateSocietyDataById/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Optional<CreateSociety>> getDataOfCreateSocietyById(@PathVariable("id") Long id){
		Optional<CreateSociety> getDataById = createSocietyService.getCreateSocietyDataById(id);
		return new ResponseEntity<Optional<CreateSociety>>(getDataById, HttpStatus.FOUND);
	}
	
	@GetMapping(value = "/getAllCreateSocietyData", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CreateSociety>> getAllDataOfCreateSociety(){
		List<CreateSociety> getAllData = createSocietyService.getAllCreateSocietyData();
		return new ResponseEntity<List<CreateSociety>>(getAllData, HttpStatus.FOUND);
	}
	
	@PutMapping(value = "/updateCreateSocietyData" , consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CreateSociety> updateDataOfCreateSociety(@Valid @RequestBody CreateSociety createSociety) {
		CreateSociety updateData = createSocietyService.updateCreateSocietyData(createSociety);
		return new ResponseEntity<CreateSociety>(updateData, HttpStatus.ACCEPTED);	
	}
	
	@DeleteMapping(value = "/deleteCreateSocietyDataById/{id}")
	public ResponseEntity<CreateSociety> deleteDataOfCreateSocietyById(@PathVariable("id") Long id){
		createSocietyService.deleteCreateSocietyDataById(id);
		return new ResponseEntity<CreateSociety>(HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/deleteCreateSocietyData")
	public ResponseEntity<Void> deleteAllDataOfCreateSociety() {
		createSocietyService.deleteAllCreateSocietyData();
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	
}
