package it.gestionale.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import it.gestionale.web.model.Dipendente;


@Controller
public class AutenticazioneController {
	
	
	@PostMapping("/home")
	public ModelAndView home(@ModelAttribute("datiDip") Dipendente dip, ModelMap mm  ) {
		if (dip.getRuolo().equals("amministratore") ) {
		mm.addAttribute("navBar" , "nav/navAdm.ftl");
		
		
		} else if (dip.getRuolo().equals("contabile"))  {
			mm.addAttribute("navBar" , "nav/navCon.ftl");
			} else if ( dip.getRuolo().equals("receptionist")) {
			mm.addAttribute("navBar" , "nav/navRec.ftl");
			
			
		} else {
			
		}
		mm.addAttribute("mainHome" , "main/mainHom.ftl");
		
		
		return new ModelAndView("home", "datiDip", dip);
}
	
	@GetMapping("/login")
	public ModelAndView  Login() {
	return new ModelAndView  ("login", "datiDip", new Dipendente());
}
	
	
}
