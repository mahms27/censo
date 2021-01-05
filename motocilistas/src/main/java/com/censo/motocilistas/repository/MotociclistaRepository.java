package com.censo.motocilistas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.censo.motocilistas.model.Motociclista;
import com.censo.motocilistas.model.OtrosDatos;

public interface MotociclistaRepository extends JpaRepository<Motociclista, Long>{
	
	@Query(value = "SELECT * FROM censo.motociclista m  JOIN censo.otrosdatos o on m.codigo = o.codigo  where m.codigo =?1", nativeQuery = true)
	Motociclista getMotociclista(Integer id);
	
	@Query(value = "SELECT new package.DeadlineType(*)  FROM censo.otrosdatos o  where o.codigo =?1", nativeQuery = true)
	OtrosDatos getOtrosDatosMotociclista(Integer id);

}
