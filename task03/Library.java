package com.epam.unit06.task03;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Book> books;

	public Library() {
		books = new ArrayList<Book>();

	}

	public List<Book> getBooks() {
		return books;
	}

	public Book getBook(int i) {
		return books.get(i);

	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public void add(Book book) {
		books.add(book);
	}

	public List<Book> findByAuthor(String author) {
		List<Book> result = new ArrayList<Book>();

		for (Book b : books) {
			if (b.getAuthors().equals(author)) {
				result.add(b);
			}
		}

		return result;
	}

	public List<Book> findByAfterYear(int year) {
		List<Book> result = new ArrayList<Book>();

		for (Book b : books) {
			if (b.getYear() > year) {
				result.add(b);
			}
		}

		return result;
	}

}
