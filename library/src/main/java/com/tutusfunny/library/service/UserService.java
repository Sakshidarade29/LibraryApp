package com.tutusfunny.library.service;

import java.util.List;

import com.tutusfunny.library.dto.UserDTO;
import com.tutusfunny.library.dto.UserSaveDTO;
import com.tutusfunny.library.dto.UserUpdateDTO;

public interface UserService 
{

	String addUser(UserSaveDTO userSaveDTO);

	List<UserDTO> getAllUser();

	String updateUser(UserUpdateDTO userUpdateDTO);

	String deleteUser(int id);
	
}
