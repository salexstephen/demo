package com.example.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class WasController {
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String getHome(){
		
		return "done";
	}
	

}
