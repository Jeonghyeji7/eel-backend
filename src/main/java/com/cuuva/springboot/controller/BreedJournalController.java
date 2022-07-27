package com.cuuva.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cuuva.springboot.model.BreedJournal;
import com.cuuva.springboot.repository.BreedJournalRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/")
public class BreedJournalController {
	
	@Autowired
	private BreedJournalRepository breedjournalRepository;
	
	@GetMapping("/breedjournal")
	public List<BreedJournal> getAll(){
		return breedjournalRepository.findAll();
	}
	

	
	@PostMapping("/breedjournal")
	public BreedJournal createBreedJournal(@RequestBody BreedJournal breedJournal) {
		return breedjournalRepository.save(breedJournal);
	}
	

	
	

}
