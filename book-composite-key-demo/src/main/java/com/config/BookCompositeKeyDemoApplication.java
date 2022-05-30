package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.config.model.Book;
import com.config.model.BookIdentity;
import com.config.repository.BookRepository;


@SpringBootApplication
public class BookCompositeKeyDemoApplication implements CommandLineRunner {
	
	@Autowired
	private BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookCompositeKeyDemoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		bookRepository.deleteAllInBatch();
		
		Book book = new Book(new BookIdentity("E-123", "D-457"),"Spring fundementals",1000);
		
		bookRepository.save(book);
		
		bookRepository.findById(new BookIdentity("E-123", "D-457"));

		//bookRepository.findByBookId("E-123");
	}

}


















