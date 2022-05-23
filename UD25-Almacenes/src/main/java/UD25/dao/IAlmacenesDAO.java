package UD25.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import UD25.dto.Almacenes;

public interface IAlmacenesDAO extends JpaRepository<Almacenes, Long>{

	public List<Almacenes> findByLugar(String Lugar);
}
