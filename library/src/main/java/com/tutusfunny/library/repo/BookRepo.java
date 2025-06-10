package com.tutusfunny.library.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tutusfunny.library.entity.Book;

public interface BookRepo extends JpaRepository<Book,Integer>
{

}
