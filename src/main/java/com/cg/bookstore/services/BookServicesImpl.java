package com.cg.bookstore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.bookstore.beans.Book;
import com.cg.bookstore.daoservices.BookDAOServices;
import com.cg.bookstore.exceptions.BookAlreadyExistException;
import com.cg.bookstore.exceptions.BookNotFoundException;
@Component("bookServices")
public class BookServicesImpl implements BookServices {
	
	@Autowired
	private BookDAOServices bookDAOServices;
	
	@Override
	public Book addBook(Book book) throws BookAlreadyExistException {
		/*
		 * Book checkBook=findBookByIsbn(book.getBookIsbn());
		 * if(checkBook.getBookIsbn()==book.getBookIsbn()) throw new
		 *  return
		 * bookDAOServices.save(book);
		 */
		if(bookDAOServices.existsById(book.getBookIsbn()))
			throw new BookAlreadyExistException("Book ISBN Already Exist.");
		return bookDAOServices.save(book);
	}

	@Override
	public Book updateBook(Book book) throws BookNotFoundException {
		Book oldBook=findBookByIsbn(book.getBookIsbn());
		bookDAOServices.deleteById(book.getBookIsbn());
		bookDAOServices.save(book);
		return book;
	}

	@Override
	public Book findBookByIsbn(int bookIsbn) throws BookNotFoundException {
		return bookDAOServices.findById(bookIsbn).orElseThrow(()->new BookNotFoundException("Book Not Found for ISBN : "+bookIsbn));
	}

	@Override
	public List<Book> viewAllBooks() throws BookNotFoundException {
		return bookDAOServices.findAll();
	}
	
	@Override
	public boolean deleteBook(int bookIsbn) throws BookNotFoundException{
		Book book=findBookByIsbn(bookIsbn);
		bookDAOServices.delete(book);
		return true;
	}
}
