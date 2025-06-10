package com.tutusfunny.library.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;


public class BorrowUpdateDTO
{
	private int id;
	private int book_id;
	private int user_id;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate borrowDate;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate returnDate;
	
	public BorrowUpdateDTO(int id, int book_id, int user_id, LocalDate borrowDate, LocalDate returnDate) 
	{
		this.id = id;
		this.book_id = book_id;
		this.user_id = user_id;
		this.borrowDate = borrowDate;
		this.returnDate = returnDate;
	}
	public BorrowUpdateDTO() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public LocalDate getBorrowDate() {
		return borrowDate;
	}
	public void setBorrowDate(LocalDate borrowDate) {
		this.borrowDate = borrowDate;
	}
	public LocalDate getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	
	
	
	
}
