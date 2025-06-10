package com.tutusfunny.library.dto;

public class UserSaveDTO 
{
	private String name;
	
	private String email;

	public UserSaveDTO(String name, String email) 
	{
		this.name = name;
		this.email = email;
	}

	public UserSaveDTO() 
	{
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
