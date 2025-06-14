package com.tutusfunny.library.entity;

import java.util.Set;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="user")
public class User 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name ="user_id" , length=11)
	private int userid;
	
	@Column(name ="name" , length=45)
	private String name;
	
	@Column(name ="email" , length=45)
	private String email;

	
	@OneToMany(mappedBy="user")
	private Set<Borrow> borrows;
	
	public User(int userid, String name, String email)
	{
		this.userid = userid;
		this.name = name;
		this.email = email;
	}

	public User(String name, String email) 
	{
		this.name = name;
		this.email = email;
	}

	public User()
	{
	}

	public int getUserid() 
	{
		return userid;
	}

	public void setUserid(int userid) 
	{
		this.userid = userid;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	@Override
	public String toString() 
	{
		return "User [userid=" + userid + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
	
	
}
