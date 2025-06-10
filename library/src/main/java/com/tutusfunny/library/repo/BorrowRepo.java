package com.tutusfunny.library.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutusfunny.library.entity.Borrow;

public interface BorrowRepo extends JpaRepository<Borrow,Integer>
{
	
}
