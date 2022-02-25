package com.hiseoul_ml.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

public class ErrorResponse{
	private Integer code;
	private String message;
	
	public ErrorResponse(String message) {
		this.setMessage(message);
			
	}
	
	public String getMessage(){
		return message;
	}
	
	public void setMessage(String message) {
		this.message=message;
	}
	public Integer getCode() {
		return code;
	}
	
	public void setCode(Integer code) {
	
	}
}
