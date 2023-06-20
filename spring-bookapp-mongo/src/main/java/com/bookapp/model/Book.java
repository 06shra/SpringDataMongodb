package com.bookapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document
public class Book {
	/*
	 * public void Book1(int i, String string, String string2, String string3,
	 * double d) { // TODO Auto-generated constructor stub } public void Book(int i,
	 * String string, String string2, String string3, double d) { // TODO
	 * Auto-generated constructor stub } public void Book2(int i, String string,
	 * String string2, String string3, double d) { // TODO Auto-generated
	 * constructor stub } public void Book3(int i, String string, String string2,
	 * String string3, double d) { // TODO Auto-generated constructor stub } public
	 * void Book4(int i, String string, String string2, String string3, double d) {
	 * // TODO Auto-generated constructor stub } public void Book5(int i, String
	 * string, String string2, String string3, double d) { // TODO Auto-generated
	 * constructor stub }
	 */
	@Id
	private Integer id;
	private String title;
	private String author;
	private String category;
	private double cost;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Book(Integer id, String title, String author, String category, double cost) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.category = category;
		this.cost = cost;
	}
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", category=" + category + ", cost="
				+ cost + "]";
	}
	
	

}
