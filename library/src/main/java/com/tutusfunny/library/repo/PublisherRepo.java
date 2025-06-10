package com.tutusfunny.library.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tutusfunny.library.entity.Publisher;


public interface PublisherRepo  extends JpaRepository<Publisher,Integer>
{
	
}
