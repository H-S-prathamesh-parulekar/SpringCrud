package in.prathamesh.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.prathamesh.entity.User;
import in.prathamesh.repo.UserRepo;

@RestController
public class UserController {
	
	@Autowired
	private UserRepo userRepo;
	

	@PostMapping("/saveUser")
	public String insertUser(@RequestBody User  user){
		
		User save = userRepo.save(user);
		
		return "Saved Successfully";
	
	}
	
	@PostMapping("/saveAllUser")
	public String insertUser(@RequestBody List<User>  user){
		
	    List<User> saveAll = userRepo.saveAll(null);
		
		return "Saved Successfully";
	
	}
	
	
	@GetMapping("/getAllUser")
	public List<User> getAllUser(){
		
		List<User> findAll = userRepo.findAll();
		
		return findAll;
	}
	
	@GetMapping("/getUserByName/{name}")
	public List<User> getUserById(@PathVariable("name") String name) {
		
		List<User> findByName = userRepo.findByName(name);
		
		return findByName;
	}
	
	
	
	@GetMapping("/getUserById/{id}")
	public Optional<User> getUserById(@PathVariable("id") Long id) {
		Optional<User> user = userRepo.findById(id);

		if (user.isPresent()) {
			return user;
		} else
			return null;
	}
	

}
