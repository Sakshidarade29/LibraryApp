package com.tutusfunny.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutusfunny.library.dto.BookDTO;
import com.tutusfunny.library.dto.BookSaveDTO;
import com.tutusfunny.library.dto.BookUpdateDTO;
import com.tutusfunny.library.service.BookService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/book")
public class BookController
{
	@Autowired
	private BookService bookService;
	
	@PostMapping(path="/save")
	public String saveBook(@RequestBody BookSaveDTO bookSaveDTO)
	{
		String booktitle=bookService.addBook(bookSaveDTO);
		return "Added Successfully....";
	}
	
	@GetMapping(path="/getAllBook")
	public List<BookDTO> getAllBook()
	{
		List<BookDTO> allBooks =bookService.getAllBook();
		return allBooks;
	}
	
	
	@PutMapping(path="/update")
	public String  updateBook(@RequestBody BookUpdateDTO bookUpdateDTO)
	{
		String bookname=bookService.updateBook(bookUpdateDTO);
		return bookname;
	}
	
	@GetMapping(path="/delete/{id}")
	public String  deleteBook(@PathVariable(value="id")int id)
	{
		String bookname=bookService.deleteBook(id);
		return "Deleted successfully!.......";
	}
	
	

}
