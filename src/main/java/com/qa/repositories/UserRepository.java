package com.qa.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.qa.entities.User;

public interface UserRepository extends JpaRepository <User, Long>{


	

}
