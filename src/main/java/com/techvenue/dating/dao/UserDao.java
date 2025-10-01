package com.techvenue.dating.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techvenue.dating.entity.User;
import com.techvenue.dating.repository.UserRepository;
import com.techvenue.dating.util.UserGender;
@Repository
public class UserDao {
	@Autowired
	UserRepository userRepository;

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public List<User> findAllMaleUsers() {
		
		return userRepository.findByGender(UserGender.MALE);
		
	}

	public List<User> findAllFemaleUsers() {
		return userRepository.findByGender(UserGender.FEMALE);
	}

	public java.util.Optional<User> findUserById(int id) {
		
		return userRepository.findById(id);
	}

	

	


}
