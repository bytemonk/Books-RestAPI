package com.rest.api.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Author {

	@Id
	private int authorid;
	private String firstname;
	private String lastname;
	private String nationality;

	@OneToOne(mappedBy = "author")
	@JsonBackReference
	private Book book;
	
	public Author(int authorid, String firstname, String lastname, String nationality) {
		super();
		this.authorid = authorid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.nationality = nationality;
	}

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int getAuthorid() {
		return authorid;
	}

	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

}
