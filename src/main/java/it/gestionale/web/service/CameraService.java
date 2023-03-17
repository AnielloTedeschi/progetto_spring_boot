package it.gestionale.web.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.gestionale.web.model.Camera;
import it.gestionale.web.repository.CameraRepository;

@Service
public class CameraService {
@Autowired
	private CameraRepository repo;
public List<Camera> getAll(){
	List<Camera> camere = new ArrayList<>();
Iterable<Camera> iteCamera =	repo.findAll();
	iteCamera.forEach(camere::add);
	return camere; 
}
public List<Camera> getAllDisponibili() {
	List<Camera> camere = getAll();
	return camere.stream().filter(camera -> camera.getDisponibile() == true).collect(Collectors.toList());  
}
}
