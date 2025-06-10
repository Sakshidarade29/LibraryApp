package com.tutusfunny.library.service;

import java.util.List;

import com.tutusfunny.library.dto.BorrowDTO;
import com.tutusfunny.library.dto.BorrowSaveDTO;
import com.tutusfunny.library.dto.BorrowUpdateDTO;

public interface BorrowService 
{

	String addBorrow(BorrowSaveDTO borrowSaveDTO);

	List<BorrowDTO> getAllBorrow();

	String updateBorrow(BorrowUpdateDTO borrowUpdateDTO);

	String deleteBorrow(int id);
	
}
