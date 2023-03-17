package it.gestionale.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.gestionale.web.model.Entrate;
import it.gestionale.web.repository.EntrateRepository;

@Service
public class EntrateService {

	@Autowired
	private EntrateRepository entrateRepo;
	
	public List<Entrate> getAll() {
		List<Entrate> entrate = new ArrayList<>();
	Iterable<Entrate> iteEntrate=	entrateRepo. findAll();
		iteEntrate.forEach(entrate::add);
		return entrate; 
	}

public void add(Entrate ent) {
	entrateRepo.save(ent);
}
}
