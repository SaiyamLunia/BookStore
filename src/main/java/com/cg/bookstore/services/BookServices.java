package com.cg.bookstore.services;

import java.util.List;

import com.cg.bookstore.beans.Book;
import com.cg.bookstore.exceptions.BookAlreadyExistException;
import com.cg.bookstore.exceptions.BookNotFoundException;

public interface BookServices {
	public Book addBook(Book book) throws BookAlreadyExistException;
	public Book updateBook(Book book)throws BookNotFoundException;
	public Book findBookByIsbn(int bookIsbn)throws BookNotFoundException;
	public List<Book> viewAllBooks() throws BookNotFoundException;
	public boolean deleteBook(int bookIsbn) throws BookNotFoundException;
}
