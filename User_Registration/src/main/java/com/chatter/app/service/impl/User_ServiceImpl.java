package com.chatter.app.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.chatter.app.dto.ResponseBean;
import com.chatter.app.enitty.UserEntity;
import com.chatter.app.repository.UserRepository;
import com.chatter.app.service.User_Service;
import com.chatter.app.utils.Constant;

@Service
public class User_ServiceImpl implements User_Service{
	
	@Autowired
	UserRepository userRepo;

	@Override
	public ResponseBean saveUser(UserEntity user) {
		userRepo.save(user);
		ResponseBean returnBean=new ResponseBean(Constant.SUCCESS, Optional.of(user), null);
		return returnBean;
	}

	@Override
	public String saveImage(MultipartFile file) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
