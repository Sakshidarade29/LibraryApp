package com.tutusfunny.library.service;

import java.util.List;


import com.tutusfunny.library.dto.PublisherDTO;
import com.tutusfunny.library.dto.PublisherSaveDTO;
import com.tutusfunny.library.dto.PublisherUpdateDTO;

public interface PublisherService
{

	String addPublisher(PublisherSaveDTO publisherSaveDTO);

	List<PublisherDTO> getAllPublisher();

	String updatePublisher(PublisherUpdateDTO publisherUpdateDTO);

	String deletePublisher(int id);

	
}
