package com.tutusfunny.library.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tutusfunny.library.entity.Author;

public interface AuthorRepo extends JpaRepository<Author,Integer>
{

}
