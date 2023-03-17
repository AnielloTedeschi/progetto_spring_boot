package it.gestionale.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.gestionale.web.service.EntrateService;
import it.gestionale.web.service.UsciteService;

@Controller
@RequestMapping("/con")
public class ContabileController {
	@Autowired
	private EntrateService entrateSer;
	@Autowired
	private UsciteService usciteSer;
	@GetMapping("/homePage")
	public String homePage(ModelMap mm) {
		mm.addAttribute("navBar" , "nav/navCon.ftl");
		
		mm.addAttribute("mainHome", "main/mainHom.ftl");
		
		return "home";
		}
	
	
	@GetMapping("/gesBil")
	public String gestioneBilancio(ModelMap mm) {
		mm.addAttribute("navBar" , "nav/navCon.ftl");
		
		mm.addAttribute("mainHome", "main/mainBil.ftl");
		mm.addAttribute("listaEntrate" , entrateSer.getAll());
		mm.addAttribute("listaUscite", usciteSer.getAll());
		return "home";
		}
	
}
