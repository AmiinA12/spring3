package com.amina.User.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amina.User.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByRole(String role);





	

}
