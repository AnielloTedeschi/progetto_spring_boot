package it.gestionale.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import it.gestionale.web.model.Dipendente;
import it.gestionale.web.service.DipendenteService;

@Controller
@RequestMapping("/dipendenti")
public class DipendenteController {
@Autowired
private DipendenteService dipendenteSer;
@PostMapping("/add")
@ResponseBody
public String add( @ModelAttribute ("datiDi") Dipendente dip)  {
	dipendenteSer.add(dip);
return "ok";
}


}
