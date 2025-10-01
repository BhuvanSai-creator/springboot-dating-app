package com.techvenue.dating.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techvenue.dating.entity.User;
import com.techvenue.dating.util.UserGender;

public interface UserRepository extends JpaRepository<User, Integer>{

	User save(User user);

	List<User> findByGender(UserGender male);


}
