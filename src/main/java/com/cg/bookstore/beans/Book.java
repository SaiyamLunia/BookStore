package com.cg.bookstore.beans;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	private String bookTitle,bookAuthor,bookDescription;
	@Id
	private int bookIsbn;
	private float bookPrice;
	private Date bookPublishDate;
	public Book() {}
	public Book(String bookTitle, String bookAuthor, String bookDescription, int bookIsbn, float bookPrice,
			Date bookPublishDate) {
		super();
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookDescription = bookDescription;
		this.bookIsbn = bookIsbn;
		this.bookPrice = bookPrice;
		this.bookPublishDate = bookPublishDate;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookDescription() {
		return bookDescription;
	}
	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}
	public int getBookIsbn() {
		return bookIsbn;
	}
	public void setBookIsbn(int bookIsbn) {
		this.bookIsbn = bookIsbn;
	}
	public float getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}
	public Date getBookPublishDate() {
		return bookPublishDate;
	}
	public void setBookPublishDate(Date bookPublishDate) {
		this.bookPublishDate = bookPublishDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookAuthor == null) ? 0 : bookAuthor.hashCode());
		result = prime * result + ((bookDescription == null) ? 0 : bookDescription.hashCode());
		result = prime * result + bookIsbn;
		result = prime * result + Float.floatToIntBits(bookPrice);
		result = prime * result + ((bookPublishDate == null) ? 0 : bookPublishDate.hashCode());
		result = prime * result + ((bookTitle == null) ? 0 : bookTitle.hashCode());
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
		if (bookAuthor == null) {
			if (other.bookAuthor != null)
				return false;
		} else if (!bookAuthor.equals(other.bookAuthor))
			return false;
		if (bookDescription == null) {
			if (other.bookDescription != null)
				return false;
		} else if (!bookDescription.equals(other.bookDescription))
			return false;
		if (bookIsbn != other.bookIsbn)
			return false;
		if (Float.floatToIntBits(bookPrice) != Float.floatToIntBits(other.bookPrice))
			return false;
		if (bookPublishDate == null) {
			if (other.bookPublishDate != null)
				return false;
		} else if (!bookPublishDate.equals(other.bookPublishDate))
			return false;
		if (bookTitle == null) {
			if (other.bookTitle != null)
				return false;
		} else if (!bookTitle.equals(other.bookTitle))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Book [bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ", bookDescription=" + bookDescription
				+ ", bookIsbn=" + bookIsbn + ", bookPrice=" + bookPrice + ", bookPublishDate=" + bookPublishDate + "]";
	}
}
