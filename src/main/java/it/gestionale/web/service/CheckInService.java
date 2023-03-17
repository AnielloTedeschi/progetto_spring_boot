package it.gestionale.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.gestionale.web.model.CheckIn;
import it.gestionale.web.repository.CheckInRepository;
import it.gestionale.web.repository.PrenotazioneRepository;

@Service
public class CheckInService {

	@Autowired
	private PrenotazioneRepository prenotazioneRepo;
	@Autowired
	private CheckInRepository CheckInRepo;
	public List<CheckIn> getAll() {
		List<CheckIn> checkIns= new ArrayList<>();
	Iterable<CheckIn> iteCheckIn=	CheckInRepo. findAll();
		iteCheckIn.forEach(checkIns::add);
		return checkIns; 
	}


public void add(CheckIn che) {
	CheckInRepo.save(che);
}
}
