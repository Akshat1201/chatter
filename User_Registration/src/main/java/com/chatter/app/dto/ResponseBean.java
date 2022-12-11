package com.chatter.app.dto;

import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseBean {
	
	private String Status;
	private Optional<?> Result;
	private Map<String, String> Error;	

}
