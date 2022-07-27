package com.cuuva.springboot.repository;



import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cuuva.springboot.model.EelFarmCommon;
import com.cuuva.springboot.model.UserInfo;
import com.cuuva.springboot.repository.mapping.UserInfoMapping;




public interface UserInfoRepository extends JpaRepository<UserInfo,String>{
	
	List <UserInfoMapping> findByUserIdAndUserPassword(String userId,String userPassword);
};
