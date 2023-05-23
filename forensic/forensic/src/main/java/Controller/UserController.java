package Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import Entity.User;
import Repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	public UserRepository userRepository;
	
	@PostMapping("user")
	public ResponseEntity<User> saveUser(@RequestBody User user){
		return new ResponseEntity<>(userRepository.save(user), HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<User>> getUser(){
		return new ResponseEntity<>(userRepository.findAll(),HttpStatus.OK);
	}
	
	@GetMapping("user/{id}")
	public ResponseEntity<User> getUser(@PathVariable long id){
		Optional<User> user = userRepository.findById(id);
		if(user.isPresent()) {
			return new ResponseEntity<>(user.get(),HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	
	@DeleteMapping("user/{id}")
	public ResponseEntity<Void> deleteStudent(@PathVariable long id, @RequestBody User user ){
		Optional<User> student = userRepository.findById(id);
		if(student.isPresent()) {
			userRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
}
