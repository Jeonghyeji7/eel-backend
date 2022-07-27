package com.cuuva.springboot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Getter
@Setter
@Entity
@Table(name = "ef_feed")
public class Feed {
	
	@Id
	@Column(name = "feed_code",length = 50)
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer feedCode;
	
	@ManyToOne
	@JoinColumn(name = "eel_farm_sn", referencedColumnName = "eel_farm_sn")
	@Comment("양반장일련번호")
	private EelFarmCommon eelFarmCommon;
	
	@Column(name = "feed_name",length = 50)
	private String feedName;
	
	@Column(name = "feed_standard")
	private Integer feedStandard;
	
	
	@Column(name = "feed_seller_code",length = 50)
	private String feedSellerCode;
	
	public Feed() {
		
	}


	
}
