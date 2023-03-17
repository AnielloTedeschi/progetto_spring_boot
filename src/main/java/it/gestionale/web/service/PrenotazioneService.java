package it.gestionale.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.gestionale.web.model.Prenotazione;
import it.gestionale.web.repository.PrenotazioneRepository;

@Service
public class PrenotazioneService {

	@Autowired
	private PrenotazioneRepository repo;
	public List<Prenotazione> getAll() {
		List<Prenotazione> prenotazioni = new ArrayList<>();
	Iterable<Prenotazione> itePrenotazione =	repo. findAll();
		itePrenotazione.forEach(prenotazioni::add);
		return prenotazioni; 
	}

public void add( Prenotazione pre) {
	repo.save(pre);
}
}
