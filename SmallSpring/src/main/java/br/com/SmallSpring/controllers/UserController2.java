package br.com.SmallSpring.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.SmallSpring.entity.User;


//Requisições http com spring
@RestController
public class UserController2 {

	
	@RequestMapping(value = "user1", method = RequestMethod.GET)
	public  List<User> getUsers() {
		List<User> users = new ArrayList<>();
		
		User user = new User("Filpsis" , "Filipe@lindo");
		
		users.add(user);
		
		return users;
		
	}
	
	//Recebe um usuário e retorna um usuário
	@RequestMapping(value = "user2", method = RequestMethod.POST)
	public  User User(@RequestBody User user) {
		 
		
		return user;
		
	}
	
	
	
	
}
