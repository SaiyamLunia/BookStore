package com.cg.bookstore.daoservices;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bookstore.beans.Book;

public interface BookDAOServices extends JpaRepository<Book, Integer>{

}
