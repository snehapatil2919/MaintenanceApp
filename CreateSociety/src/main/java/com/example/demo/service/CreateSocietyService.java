package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.CreateSociety;
import com.example.demo.repository.CreateSocietyRepository;

@Service
public class CreateSocietyService {

	@Autowired
	private CreateSocietyRepository createSocietyRepository;

	public CreateSociety saveCreateSocietyData(CreateSociety createSociety) {
		CreateSociety save = createSocietyRepository.save(createSociety);
		return save;
	}
	
	public List<CreateSociety> getAllCreateSocietyData(){
		List<CreateSociety> getAllData = createSocietyRepository.findAll();
		return getAllData;
	}

	public CreateSociety updateCreateSocietyData(CreateSociety createSociety) {
		CreateSociety update = createSocietyRepository.save(createSociety);
		return update;
	}

	public void deleteAllCreateSocietyData() {
		createSocietyRepository.deleteAll();
	}
}
