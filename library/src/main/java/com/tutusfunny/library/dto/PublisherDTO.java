package com.tutusfunny.library.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class PublisherDTO
{
	private int publisherid;
	private String name;
	
	public PublisherDTO()
	{
	}

	public PublisherDTO(int publisherid, String name)
	{
		this.publisherid = publisherid;
		this.name = name;
	}

	public int getPublisherid()
	{
		return publisherid;
	}

	public void setPublisherid(int publisherid)
	{
		this.publisherid = publisherid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
}
