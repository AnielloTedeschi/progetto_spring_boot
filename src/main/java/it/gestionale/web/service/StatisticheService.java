package it.gestionale.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.gestionale.web.model.Statistiche;
import it.gestionale.web.repository.StatisticheRepository;

@Service
public class StatisticheService {

	@Autowired
	private StatisticheRepository statisticheRepo;
	public List<Statistiche> getAll() {
		List<Statistiche> statistiche = new ArrayList<>();
	Iterable<Statistiche> iteStatistiche=	statisticheRepo. findAll();
		iteStatistiche.forEach(statistiche::add);
		return statistiche; 
	}


}
