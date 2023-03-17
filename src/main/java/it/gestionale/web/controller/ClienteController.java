package it.gestionale.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import it.gestionale.web.model.Cliente;
import it.gestionale.web.service.ClienteService;
@Controller
@RequestMapping("/cliente")
public class ClienteController {
@Autowired
private ClienteService clienteSer;
	@PostMapping	("/add")
	@ResponseBody
	public String add(@ModelAttribute("datiCliente") Cliente cli) {
		clienteSer.add(cli);
		
		return "inserito cliente";
	}

}
