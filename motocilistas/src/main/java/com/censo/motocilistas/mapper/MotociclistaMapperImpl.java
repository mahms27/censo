package com.censo.motocilistas.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.censo.motocilistas.dto.MotociclistaDTO;
import com.censo.motocilistas.model.Motociclista;

@Service
public class MotociclistaMapperImpl implements MotociclistaMapper{

	@Override
	public MotociclistaDTO convertToDto(Motociclista m) {
		MotociclistaDTO pDto  = null;
		if(m != null) {
			ModelMapper modelMapper = new ModelMapper();
			pDto = modelMapper.map(m, MotociclistaDTO.class);
		}
		return pDto;
	}

}
