package br.com.SmallSpring.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.SmallSpring.entity.User;

public interface UserRepository extends JpaRepository<User, Long>  {
	
	//Ele vai procurar exatamente o nome da coluna no banco de dados	
	//User findByName(String name);
	
	
	//Querys dinamicas utilizando o LIKE
	//@Query("Select u from User u where u.name like %?1% ")
	//User findByBusque(String name);
	//
	
	//buscando via email
	//User findByEmail(String email);
	
	//Ignorando case mauscula ou minuscula
	//User findByNameIgnoreCase(String name);
	
	
	
}
