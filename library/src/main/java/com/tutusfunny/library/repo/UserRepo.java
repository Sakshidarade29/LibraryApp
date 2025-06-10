package com.tutusfunny.library.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tutusfunny.library.entity.User;

public interface UserRepo extends JpaRepository<User,Integer>
{
	
}
