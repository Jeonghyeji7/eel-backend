package com.cuuva.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cuuva.springboot.model.MedicineManageJournal;
import com.cuuva.springboot.repository.MedicineManageJournalRepository;
import java.util.List;


@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class MedicineManageJournalController {

	@Autowired
	private MedicineManageJournalRepository medicineManageJournalRepository;

	@GetMapping("/medicinemanagejournal")
	public List<MedicineManageJournal> getAllMedicineManageJournal(){
		return medicineManageJournalRepository.findAll();
	}
}
