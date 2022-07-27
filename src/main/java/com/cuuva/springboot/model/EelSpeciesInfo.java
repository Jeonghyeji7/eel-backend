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
@Table(name = "ef_eel_species_info")
public class EelSpeciesInfo {

	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Comment("장어품종일련번호")
	@Column(name = "eel_species_sn",length = 11)
	private Integer eelSpeciesSn;
	
	@ManyToOne
	@JoinColumn(name = "eel_farm_sn", referencedColumnName = "eel_farm_sn")
	@Comment("양반장일련번호")
	private EelFarmCommon eelFarmCommon;
	
	@Comment("장어품종")
	@Column(name = "eel_species_name",length = 50)
	private String eelSpeciesName;
	
	public EelSpeciesInfo() {
		
	}

	public EelSpeciesInfo(EelFarmCommon eelFarmCommon, String eelSpeciesName) {
		super();
		this.eelFarmCommon = eelFarmCommon;
		this.eelSpeciesName = eelSpeciesName;
	}

	public Integer getEelSpeciesSn() {
		return eelSpeciesSn;
	}

	public void setEelSpeciesSn(Integer eelSpeciesSn) {
		this.eelSpeciesSn = eelSpeciesSn;
	}

	public EelFarmCommon getEelFarmCommon() {
		return eelFarmCommon;
	}

	public void setEelFarmCommon(EelFarmCommon eelFarmCommon) {
		this.eelFarmCommon = eelFarmCommon;
	}

	public String getEelSpeciesName() {
		return eelSpeciesName;
	}

	public void setEelSpeciesName(String eelSpeciesName) {
		this.eelSpeciesName = eelSpeciesName;
	}
	
	
}
