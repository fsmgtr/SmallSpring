package br.com.SmallSpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.SmallSpring.entity.User;
import br.com.SmallSpring.repository.UserRepository;

@Controller
public class UserController {
	
	@SuppressWarnings("unused")
	private UserRepository userRepository;
	
	public UserController (UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	
	@RequestMapping("/user")
	public String getUsers(Model model) {
		model.addAttribute("userList", this.userRepository.findAll());
		
		return"user";
		 
	}
	
	/*
	 *Vamos colocar o usuário dentro da model
	 *Vamos enviar um form via pos para que
	 *o model seja "populado".
	 *
	 *Quando utilizamos o submit vai ser retornado o valor que precisamos
	 *quando utilizar o get vai retornar o formulário enviado
	 * 
	 * */
	
	@GetMapping("/mail")
	public String getUser (Model model) {
		
		model.addAttribute("user", new User());
						
		return "user";
	}
	
	@PostMapping("/mail")
	public String userSubmit(@ModelAttribute User user) {
		
		return "result";
	}
	
	
	

}


