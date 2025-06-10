package com.tutusfunny.library.dto;

//import lombok.AllArgsConstructor;
//
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
public class AuthorSaveDTO 
{
	private String name;
	
	public AuthorSaveDTO() {}

    public AuthorSaveDTO(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
