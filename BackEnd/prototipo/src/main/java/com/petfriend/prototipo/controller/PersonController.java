package com.petfriend.prototipo.controller;

import com.petfriend.prototipo.model.Person;
import com.petfriend.prototipo.repository.IPersonRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PersonController {

	@Autowired
	private IPersonRepo repo;
	
	@GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        //logica 
		System.out.println("entra");
		Person p = new Person();
		p.setIdPerson(2);
		p.setName("Name1");
		repo.save(p);
		model.addAttribute("name", name);
        return "greeting";
    }
	
	@GetMapping("/listar")
    public String greeting(Model model) {
        //logica 							
		model.addAttribute("people", repo.findAll());
        return "greeting";
    }
}
