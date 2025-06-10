package com.tutusfunny.library.dto;

//import lombok.AllArgsConstructor;
//
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
public class AuthorUpdateDTO
{
	private int authorid;
	private String name;
	
	public AuthorUpdateDTO() {}

    public AuthorUpdateDTO(int authorid, String name) {
        this.authorid = authorid;
        this.name = name;
    }

    public int getAuthorid() {
        return authorid;
    }

    public void setAuthorid(int authorid) {
        this.authorid = authorid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
	
}
