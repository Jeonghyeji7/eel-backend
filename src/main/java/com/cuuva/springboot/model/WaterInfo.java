package com.cuuva.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Comment;


@Entity
@Table(name = "ef_watertank_info")
public class WaterInfo {
	
	@Id
	@Column(name = "watertank_sn")
	@Comment("수조번호")
	private Integer watertankSn;
	

	@ManyToOne
	@JoinColumn(name = "eel_farm_sn", referencedColumnName = "eel_farm_sn")
	@Comment("양반장일련번호")
	private EelFarmCommon eelFarmCommon;
	
	

	public WaterInfo() {
		
	}



	public WaterInfo(EelFarmCommon eelFarmCommon) {
		super();
		this.eelFarmCommon = eelFarmCommon;
	}



	public Integer getWatertankSn() {
		return watertankSn;
	}



	public void setWatertankSn(Integer watertankSn) {
		this.watertankSn = watertankSn;
	}



	public EelFarmCommon getEelFarmCommon() {
		return eelFarmCommon;
	}



	public void setEelFarmCommon(EelFarmCommon eelFarmCommon) {
		this.eelFarmCommon = eelFarmCommon;
	}



	
	
	
}
