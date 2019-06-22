  package com.cg.bookstore.aspect;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cg.bookstore.exceptions.BookAlreadyExistException;
import com.cg.bookstore.exceptions.BookNotFoundException;
import com.cg.bookstore.responses.CustomResponse;

@ControllerAdvice
public class BookExceptionAspect {
	@ExceptionHandler(BookNotFoundException.class)
	public ResponseEntity<CustomResponse> handleProductExceptionAspect(Exception e) {
		CustomResponse response= new CustomResponse(e.getMessage(),HttpStatus.EXPECTATION_FAILED.value());
		return new ResponseEntity<>(response,HttpStatus.EXPECTATION_FAILED);
	}
	
	@ExceptionHandler(BookAlreadyExistException.class)
	public ResponseEntity<CustomResponse> handleProductExceptionAspect2(Exception e) {
		CustomResponse response= new CustomResponse(e.getMessage(),HttpStatus.EXPECTATION_FAILED.value());
		return new ResponseEntity<>(response,HttpStatus.EXPECTATION_FAILED);
	}
}
