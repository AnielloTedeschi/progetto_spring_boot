package it.gestionale.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.gestionale.web.model.Dipendente;
import it.gestionale.web.repository.DipendenteRepository;

@Service
public class DipendenteService {

	@Autowired
	private DipendenteRepository dipendenteRepo;
	
	public List<Dipendente> getAll() {
		List<Dipendente> dipendenti= new ArrayList<>();
	Iterable<Dipendente> iteDipendente=	dipendenteRepo. findAll();
		iteDipendente.forEach(dipendenti::add);
		return dipendenti; 
	}
	public void add(Dipendente dip) {
		dipendenteRepo.save(dip);
	}


}
