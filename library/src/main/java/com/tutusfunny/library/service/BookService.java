package com.tutusfunny.library.service;

import java.util.List;


import com.tutusfunny.library.dto.BookDTO;
import com.tutusfunny.library.dto.BookSaveDTO;
import com.tutusfunny.library.dto.BookUpdateDTO;

public interface BookService {

	String addBook(BookSaveDTO bookSaveDTO);

	List<BookDTO> getAllBook();

	String updateBook(BookUpdateDTO bookUpdateDTO);

	String deleteBook(int id);

}
