package UD25.service;

import java.util.List;

import UD25.dto.Almacenes;

public interface IAlmacenesService {

	//Metodos del CRUD
	
	public List<Almacenes> listarAlmacenes();
	
	public Almacenes guardarAlmacenes(Almacenes almacen);
	
	public List<Almacenes> listarAlmacenesLugar(String Lugar);
	
	public Almacenes almacenes_ID(Long id_a);
	
	public Almacenes actualizarAlmacenes(Almacenes almacenes);
	
	public void eliminarAlmacenes(Long id_a);

	
	
}
