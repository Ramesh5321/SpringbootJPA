package com.app.SpringbootJpaRepository.exception;


public class ErrorResponse {
 private String Code;
private String reason;
public ErrorResponse() {
	super();
	// TODO Auto-generated constructor stub
}
public ErrorResponse(String code, String reason) {
	super();
	Code = code;
	this.reason = reason;
}
public String getCode() {
	return Code;
}
public void setCode(String code) {
	Code = code;
}
public String getReason() {
	return reason;
}
public void setReason(String reason) {
	this.reason = reason;
}
 
}
	
	

 




