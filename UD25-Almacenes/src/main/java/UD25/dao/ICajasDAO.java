package UD25.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import UD25.dto.Cajas;

public interface ICajasDAO extends JpaRepository<Cajas, Long>{

	
	public List<Cajas> findByContenido(String Contenido);
}
