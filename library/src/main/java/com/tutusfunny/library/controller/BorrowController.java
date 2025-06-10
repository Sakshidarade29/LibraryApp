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
import com.tutusfunny.library.dto.BorrowDTO;
import com.tutusfunny.library.dto.BorrowSaveDTO;
import com.tutusfunny.library.dto.BorrowUpdateDTO;
import com.tutusfunny.library.service.BorrowService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/borrow")
public class BorrowController
{
	@Autowired
	private BorrowService borrowService;
	
	@PostMapping(path="/save")
	public String saveBorrow(@RequestBody BorrowSaveDTO borrowSaveDTO)
	{
		String borrowBooks=borrowService.addBorrow(borrowSaveDTO);
		return "Borrowel Successfully....";
	}
	
	@GetMapping(path="/getAllBorrow")
	public List<BorrowDTO> getAllBorrow()
	{
		List<BorrowDTO> allborrow =borrowService.getAllBorrow();
		return allborrow;
	}
	
	@PutMapping(path="/update")
	public String  updateBorrow(@RequestBody BorrowUpdateDTO borrowUpdateDTO)
	{
		String borrow=borrowService.updateBorrow(borrowUpdateDTO);
		return "updated";
	}

	@DeleteMapping(path="/delete/{id}")
	public String  deleteBorrow(@PathVariable(value="id")int id)
	{
		String borrowname=borrowService.deleteBorrow(id);
		return "Deleted!.......";
	}
	
	
}
