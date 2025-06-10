package com.tutusfunny.library.dto;

import java.time.LocalDate;

import com.tutusfunny.library.entity.Book;
import com.tutusfunny.library.entity.User;

public class BorrowDTO
{
	private int id;
	private Book book;
	private User user;
	private LocalDate borrowDate;
	private LocalDate returnDate;
	
	public BorrowDTO(int id, Book book, User user, LocalDate borrowDate, LocalDate returnDate) {
		super();
		this.id = id;
		this.book = book;
		this.user = user;
		this.borrowDate = borrowDate;
		this.returnDate = returnDate;
	}
	
	public BorrowDTO() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
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
