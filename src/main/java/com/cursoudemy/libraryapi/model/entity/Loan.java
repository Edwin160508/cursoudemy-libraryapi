package com.cursoudemy.libraryapi.model.entity;

import java.time.LocalDate;
import javax.persistence.*;

@Entity
public class Loan {

	@Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private Long id;

    @Column(length = 100)
    private String customer;

    @Column(name = "customer_email")
    private String customerEmail;

    @JoinColumn(name = "id_book")
    @ManyToOne
    private Book book;

    @Column
    private LocalDate loanDate;

    @Column
    private Boolean returned;
    
    public Loan() {}
	public Loan(Long id, String customer, String customerEmail, Book book, LocalDate loanDate, Boolean returned) {
		super();
		this.id = id;
		this.customer = customer;
		this.customerEmail = customerEmail;
		this.book = book;
		this.loanDate = loanDate;
		this.returned = returned;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public LocalDate getLoanDate() {
		return loanDate;
	}
	public void setLoanDate(LocalDate loanDate) {
		this.loanDate = loanDate;
	}
	public Boolean getReturned() {
		return returned;
	}
	public void setReturned(Boolean returned) {
		this.returned = returned;
	}
	
	
    
    
}
