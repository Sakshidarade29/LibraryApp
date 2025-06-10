package com.tutusfunny.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tutusfunny.library.dto.UserDTO;
import com.tutusfunny.library.dto.UserSaveDTO;
import com.tutusfunny.library.dto.UserUpdateDTO;
import com.tutusfunny.library.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/user")
public class UserController 
{
	@Autowired
	private UserService userService;
	
	@PostMapping(path="/save")
	public String saveUser(@RequestBody UserSaveDTO userSaveDTO)
	{
		String username=userService.addUser(userSaveDTO);
		return "Added Successfully....";
	}
	
	@GetMapping(path="/getAllUser")
	public List<UserDTO> getAllUser()
	{
		List<UserDTO> allUsers =userService.getAllUser();
		return allUsers;
	}
	
	@PutMapping(path="/update")
	public String  updateUser(@RequestBody UserUpdateDTO userUpdateDTO)
	{
		String username=userService.updateUser(userUpdateDTO);
		return username;
	}
	
	@DeleteMapping(path="/delete/{id}")
	public String  deleteUser(@PathVariable(value="id")int id)
	{
		String username=userService.deleteUser(id);
		return "Deleted!.......";
	}
}
