package es.codeurjc.easyknowledge4u.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.codeurjc.easyknowledge4u.Models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByName(String name);
	User findByIdUsuario (String IdUsuario);

}
