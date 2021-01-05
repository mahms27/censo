package com.censo.motocilistas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.censo.motocilistas.dto.MotociclistaDTO;
import com.censo.motocilistas.dto.OtrosDatosDTO;
import com.censo.motocilistas.mapper.MotociclistaMapper;
import com.censo.motocilistas.mapper.OtrosDatosMapper;
import com.censo.motocilistas.model.OtrosDatos;
import com.censo.motocilistas.repository.MotociclistaRepository;

@Service
public class MotociclistaServiceImpl  implements MotociclistaService{

	@Autowired
	private MotociclistaRepository repo;
	
	@Autowired
	private MotociclistaMapper mapper;
	
	@Autowired
	private OtrosDatosMapper oMapper;
	
	@Override
	public MotociclistaDTO getMotociclista(Integer id) {
		return mapper.convertToDto(repo.getMotociclista(id));
	}

	@Override
	public OtrosDatosDTO getOtrosDatosMotociclista(Integer id) {
		OtrosDatos o =repo.getOtrosDatosMotociclista(id);
		return oMapper.convertToDto(repo.getOtrosDatosMotociclista(id));
	}

}
