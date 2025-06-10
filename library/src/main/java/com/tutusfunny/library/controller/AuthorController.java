package com.tutusfunny.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutusfunny.library.dto.AuthorDTO;
import com.tutusfunny.library.dto.AuthorSaveDTO;
import com.tutusfunny.library.dto.AuthorUpdateDTO;
import com.tutusfunny.library.service.AuthorService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/author")
public class AuthorController
{
	@Autowired
	private AuthorService authorService;
	
	@PostMapping(path="/save")
	public String saveAuthor(@RequestBody AuthorSaveDTO authorSaveDTO)
	{
		String authorname=authorService.addAuthor(authorSaveDTO);
		return "Added Successfully....";
	}
	
	@GetMapping(path="/getAllAuthor")
	public List<AuthorDTO> getAllAuthor()
	{
		List<AuthorDTO> allAuthors =authorService.getAllAuthor();
		return allAuthors;
	}
	
	@PutMapping(path="/update")
	public String  updateAuthor(@RequestBody AuthorUpdateDTO authorUpdateDTO)
	{
		String authorname=authorService.updateAuthor(authorUpdateDTO);
		return authorname;
	}
	
	@DeleteMapping(path="/delete/{id}")
	public String  deleteAuthor(@PathVariable(value="id")int id)
	{
		String authorname=authorService.deleteAuthor(id);
		return "Deleted!.......";
	}
	
	

}
