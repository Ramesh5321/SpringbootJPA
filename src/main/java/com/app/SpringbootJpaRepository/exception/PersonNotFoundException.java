package com.app.SpringbootJpaRepository.exception;

public class PersonNotFoundException extends RuntimeException {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PersonNotFoundException(String string) {
		super(string);
		// TODO Auto-generated constructor stub
	}

	public String getLocalMessage() {
		// TODO Auto-generated method stub
		return "person is not availble";
	}	
}
