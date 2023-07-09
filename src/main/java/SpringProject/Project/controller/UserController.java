package SpringProject.Project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import SpringProject.entity.User;
import SpringProject.respository.UserRepository;


@RestController
@RequestMapping("/api")
public class UserController {
	
		@Autowired
		UserRepository repo;
		
		@GetMapping("/getUsers")
		public List<User> getUser(){
			
			return repo.findAll();
		
		}
		
		@PostMapping("/createUser")
		public User createUser(@RequestBody User user){
			
			return repo.save(user);
			
		}

		@DeleteMapping("/deleteUsers")
		public void deleteUser() {
			
			repo.deleteAll();
			
		}
		
		@DeleteMapping("/delete")
		public void delete(@RequestBody User user)
		{
			
			repo.delete(user);
		}
		
		@PutMapping("/updateUser")
		public User updateUser(@RequestBody User user) {
			return repo.save(user);
		}
		
		


		
		

}
