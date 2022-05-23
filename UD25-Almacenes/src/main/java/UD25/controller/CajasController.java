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

import UD25.dto.Cajas;
import UD25.service.CajasServiceImpl;

@RestController
@RequestMapping("/api")
public class CajasController {
	
	@Autowired
	CajasServiceImpl cajasServiceImpl;
	
	
	@GetMapping("/cajas")
	public List<Cajas> listarCajas() {
		
		return cajasServiceImpl.listarCajas();
	}
	
	@PostMapping("/cajas")
	public Cajas guardarCajas(@RequestBody Cajas cajas) {
		
		return cajasServiceImpl.guardarCajas(cajas);
	}
	
	@GetMapping("/cajas/contenido/{contenido}")
	public List<Cajas> listarCajasContenido(@PathVariable(name="contenido")String Contenido){
		
		return cajasServiceImpl.listarCajasContenido(Contenido);
	}
	
	@GetMapping("/cajas/{id}")
	public Cajas cajas_ID (@PathVariable(name="num_ref") String num_ref) {
		
		Cajas cajas = new Cajas();
		cajas = cajasServiceImpl.cajas_ID(num_ref);
		
		System.out.println("Cajas ID:" + cajas);
		
		return cajas;
	}
		
	@PutMapping("/cajas/{id}")
	public Cajas actualizarCajas(@PathVariable(name="id")String num_ref,@RequestBody Cajas caja) {
			
		Cajas caj_seleccionado= new Cajas();
		Cajas caj_actualizado= new Cajas();
			
		caj_seleccionado= cajasServiceImpl.cajas_ID(num_ref);
			
		caj_seleccionado.setContenido(caja.getContenido());
			
		caj_actualizado = cajasServiceImpl.actualizarCajas(caj_seleccionado);
			
		System.out.println("El almacen actualizado es: "+ caj_actualizado);
			
		return caj_actualizado;
		}
	
	@DeleteMapping("/cajas/{id}")
	public void eliminarCajas(@PathVariable(name="id")String num_ref) {
		cajasServiceImpl.eliminarCajas(num_ref);
	}

}
