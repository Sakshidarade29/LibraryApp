package com.tutusfunny.library.service.IMPL;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutusfunny.library.dto.BorrowDTO;
import com.tutusfunny.library.dto.BorrowSaveDTO;
import com.tutusfunny.library.dto.BorrowUpdateDTO;
import com.tutusfunny.library.entity.Borrow;
import com.tutusfunny.library.repo.BookRepo;
import com.tutusfunny.library.repo.BorrowRepo;
import com.tutusfunny.library.repo.UserRepo;
import com.tutusfunny.library.service.BorrowService;

@Service
public class BorrowServiceIMPL implements BorrowService
{
	@Autowired
	private BookRepo bookRepo;
	
	@Autowired
	private UserRepo userRepo;

	@Autowired
	private BorrowRepo borrowRepo;

	@Override
	public String addBorrow(BorrowSaveDTO borrowSaveDTO)
	{
		Borrow borrow = new Borrow(
				bookRepo.getById(borrowSaveDTO.getBook_id()),
				userRepo.getById(borrowSaveDTO.getUser_id()),
				borrowSaveDTO.getBorrowDate(),
				borrowSaveDTO.getReturnDate()
				);
		borrowRepo.save(borrow);	
		return "Borrow record saved successfully";
	}

	@Override
	public List<BorrowDTO> getAllBorrow()
	{
		List<Borrow> getBorrows = borrowRepo.findAll();
		List<BorrowDTO> borrowDTOList =new ArrayList<>();
		for(Borrow borrow:getBorrows)
		{
			BorrowDTO borrowDTO = new BorrowDTO( 
					borrow.getId(),
					borrow.getBook(),
					borrow.getUser(),
					borrow.getReturnDate(),
					borrow.getBorrowDate()
					);
			borrowDTOList.add(borrowDTO);
		}
		return borrowDTOList;
	}

	@Override
	public String updateBorrow(BorrowUpdateDTO borrowUpdateDTO)
	{
		if(borrowRepo.existsById(borrowUpdateDTO.getId()))
		{
			Borrow borrow =borrowRepo.getById(borrowUpdateDTO.getId());
			borrow.setBook(bookRepo.getById(borrowUpdateDTO.getBook_id()));
			borrow.setUser(userRepo.getById(borrowUpdateDTO.getUser_id()));
			borrow.setBorrowDate(borrowUpdateDTO.getBorrowDate());
			borrow.setReturnDate(borrowUpdateDTO.getReturnDate());
			borrowRepo.save(borrow);
			return "Borrow updated successfully";
		}
		else
		{
			System.out.println("Borrow id not found!..");
		}
		return null;
	}

	@Override
	public String deleteBorrow(int id)
	{
		if(borrowRepo.existsById(id))
		{
			borrowRepo.deleteById(id);
		}
		else
		{
			System.out.println("ID Not Found....");
		}
		return null;
	}

	
}
