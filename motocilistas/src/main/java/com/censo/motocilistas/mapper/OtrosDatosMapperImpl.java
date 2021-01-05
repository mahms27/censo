package com.censo.motocilistas.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.censo.motocilistas.dto.OtrosDatosDTO;
import com.censo.motocilistas.model.OtrosDatos;

@Service
public class OtrosDatosMapperImpl implements OtrosDatosMapper{

	@Override
	public OtrosDatosDTO convertToDto(OtrosDatos o) {
		OtrosDatosDTO pDto  = null;
		if(o != null) {
			ModelMapper modelMapper = new ModelMapper();
			pDto = modelMapper.map(o, OtrosDatosDTO.class);
		}
		return pDto;
	}


}
