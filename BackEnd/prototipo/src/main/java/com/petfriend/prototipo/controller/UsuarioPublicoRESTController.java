package com.petfriend.prototipo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import com.petfriend.prototipo.configuration.SecurityConfig;
import com.petfriend.prototipo.model.PersonaNatural;
import com.petfriend.prototipo.model.Publicacion;
import com.petfriend.prototipo.model.PublicacionAdopcion;
import com.petfriend.prototipo.model.PublicacionAnimal;
import com.petfriend.prototipo.model.Usuario;
import com.petfriend.prototipo.repositories.IPublicacionAdopcionRepositorio;
import com.petfriend.prototipo.repositories.IPublicacionRepositorio;
import com.petfriend.prototipo.repositories.IUsuarioRepositorio;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/public")
public class UsuarioPublicoRESTController {
	@Autowired
	private IPublicacionAdopcionRepositorio<PublicacionAdopcion> animalAdopRepo;
	@Autowired
	private IPublicacionRepositorio<Publicacion> adopRepo;
	@Autowired
	private IUsuarioRepositorio usuarioRepo;
	
	private InMemoryUserDetailsManager inMemoryUserDetailsManager;

    @Autowired
    public void SecurityConfig(InMemoryUserDetailsManager inMemoryUserDetailsManager) {
       this.inMemoryUserDetailsManager = inMemoryUserDetailsManager;
    }
	
	@GetMapping("/paginaPrincipal")
	public Iterable<Publicacion> pedirPaginaPrincipal()
	{
		List<Integer> randoms = animalAdopRepo.findRandom();
		List<Integer> ids = new ArrayList<Integer>();
		List<Publicacion> solution = new ArrayList<Publicacion>();
		System.out.println("Lo pide");
		for (int i=0 ; i<10 ; ++i) {

			if(randoms.size() > i){
				ids.add(randoms.get(i));
				System.out.println(ids.get(i));
			}
		}
		for (Integer integer : ids) {
			solution.add(this.adopRepo.findById(integer).get());
		}
		return solution;
	}
	
	@GetMapping("/registrar")
	@ResponseBody
	public String registrarUsuario(@RequestParam(defaultValue = "correo") String correo, @RequestParam(defaultValue = "pass") String pass)
	{
		Usuario u = this.usuarioRepo.findByCorreo(correo);
		if(u != null)
			return "USUARIO EXISTENTE";
		
		PersonaNatural pn = new PersonaNatural();
		pn.setCorreo(correo);
		pn.setContrasenha(pass);
		
		this.usuarioRepo.save(new PersonaNatural());
		inMemoryUserDetailsManager.createUser(User.withUsername(correo).password(pass).roles("USER").build());
		return "REGISTRADO";
	}

	@GetMapping("/home")
	public Iterable<PublicacionAnimal> getAAdopcion()
	{
		return this.animalAdopRepo.findAll();
	}
	
}
