package com.censo.motocilistas.service;

import com.censo.motocilistas.dto.MotociclistaDTO;
import com.censo.motocilistas.dto.OtrosDatosDTO;


public interface MotociclistaService {
	
	MotociclistaDTO getMotociclista(Integer id);
	
	OtrosDatosDTO getOtrosDatosMotociclista(Integer id);

}
