package it.gestionale.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.gestionale.web.model.Uscite;
import it.gestionale.web.repository.UsciteRepository;

@Service
public class UsciteService {

	@Autowired
	private UsciteRepository usciteRepo;
	public List<Uscite> getAll() {
		List<Uscite> uscite = new ArrayList<>();
	Iterable<Uscite> iteUscite=	usciteRepo. findAll();
		iteUscite.forEach(uscite::add);
		return uscite; 
	}
public void add(Uscite usc)
{
	usciteRepo.save(usc);
}
}
