package com.tutusfunny.library.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tutusfunny.library.dto.PublisherDTO;
import com.tutusfunny.library.dto.PublisherSaveDTO;
import com.tutusfunny.library.dto.PublisherUpdateDTO;
import com.tutusfunny.library.service.PublisherService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/publisher")
public class PublisherController
{
	@Autowired
	private PublisherService publisherService;
	
	@PostMapping(path="/save")
	public String savePublisher(@RequestBody PublisherSaveDTO publisherSaveDTO)
	{
		String publishername=publisherService.addPublisher(publisherSaveDTO);
		return "Added Successfully....";
	}
	
	@GetMapping(path="/getAllPublisher")
	public List<PublisherDTO> getAllPublisher()
	{
		List<PublisherDTO> allPublishers =publisherService.getAllPublisher();
		return allPublishers;
	}
	
	@PutMapping(path="/update")
	public String  updatePublisher(@RequestBody PublisherUpdateDTO publisherUpdateDTO)
	{
		String publishername=publisherService.updatePublisher(publisherUpdateDTO);
		return publishername;
	}
	
	@DeleteMapping(path="/delete/{id}")
	public String  deletePublisher(@PathVariable(value="id")int id)
	{
		//String publishername=publisherService.deletePublisher(id);
	    return publisherService.deletePublisher(id);

	}
	
}
