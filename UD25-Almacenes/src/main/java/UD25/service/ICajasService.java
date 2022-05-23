package UD25.service;

import java.util.List;

import UD25.dto.Cajas;


public interface ICajasService {

	public List<Cajas> listarCajas();
	
	public Cajas guardarCajas(Cajas caja);
	
	public List<Cajas> listarCajasContenido(String Contenido);
	
	public Cajas cajas_ID(Long id);
	
	public Cajas actualizarCajas(Cajas caja);
	
	public void eliminarCajas(Long id);

}
