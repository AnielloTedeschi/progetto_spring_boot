package it.gestionale.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.gestionale.web.service.CameraService;
import it.gestionale.web.service.ClienteService;
import it.gestionale.web.service.DipendenteService;
import it.gestionale.web.service.EntrateService;
import it.gestionale.web.service.PrenotazioneService;
import it.gestionale.web.service.StatisticheService;
import it.gestionale.web.service.UsciteService;
 
@Controller
@RequestMapping("/adm")
public class AmministratoreController {
	@Autowired
	private CameraService cameraSer;
	@Autowired
	private PrenotazioneService prenotazioneSer; 
@Autowired
private DipendenteService dipendenteSer;	
@Autowired
private ClienteService clienteSer; 
@Autowired
private EntrateService entrateSer;
@Autowired
private UsciteService usciteSer;
@Autowired
private StatisticheService statisticheSer;  
@GetMapping("/homePage")
	public String homePage(ModelMap mm) {
		mm.addAttribute("navBar" , "nav/navAdm.ftl");
		
		mm.addAttribute("mainHome", "main/mainHom.ftl");
		
		return "home";
		}
		@GetMapping("/check-in")
	public String checkIn(ModelMap mm) {
		mm.addAttribute("navBar" , "nav/navAdm.ftl");
		
		mm.addAttribute("mainHome", "main/mainChe.ftl");
		
		mm.addAttribute("listaPrenotazioni", prenotazioneSer.getAll());
		
		return "home";
		}
		@GetMapping("/prenotazioni")
		public String prenotazioni(ModelMap mm) {
			mm.addAttribute("navBar" , "nav/navAdm.ftl");
			
			mm.addAttribute("mainHome", "main/mainPre.ftl");
			mm.addAttribute("listaCamere", cameraSer.getAllDisponibili());
			return "home";
			}
			
		@GetMapping("/gesDip")
		public String gestioneDipendenti(ModelMap mm) {
			mm.addAttribute("navBar" , "nav/navAdm.ftl");
			
			mm.addAttribute("mainHome", "main/mainDip.ftl");
			mm.addAttribute("listaDipendenti", dipendenteSer.getAll());
			return "home";
			}
		@GetMapping("/gesCli")
		public String gestioneClienti(ModelMap mm) {
			mm.addAttribute("navBar" , "nav/navAdm.ftl");
			
			mm.addAttribute("mainHome", "main/mainCli.ftl");
			mm.addAttribute("listaClienti", clienteSer.getAll());
			return "home";
			}
		@GetMapping("/gesBil")
		public String gestioneBilancio(ModelMap mm) {
			mm.addAttribute("navBar" , "nav/navAdm.ftl");
			
			mm.addAttribute("mainHome", "main/mainBil.ftl");
			mm.addAttribute("listaEntrate" , entrateSer.getAll());
			mm.addAttribute("listaUscite", usciteSer.getAll());
			return "home";
			}
		@GetMapping("/statistiche")
		public String statistiche(ModelMap mm) {
			mm.addAttribute("navBar" , "nav/navAdm.ftl");
			
			mm.addAttribute("mainHome", "main/mainSta.ftl");
			
			mm.addAttribute("listaStatistiche", statisticheSer.getAll());
			return "home";
			}

}
