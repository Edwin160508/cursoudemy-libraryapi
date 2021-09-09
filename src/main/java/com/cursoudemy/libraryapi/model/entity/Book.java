package com.cursoudemy.libraryapi.model.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table
public class Book {

	
	@Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;

    @Column
    private String title;

    @Column
    private String author;

    @Column
    private String isbn;

    @OneToMany( mappedBy = "book" )
    private List<Loan> loans;

    public Book() {}
	public Book(Long id, String title, String author, String isbn, List<Loan> loans) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.loans = loans;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public List<Loan> getLoans() {
		return loans;
	}
	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}
	
	
    
    

}
