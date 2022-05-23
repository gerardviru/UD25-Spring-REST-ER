package UD25.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UD25.dao.IAlmacenesDAO;
import UD25.dto.Almacenes;

@Service
public class AlmacenesServiceImpl implements IAlmacenesService{

	@Autowired
	IAlmacenesDAO ialmacenesDAO;
	
	@Override
	public List<Almacenes> listarAlmacenes() {
		
		return ialmacenesDAO.findAll();
	}

	@Override
	public Almacenes guardarAlmacenes(Almacenes almacen) {
		
		return ialmacenesDAO.save(almacen);
	}
	
	@Override
	public List <Almacenes> listarAlmacenesLugar(String Lugar) {
		
		return ialmacenesDAO.findByLugar(Lugar);
	}

	@Override
	public Almacenes almacenes_ID(Long id) {
		
		return ialmacenesDAO.findById(id).get();
	}

	@Override
	public Almacenes actualizarAlmacenes(Almacenes almacen) {
		
		return ialmacenesDAO.save(almacen);
	}

	@Override
	public void eliminarAlmacenes(Long id) {
		ialmacenesDAO.deleteById(id);
		
	}

}
