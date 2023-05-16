package com.weeklyTest.mapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weeklyTest.mapping.model.Book;
import com.weeklyTest.mapping.repository.IBookRepository;

@Service
public class BookService {
	@Autowired
	private IBookRepository bookRepo;
	
	//create 
		public Book addBook(Book newBook) {
			return bookRepo.save(newBook);
		}
		//get by id
		public Book getBookById(int id) {
			return bookRepo.findById(id).get();
		}
		
		//get all 
			public List<Book> getAllBook(){
				return bookRepo.findAll();
			}
			
			//delete
			public void deleteBookById(int id) {
				bookRepo.deleteById(id);
			}
			
			//update by id
			
			public void updateBookById(int id, Book newBook) {
				Book books = bookRepo.findById(id).get();
				books.setAuthor(newBook.getAuthor());
				books.setBookId(newBook.getBookId());
				books.setDescription(newBook.getDescription());
				books.setPrice(newBook.getPrice());
				books.setTitle(newBook.getTitle());
				books.setStudent(newBook.getStudent());
				
				bookRepo.save(books);
				
				
			}


}
