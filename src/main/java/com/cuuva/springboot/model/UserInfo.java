package com.cuuva.springboot.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Comment;

@Entity
@Table(name = "user_info")
public class UserInfo {
	
	@Id
	@Column(name = "user_id",length = 50)
	@Comment("아이디")
	private String userId;
	
	@Column(name = "user_password")
	@Comment("비밀번호")
	private String userPassword;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "eel_farm_sn")
	@Comment("양반장일련번호")
	private EelFarmCommon eelFarmCommon;
	
	@Column(name = "user_name",length = 50)
	@Comment("담당자")
	private String userName;
	
	@Column(name = "user_phone_number",length = 50)
	@Comment("전화번호")
	private String userPhoneNumber;
	
	@Column(name = "user_email" ,length = 50)
	@Comment("전화번호")
	private String userEmail;
	
	public UserInfo() {
		
	}

	public UserInfo(String userPassword, EelFarmCommon eelFarmCommon, String userName, String userPhoneNumber,
			String userEmail) {
		super();
		this.userPassword = userPassword;
		this.eelFarmCommon = eelFarmCommon;
		this.userName = userName;
		this.userPhoneNumber = userPhoneNumber;
		this.userEmail = userEmail;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public EelFarmCommon getEelFarmCommon() {
		return eelFarmCommon;
	}

	public void setEelFarmCommon(EelFarmCommon eelFarmCommon) {
		this.eelFarmCommon = eelFarmCommon;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	
	
	

	
	

	
	

}
