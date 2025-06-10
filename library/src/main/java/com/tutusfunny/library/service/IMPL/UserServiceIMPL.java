package com.tutusfunny.library.service.IMPL;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutusfunny.library.dto.UserDTO;
import com.tutusfunny.library.dto.UserSaveDTO;
import com.tutusfunny.library.dto.UserUpdateDTO;
import com.tutusfunny.library.entity.User;
import com.tutusfunny.library.repo.UserRepo;
import com.tutusfunny.library.service.UserService;


@Service
public class UserServiceIMPL implements UserService
{
	@Autowired
	private UserRepo userRepo;

	@Override
	public String addUser(UserSaveDTO userSaveDTO)
	{
		User user= new User(
				userSaveDTO.getName(),
				userSaveDTO.getEmail()
				);
		userRepo.save(user);
		return user.getName();
	}

	@Override
	public List<UserDTO> getAllUser()
	{
		List<User> getUsers = userRepo.findAll();
		List<UserDTO> userDTOList =new ArrayList<>();
		for(User user:getUsers)
		{
			UserDTO userDTO = new UserDTO( 
					user.getUserid(),
					user.getName(),
					user.getEmail()
					);
			userDTOList.add(userDTO);
		}
		return userDTOList;
	}

	@Override
	public String updateUser(UserUpdateDTO userUpdateDTO)
	{
		if(userRepo.existsById(userUpdateDTO.getUserid()))
		{
			User user = userRepo.getById(userUpdateDTO.getUserid());
			user.setName(userUpdateDTO.getName());
			user.setEmail(userUpdateDTO.getEmail());
			userRepo.save(user);	
			return user.getName();
		}
		else
		{
			System.out.println("User ID does not exist.");
		}
		return null;
	}

	@Override
	public String deleteUser(int id)
	{
		if(userRepo.existsById(id))
		{
			userRepo.deleteById(id);
		}
		else
		{
			System.out.println("Id Not Found....");
		}
		return null;
	}
	
}
