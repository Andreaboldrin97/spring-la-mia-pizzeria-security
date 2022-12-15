package org.generation.italy.pizza.demo.service;

import java.util.List;


import org.generation.italy.pizza.demo.pojo.User;
import org.generation.italy.pizza.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//indichiamo che qesta classe ci servirà da service
@Service
public class UserService {
	
	//indichiamo la dipendenza da iniettare
	@Autowired
	private UserRepo userRepo;
	
	//funzione per salvare/inserire un record
	public void save(User user) {
		
		//grazie all'interfaccia JpaRepository possiamo usare il method save
		userRepo.save(user);
	}
	
	//funzione per prendere tutti i record
	public List<User> findAll() {
			
		//ritorniamo una lista di record
		return userRepo.findAll();
	}
}
