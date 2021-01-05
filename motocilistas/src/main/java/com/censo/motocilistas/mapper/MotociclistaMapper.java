package com.censo.motocilistas.mapper;

import com.censo.motocilistas.dto.MotociclistaDTO;
import com.censo.motocilistas.model.Motociclista;

public interface MotociclistaMapper {
	
	MotociclistaDTO convertToDto(Motociclista m);

}
