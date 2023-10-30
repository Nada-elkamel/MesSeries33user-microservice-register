package com.nada.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nada.users.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
	
	@Query("select u from User u where u.user_id = ?1")
	    User getUserById(Long id);
}