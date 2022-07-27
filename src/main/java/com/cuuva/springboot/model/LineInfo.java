package com.cuuva.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Comment;

@Entity
@Table(name = "ef_line_info")
public class LineInfo {
	
	@Id
	@Column(name = "line_sn")
	@Comment("라인번호")
	private Integer lineSn;
	
	@ManyToOne
	@JoinColumn(name = "eel_farm_sn", referencedColumnName = "eel_farm_sn")
	@Comment("양반장일련번호")
	private EelFarmCommon eelFarmCommon;

	
	public LineInfo() {
		
	}


	public LineInfo(EelFarmCommon eelFarmCommon) {
		super();
		this.eelFarmCommon = eelFarmCommon;
	}


	public Integer getLineSn() {
		return lineSn;
	}


	public void setLineSn(Integer lineSn) {
		this.lineSn = lineSn;
	}


	public EelFarmCommon getEelFarmCommon() {
		return eelFarmCommon;
	}


	public void setEelFarmCommon(EelFarmCommon eelFarmCommon) {
		this.eelFarmCommon = eelFarmCommon;
	}
	
	
}
