package it.gestionale.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import it.gestionale.web.model.Prenotazione;
import it.gestionale.web.service.PrenotazioneService;

@Controller
@RequestMapping("/prenotazione")
public class PrenotazioneController {
@Autowired
	private PrenotazioneService prenotazioneSer; 
@PostMapping	("/add")
@ResponseBody
public String add(@ModelAttribute("datiPrenotazione") Prenotazione pre) {
	prenotazioneSer.add(pre);
	
		return "cioa";
}

}
