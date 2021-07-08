package com.epam.unit06.task03;

import java.util.Random;

public class Book {

	private int id;
	private String title;
	private String authors;
	private int year;
	private String publisher;
	private int pagesNumber;
	private double price;
	private String bindingForm;

	public int getId() {
		return id;
	}

	public Book(String title, String authors, int year, String publisher, int pagesNumber, double price,
			String bindingForm) {

		setId();
		this.title = title;
		this.authors = authors;
		this.year = year;
		this.publisher = publisher;
		this.pagesNumber = pagesNumber;
		this.price = price;
		this.bindingForm = bindingForm;
	}

	public Book(String title, String authors, int year, String publisher) {

		setId();
		this.title = title;
		this.authors = authors;
		this.year = year;
		this.publisher = publisher;

	}

	public void setId() {
		Random rand = new Random();
		this.id = rand.nextInt(1000);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPagesNumber() {
		return pagesNumber;
	}

	public void setPagesNumber(int pagesNumber) {
		this.pagesNumber = pagesNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBindingForm() {
		return bindingForm;
	}

	public void setBindingForm(String bindingForm) {
		this.bindingForm = bindingForm;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authors == null) ? 0 : authors.hashCode());
		result = prime * result + ((bindingForm == null) ? 0 : bindingForm.hashCode());
		result = prime * result + id;
		result = prime * result + pagesNumber;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (authors == null) {
			if (other.authors != null)
				return false;
		} else if (!authors.equals(other.authors))
			return false;
		if (bindingForm == null) {
			if (other.bindingForm != null)
				return false;
		} else if (!bindingForm.equals(other.bindingForm))
			return false;
		if (id != other.id)
			return false;
		if (pagesNumber != other.pagesNumber)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\nBook id=" + id + ", title=" + title + ", authors=" + authors + ", year=" + year + ", publisher="
				+ publisher + ", pagesNumber=" + pagesNumber + ", price=" + price + ", bindingForm=" + bindingForm + "";
	}

}
