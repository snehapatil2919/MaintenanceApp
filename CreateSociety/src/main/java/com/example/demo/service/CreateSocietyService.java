package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.model.CreateRandomNumber;
import com.example.demo.model.CreateSociety;
import com.example.demo.repository.CreateSocietyRepository;

@Service
public class CreateSocietyService {

	@Autowired
	private CreateSocietyRepository createSocietyRepository;

	public CreateSociety saveCreateSocietyData(CreateSociety createSociety) {
		String generateCode = CreateRandomNumber.generateCode();
		createSociety.setCode(generateCode);
		createSociety.setRole("Admin");
		CreateSociety save = createSocietyRepository.save(createSociety);
		return save;
	}

	public Optional<CreateSociety> getCreateSocietyDataById(Long id) {
		Optional<CreateSociety> getById = createSocietyRepository.findById(id);

		if(!getById.isPresent()) {
			throw new UserNotFoundException("User not found with id "+id);
		}
		return getById;
	}

	public List<CreateSociety> getAllCreateSocietyData(){
		List<CreateSociety> getAllData = createSocietyRepository.findAll();
		return getAllData;
	}

	public CreateSociety updateCreateSocietyData(CreateSociety createSociety) {
		CreateSociety update = createSocietyRepository.save(createSociety);

		if(update==null) {
			throw new UserNotFoundException("User not updated");
		}
		return update;
	}

	public void deleteCreateSocietyDataById(Long id) {
		Optional<CreateSociety> deleteById = createSocietyRepository.findById(id);

		if(!deleteById.isPresent()) {
			throw new UserNotFoundException("User not found with id "+id);
		}
		else {
			createSocietyRepository.deleteById(id);
		}
	}

	public void deleteAllCreateSocietyData() {
		createSocietyRepository.deleteAll();
	}
}
