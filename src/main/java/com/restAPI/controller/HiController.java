package com.restAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
//changes only	
	@GetMapping(path="/hiSave")
	public String hiSave() {
		return "Hello World";
	}
	
	
	@GetMapping(path="/hiSaveData")
	public helloWorldji hiSaveData( ) {
		return new helloWorldji( "Hello World");
	}
	
	
	
	@GetMapping(path="/hiSaveData/{name}")
	public helloWorldji hiSaveData(@PathVariable String name ) {
		return new helloWorldji( String.format("Hello World , %s" ,name));
	}
	
	

}
