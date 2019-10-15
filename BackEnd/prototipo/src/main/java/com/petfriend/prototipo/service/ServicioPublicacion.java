package com.petfriend.prototipo.service;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test1")
public class ServicioPublicacion {
	 @GetMapping(value="/test2", produces = MediaType.APPLICATION_JSON_VALUE)
	 public String test() {
		 return "{\"message\": \"admin OK\"}";
	 }
}
