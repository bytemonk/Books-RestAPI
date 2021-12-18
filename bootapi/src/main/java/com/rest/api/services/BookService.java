package com.rest.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rest.api.dao.BookRepository;
import com.rest.api.entities.Book;

import java.util.List;

@Component
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	
	//Get All Books
	public List<Book> getAllBooks() {
		List<Book> list = (List<Book>) this.bookRepository.findAll();
		return list;
	}
	
	//Get SIngle Book By ID
	public Book getBookById(int id) {
		Book book = null;
		try {
			book = this.bookRepository.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}
	
	//Adding the Book
	public Book addBook(Book b) {
		Book result = bookRepository.save(b);
		return result;
	}
	
	//Delete Book
	public void deleteBook(int b_id) {
		bookRepository.deleteById(b_id);
	}
	
	
	//Update the Book
	public void updateBook(Book book, int bookId) {
		
		book.setId(bookId);
		bookRepository.save(book);
	}
	
	
	
	
	
	
}
