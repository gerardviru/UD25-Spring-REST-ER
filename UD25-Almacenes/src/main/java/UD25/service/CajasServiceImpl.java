package UD25.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UD25.dao.ICajasDAO;
import UD25.dto.Cajas;

@Service
public class CajasServiceImpl implements ICajasService{

	@Autowired
	ICajasDAO icajasDAO;
	
	@Override
	public List<Cajas> listarCajas() {
		
		return icajasDAO.findAll();
	}

	@Override
	public Cajas guardarCajas(Cajas caja) {
		
		return icajasDAO.save(caja);
	}
	
	@Override
	public List<Cajas> listarCajasContenido(String Contenido) {
		
		return icajasDAO.findByContenido(Contenido);
	}
	
	@Override
	public Cajas cajas_ID(String num_ref) {
		
		return icajasDAO.findById(num_ref).get();
	}

	@Override
	public Cajas actualizarCajas(Cajas caja) {
		
		return icajasDAO.save(caja);
	}

	@Override
	public void eliminarCajas(String num_ref) {
		icajasDAO.deleteById(num_ref);
		
	}

	

}
