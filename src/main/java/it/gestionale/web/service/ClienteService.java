package it.gestionale.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.gestionale.web.model.Cliente;
import it.gestionale.web.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepo;
	
	public List<Cliente> getAll() {
		List<Cliente> clienti = new ArrayList<>();
	Iterable<Cliente> iteCliente=	clienteRepo. findAll();
		iteCliente.forEach(clienti::add);
		return clienti; 
	}
public void add(Cliente cli) {
	clienteRepo.save(cli);
}

	
}
