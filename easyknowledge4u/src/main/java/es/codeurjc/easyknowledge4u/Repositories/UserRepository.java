package es.codeurjc.easyknowledge4u.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.codeurjc.easyknowledge4u.Models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByNombre (String nombre);

}