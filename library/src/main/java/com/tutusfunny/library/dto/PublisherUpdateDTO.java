package com.tutusfunny.library.dto;

public class PublisherUpdateDTO 
{
	private int publisherid;
	private String name;
	
	
	public PublisherUpdateDTO()
	{
	}


	public PublisherUpdateDTO(int publisherid, String name) 
	{
		
		this.publisherid = publisherid;
		this.name = name;
	}


	public int getPublisherid() {
		return publisherid;
	}


	public void setPublisherid(int publisherid) {
		this.publisherid = publisherid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
