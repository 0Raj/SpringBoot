package question1.daoBean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int bookID;
	private String name;
	private String author;
	private double price;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", name=" + name + ", author=" + author + ", price=" + price + "]";
	}

	public Book( String name, String author, double price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	

}
