package com.chatter.app.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.chatter.app.dto.ResponseBean;
import com.chatter.app.enitty.UserEntity;
import com.chatter.app.service.User_Service;
import com.chatter.app.service.impl.User_ServiceImpl;
import com.chatter.app.utils.Constant;

import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/users")
public class Controller {
	
	@Autowired
	User_Service userService;
	
	
	
	@GetMapping
	public ResponseEntity<ResponseBean> test(){
		ResponseBean rb=new ResponseBean();
		rb.setStatus("success");
		Optional<Map<String, String>>p;
		Map<String, String>a=new HashMap<>();
		a.put("e1", "p1");
		p=Optional.of((a));
		//rb.setError(p);
		
		List<String > arr=new ArrayList<>();
		arr.add("test");
		
		rb.setResult(Optional.of(a));
		
		return ResponseEntity.ok(rb);
	}
	
	@PostMapping
	@RequestMapping("/new")
	public ResponseEntity<ResponseBean> addNewUser(@RequestBody @Valid UserEntity user){
		return ResponseEntity.ok(userService.saveUser(user));
	}
	
	@PostMapping
	@RequestMapping("/userImage")
	public ResponseEntity<ResponseBean> UpdatePic(@RequestParam("file") MultipartFile pic,
			@RequestParam("mob") Integer mob){
		System.out.println("mob "+mob);
		return null;
	}


}
