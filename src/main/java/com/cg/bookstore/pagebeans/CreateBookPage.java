package com.cg.bookstore.pagebeans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateBookPage {

	@FindBy(how=How.NAME,name="bookTitle")
	private WebElement bookTitle ;
	
	@FindBy(how=How.NAME,name="bookAuthor")
	private WebElement bookAuthor ;
	
	@FindBy(how=How.NAME,name="bookIsbn")
	private WebElement bookIsbn ;
	
	@FindBy(how=How.NAME,name="bookPublishDate")
	private WebElement bookPublishDate ;
	
	@FindBy(how=How.NAME,name="bookImage")
	private WebElement bookImage ;
	
	@FindBy(how=How.NAME,name="bookPrice")
	private WebElement bookPrice ;
	
	@FindBy(how=How.NAME,name="bookDescription")
	private WebElement bookDescription ;
	
	@FindBy(how=How.NAME,name="save")
	private WebElement saveBtn;
	
	public void clickSignUp() {
		saveBtn.submit();
	}

	public String getBookTitle() {
		return bookTitle.getAttribute("value");
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle.sendKeys(bookTitle);
	}

	public String getBookAuthor() {
		return bookAuthor.getAttribute("value");
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor.sendKeys(bookAuthor);
	}

	public String getBookIsbn() {
		return bookIsbn.getAttribute("value");
	}

	public void setBookIsbn(String bookIsbn) {
		this.bookIsbn.sendKeys(bookIsbn);
	}

	public String getBookPublishDate() {
		return bookPublishDate.getAttribute("value");
	}

	public void setBookPublishDate(String bookPublishDate) {
		this.bookPublishDate.sendKeys(bookPublishDate);
	}

	public String getBookImage() {
		return bookImage.getAttribute("value");
	}

	public void setBookImage(String bookImage) {
		this.bookImage.sendKeys(bookImage);
	}

	public String getBookPrice() {
		return bookPrice.getAttribute("value");
	}

	public void setBookPrice(String bookPrice) {
		this.bookPrice.sendKeys(bookPrice);
	}

	public String getBookDescription() {
		return bookDescription.getAttribute("value");
	}

	public void setBookDescription(String bookDescription) {
		this.bookDescription.sendKeys(bookDescription);
	}

}
