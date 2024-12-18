package com.bookstore2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore2.model.Book;
import com.bookstore2.repository.BookRepository;

@Service
public class BookService
{
	@Autowired
	private BookRepository brepo;
	
	public void save(Book b)
	{
		brepo.save(b);
		
	}
	
	public List <Book> getAllBook()
	{
		return brepo.findAll();
	}
	
	public Book getBookById(int id)
	{
		return brepo.findById(id).get();
	}
	
	public void deleteById(int id)
	{
		brepo.deleteById(id);
	}
	
	
	
	
	
	

}
