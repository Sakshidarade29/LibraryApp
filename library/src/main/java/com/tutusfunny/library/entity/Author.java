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
@Table(name ="author")
public class Author
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name ="author_id" , length=11)
	private int authorid;
	
	@Column(name ="name" , length=45)
	private String name;

	@OneToMany(mappedBy="author")
	private Set<Book> books;
	
	public Author(int authorid, String name) 
	{
		this.authorid = authorid;
		this.name = name;
	}

	public Author(String name) 
	{
		this.name = name;
	}

	public Author()
	{
		
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

	@Override
	public String toString() {
		return "Author [authorid=" + authorid + ", name=" + name + "]";
	}
	
	
	
}
