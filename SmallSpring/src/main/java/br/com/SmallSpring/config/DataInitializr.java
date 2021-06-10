package br.com.SmallSpring.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.SmallSpring.entity.User;
import br.com.SmallSpring.repository.UserRepository;

@Component
public class DataInitializr implements ApplicationListener<ContextRefreshedEvent> {

	// carregando dados do banco
	@Autowired
	UserRepository userRepository;

	// sempre que a plicação subir a classe abaixo vai iniciar
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {

		// Salvando....
		// User user1 = new User();
		// user.setName("filipe2");
		// user.setEmail("Filipe o mestre");

		// userRepository.save(user);

		/**
		 * // Recuperando todos os usuários List<User> users = userRepository.findAll();
		 * 
		 * for (User user2 : users) { System.out.println(users);
		 * System.out.println("--------");
		 * 
		 * 
		 * }
		 */

		// chamado o método
		// createUser("Thaina", "Filha de Zé");
		// createUser("Zé", "Filho@Zé");
		// createUser("Eliana", "mamae@mamae");

		/*
		 * //chamando user pelo id User user = userRepository.getOne(13L); User user1 =
		 * userRepository.getById(14L); System.out.println(user.getName());
		 * System.out.println(user1.getName());
		 * 
		 */

		// deletando pelo id
		// userRepository.deleteById(14L);

		/*
		 * 
		 * //Buscando pelo nome Querys customizadas User user = new User();
		 * 
		 * @SuppressWarnings({ "unused", "unchecked" }) List<User> u = (List<User>)
		 * userRepository.findByName("Thaina");
		 * 
		 * for (User user2 : u) { System.out.println(user2); }
		 * 
		 */
		
		
		
		 

	}

	// método para criar usuários
	public void createUser(String name, String email) {

		User user = new User(name, email);
		userRepository.save(user);

	}

}
