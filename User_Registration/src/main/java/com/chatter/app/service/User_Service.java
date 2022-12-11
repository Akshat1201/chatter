package com.chatter.app.service;

import org.springframework.web.multipart.MultipartFile;

import com.chatter.app.dto.ResponseBean;
import com.chatter.app.enitty.UserEntity;

public interface User_Service {
	
	public ResponseBean saveUser(UserEntity user);
	
	public String saveImage(MultipartFile file);

}
