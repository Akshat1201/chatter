package com.chatter.app.exception;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.chatter.app.dto.ResponseBean;
import com.chatter.app.utils.Constant;

@ControllerAdvice
public class ContollerException {	
	

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ResponseBean> InvalidArgument(MethodArgumentNotValidException args){
		Map<String,String> errorMap=new HashMap<>();
		args.getBindingResult().getFieldErrors().forEach(error->{
			errorMap.put(error.getField(), error.getDefaultMessage());
		});
		
		ResponseBean responseBean=new ResponseBean(Constant.FAIL,null,errorMap);
				
		return ResponseEntity.badRequest().body(responseBean);
	}

}
