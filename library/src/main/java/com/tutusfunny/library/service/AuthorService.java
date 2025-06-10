package com.tutusfunny.library.service;

import java.util.List;
import com.tutusfunny.library.dto.AuthorDTO;
import com.tutusfunny.library.dto.AuthorSaveDTO;
import com.tutusfunny.library.dto.AuthorUpdateDTO;

public interface AuthorService {

	String addAuthor(AuthorSaveDTO authorSaveDTO);

	List<AuthorDTO> getAllAuthor();

	String updateAuthor(AuthorUpdateDTO authorUpdateDTO);

	String deleteAuthor(int id);

	

}
