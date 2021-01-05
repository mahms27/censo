package com.censo.motocilistas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.censo.motocilistas.service.MotociclistaService;


@Controller
@RequestMapping("/censo")
public class motociclistaController {
	
	@Autowired
    private MotociclistaService service;
	
    @RequestMapping(value = "/motociclista", method = RequestMethod.GET)
    public String getMotociclista(Model model, @RequestParam("id") Integer id) {
    	model.addAttribute("motociclista", service.getMotociclista(id));
    	//model.addAttribute("otrosDatos", service.getOtrosDatosMotociclista(id));
    	
    	 return "motociclista";
    }

}
