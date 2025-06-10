package com.tutusfunny.library.dto;

public class BookUpdateDTO
{
	private int bookid;
	private String title;
	private int author_id;
	private int publisher_id;
	
	public BookUpdateDTO(int bookid, String title, int author_id, int publisher_id) {
		this.bookid = bookid;
		this.title = title;
		this.author_id = author_id;
		this.publisher_id = publisher_id;
	}

	public BookUpdateDTO() {
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}

	public int getPublisher_id() {
		return publisher_id;
	}

	public void setPublisher_id(int publisher_id) {
		this.publisher_id = publisher_id;
	}
	
	 
}
