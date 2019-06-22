package com.cg.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bookstore.beans.Book;
import com.cg.bookstore.exceptions.BookNotFoundException;
import com.cg.bookstore.responses.CustomResponse;
import com.cg.bookstore.services.BookServices;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
/* @RequestMapping({"/api"}) */
public class BookServiceController {
	@Autowired
	BookServices bookServices;

	@RequestMapping(value= {"/test"},method= {RequestMethod.GET,RequestMethod.POST},
			
			produces= MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<String> testBookStore(){
		return new ResponseEntity<>("OKAY STATUS",HttpStatus.OK);
	}

	@RequestMapping(value= {"/addBook"},method=RequestMethod.POST,
			headers= "Accept=application/json",
			consumes= MediaType.APPLICATION_JSON_UTF8_VALUE,
			produces= MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<CustomResponse> addProductDetails(@RequestBody Book book){
		book=bookServices.addBook(book);
		return new ResponseEntity<>(new CustomResponse("Success!!", 123),HttpStatus.OK);
	}

	@RequestMapping(value= {"/updateBook"},method=RequestMethod.POST,
			headers= "Accept=application/json",
			consumes= MediaType.APPLICATION_JSON_UTF8_VALUE,
			produces= MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<CustomResponse> updateProductDetails(@RequestBody Book book) throws BookNotFoundException{
		book=bookServices.updateBook(book);
		return new ResponseEntity<>(new CustomResponse("Success!!", 123),HttpStatus.OK);

	}

	@RequestMapping(value= {"/getBookDetails/{bookIsbn}"},method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE,
			headers="Accept=application/json")
	public ResponseEntity<Book> getAssociateDetails(@PathVariable(value="bookIsbn") int bookIsbn)throws BookNotFoundException{
		Book book=bookServices.findBookByIsbn(bookIsbn);
		return new ResponseEntity<Book>(book,HttpStatus.OK);
	}
	@RequestMapping(value= {"/getAllBookDetails"},method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE,
			headers="Accept=application/json")
	public ResponseEntity<List<Book>> getCustomerDetailsPathParam(){
		return new ResponseEntity<List<Book>>(bookServices.viewAllBooks(),HttpStatus.OK);
	}
	
	@RequestMapping(value="/deleteBook/{bookIsbn}",method=RequestMethod.DELETE)
	public ResponseEntity<CustomResponse> removeBookbyPath(@PathVariable(value="bookIsbn")int bookIsbn) throws BookNotFoundException{
		bookServices.deleteBook(bookIsbn);
		return new ResponseEntity<>(new CustomResponse("Deleted!!", 123),HttpStatus.OK);
	}
}
