package it.gestionale.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import it.gestionale.web.model.Entrate;
import it.gestionale.web.model.Uscite;
import it.gestionale.web.service.EntrateService;
import it.gestionale.web.service.UsciteService;

@Controller
@RequestMapping("/bilancio")
public class BilancioController {
@Autowired
private EntrateService entrateSer;
@Autowired
private UsciteService usciteSer;
@PostMapping ("/entrate/add")
@ResponseBody
public String entrateAdd(@ModelAttribute ("datiEntrate") Entrate ent) {
	entrateSer.add(ent);
	return"entrata inserita con successo";
}
@PostMapping ("/uscite/add")
@ResponseBody
public String  usciteAdd(@ModelAttribute ("datiUscite") Uscite usc) {
	usciteSer.add(usc);
return "operazione effettuata";
}


}
