package UD25.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import UD25.dto.Almacenes;
import UD25.service.AlmacenesServiceImpl;

@RestController
@RequestMapping("/api")
public class AlmacenesController {

	@Autowired
	AlmacenesServiceImpl almacenesServiceImpl;
	
	@GetMapping("/almacenes")
	public List<Almacenes> listarAlmacenes() {
		
		return almacenesServiceImpl.listarAlmacenes();
	}
	
	@PostMapping("/almacenes")
	public Almacenes guardarAlmacenes(@RequestBody Almacenes almacenes) {
		
		return almacenesServiceImpl.guardarAlmacenes(almacenes);
	}
	
	@GetMapping("/almacenes/lugar/{lugar}")
	public List<Almacenes> listarAlmacenesLugar(@PathVariable(name="lugar")String lugar){
		
		return almacenesServiceImpl.listarAlmacenesLugar(lugar);
	}
	
	@GetMapping("/almacenes/{id}")
	public Almacenes almacenes_ID (@PathVariable(name="id") Long id) {
		
		return almacenesServiceImpl.almacenes_ID(id);
		
	}
		
	@PutMapping("/almacenes/{id}")
	public Almacenes actualizarAlmacenes(@PathVariable(name="id")Long id,@RequestBody Almacenes almacenes) {
			
		Almacenes alm_seleccionado= new Almacenes();
		Almacenes alm_actualizado= new Almacenes();
			
		alm_seleccionado= almacenesServiceImpl.almacenes_ID(id);
			
		alm_seleccionado.setLugar(almacenes.getLugar());
			
		alm_actualizado = almacenesServiceImpl.actualizarAlmacenes(alm_seleccionado);
			
		return alm_actualizado;
		}
	
	@DeleteMapping("/almacenes/{id}")
	public void eliminarAlmacenes(@PathVariable(name="id")Long id) {
		almacenesServiceImpl.eliminarAlmacenes(id);
	}
	
}

