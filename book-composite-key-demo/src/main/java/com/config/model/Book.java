package com.config.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "books")
public class Book {

	@EmbeddedId
	private BookIdentity bookIdentity;

	@NotNull
	@Size(max = 50)
	private String title;

	@NaturalId
	@NotNull
	private int price;

	public Book() {

	}
	

	public Book(BookIdentity bookIdentity,String title,int price) {
		this.bookIdentity = bookIdentity;
		this.title = title;
		this.price = price;
	}

	public BookIdentity getBookIdentity() {
		return bookIdentity;
	}

	public void setBookIdentity(BookIdentity bookIdentity) {
		this.bookIdentity = bookIdentity;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
