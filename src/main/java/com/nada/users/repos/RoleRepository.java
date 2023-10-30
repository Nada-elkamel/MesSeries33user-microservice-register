package com.nada.users.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nada.users.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByRole(String role);
	
	 List<Role> findAll();

	    @Query("select r from Role r where r.role_id = ?1")
	    Role findRoleById(Long id);
}