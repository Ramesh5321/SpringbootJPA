package com.app.SpringbootJpaRepository.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	
	   @ExceptionHandler(PersonNotFoundException.class)
	   protected ResponseEntity<Object> handleEntityNotFound(PersonNotFoundException ex,WebRequest request) {
	       ErrorResponse error = new ErrorResponse();
	       error.setCode(HttpStatus.NOT_FOUND.toString());
	       error.setReason(ex.getMessage());
	       return new ResponseEntity<Object>(error, HttpStatus.NOT_FOUND);
	   }
	  /* @ExceptionHandler(DuplicateException.class)
	   public ResponseEntity<ErrorResponse> duplicateExceptions(DuplicateException de) {

	   ErrorResponse errorResponse = new ErrorResponse();
	   errorResponse.setCode(HttpStatus.METHOD_NOT_ALLOWED.toString());// 404
	   errorResponse.setReason(de.getMessage());

	   return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.METHOD_NOT_ALLOWED);
	   }*/
	   @ExceptionHandler(DuplicateException.class)
	   public ResponseEntity<Object> duplicateExceptions(DuplicateException de) {
       List<String> li=new ArrayList<>();
       li.add(de.getLocalizedMessage());
	   ErrorResponse errorResponse = new ErrorResponse();
	   errorResponse.setCode(HttpStatus.BAD_REQUEST.toString());// 404
	   errorResponse.setReason(de.getMessage());
	   return new ResponseEntity<Object>(errorResponse,HttpStatus.BAD_REQUEST);
	   }
	   @ExceptionHandler(Exception.class)
	   public ResponseEntity<ErrorResponse> defaultException(Exception e){

	   ErrorResponse errorResponse=new ErrorResponse();
	   errorResponse.setCode(HttpStatus.INTERNAL_SERVER_ERROR.toString());//500
	   errorResponse.setReason(e.getMessage());

	   return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.INTERNAL_SERVER_ERROR);
	   }


}
