package com.cuuva.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Comment;

@Entity
@Table(name = "ef_medicine_species_info")
public class MedicineSpecies {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Comment("약품일련번호")
	@Column(name = "medicine_species_sn",length = 11)
	private Integer medicineSpeciesSn;
	
	@ManyToOne
	@JoinColumn(name = "eel_farm_sn", referencedColumnName = "eel_farm_sn")
	@Comment("양반장일련번호")
	private EelFarmCommon eelFarmCommon;
	
	@Comment("약품명")
	@Column(name = "medicine_name",length = 50)
	private String medicineName;
	
	public MedicineSpecies() {
		
	}
 
}
