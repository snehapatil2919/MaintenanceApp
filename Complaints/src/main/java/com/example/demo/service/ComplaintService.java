package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Repository.ComplaintRepository;
import com.example.demo.model.Complaint;
import com.example.demo.service.exception.ComplaintNotFoundException;

@Service
@Transactional
public class ComplaintService {
	
	@Autowired
	private ComplaintRepository complaintRepository;
	
	public Complaint saveComplaintData(Complaint complaint) {
		Complaint saveComplaint = complaintRepository.save(complaint);
		return saveComplaint;
	}
	
	public Optional<Complaint> getComplaintDataById(Long id){
		Optional<Complaint> getById = complaintRepository.findById(id);
		if(!getById.isPresent()) {
			throw new ComplaintNotFoundException("Complaint not found with id :"+id);
		}
		return getById;
	}
	
	public List<Complaint> getAllComplaintData(){
		List<Complaint> findAll = complaintRepository.findAll();
		return findAll;
	}

	public Complaint updateComplaintData(Complaint complaint) {
		Complaint updateComplaint = complaintRepository.save(complaint);
		if(updateComplaint==null) {
			throw new ComplaintNotFoundException("Complaint Not found!..");
		}
		return updateComplaint;
	}
	
	public Optional<Complaint> deleteComplaintById(Long id) {
		Optional<Complaint> deleteById = complaintRepository.findById(id);
		if(!deleteById.isPresent()) {
			throw new ComplaintNotFoundException("Complaint Not found with id :"+id);
		}
		return deleteById;
	}
	
	public void deleteAllComplaintData() {
		complaintRepository.deleteAll();
	}
}
