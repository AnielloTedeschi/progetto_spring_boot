package it.gestionale.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.gestionale.web.service.CameraService;
import it.gestionale.web.service.ClienteService;
import it.gestionale.web.service.PrenotazioneService;

@Controller
@RequestMapping("/rec")
public class ReceptionistController {
	@Autowired
	private CameraService cameraSer; 
	@Autowired
	private PrenotazioneService prenotazioneSer;
	@Autowired
	private ClienteService clienteSer;
	@GetMapping("/homePage")
	public String homePage(ModelMap mm) {
		mm.addAttribute("navBar" , "nav/navRec.ftl");
		
		mm.addAttribute("mainHome", "main/mainHom.ftl");
		
		return "home";
		}
		@GetMapping("/check-in")
	public String checkIn(ModelMap mm) {
		mm.addAttribute("navBar" , "nav/navRec.ftl");
		
		mm.addAttribute("mainHome", "main/mainChe.ftl");
		mm.addAttribute("listaPrenotazioni", prenotazioneSer.getAll());
		return "home";
		}
		@GetMapping("/prenotazioni")
		public String prenotazioni(ModelMap mm) {
			mm.addAttribute("navBar" , "nav/navRec.ftl");
			
			mm.addAttribute("mainHome", "main/mainPre.ftl");
			mm.addAttribute("listaCamere", cameraSer.getAllDisponibili());
			return "home";
			}
			
		@GetMapping("/gesCli")
		public String gestioneClienti(ModelMap mm) {
			mm.addAttribute("navBar" , "nav/navRec.ftl");
			
			mm.addAttribute("mainHome", "main/mainCli.ftl");
			mm.addAttribute("listaClienti", clienteSer.getAll());
			
			return "home";
			}
	
}
