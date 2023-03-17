package it.gestionale.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import it.gestionale.web.model.CheckIn;
import it.gestionale.web.service.CheckInService;

@Controller
@RequestMapping("/checkIn")
public class CheckInController {
@Autowired
private CheckInService checkInSer;
@PostMapping("/add")
@ResponseBody
public String add (@ModelAttribute("datiCheckIn") CheckIn  che) {
	checkInSer.add(che);
	return "chek-in avvenuto con successo";
}
}
