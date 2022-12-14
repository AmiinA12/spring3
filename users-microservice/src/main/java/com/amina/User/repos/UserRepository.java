package com.amina.User.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amina.User.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);
	

}


