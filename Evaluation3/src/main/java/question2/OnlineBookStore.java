package question2;
/*
 * Requirements:
 * 	• Searching the database of books and reading a book.
 * 	• User membership creation and extension.
 *	• Only one active user at a time and only one active book by this user
 *
 *	Assumptions:
 *	• Registered User can login and logout;
 *	• Not Registered user can register and surf on available books;
 *  • Registered User can buy membership;
 *  • Only members can access the books	and extend membership;
 * */

import java.util.List;

public class OnlineBookStore {
	private List<Book> bookDatabase;
	private List<RegisteredUser> registeredUser;
	private RegisteredUser guest;

	public void registerAccount(RegisteredUser guest) {
		registeredUser.add(guest);
	}
	
	public void searchBooks() {
		
	}
}

abstract class User {
	private String name;
	private int age;
	private int mobileNumber;

	abstract public void searchBooks();

	// getters and setters will be added
}

class RegisteredUser extends User {
	private int userId;

	@Override
	public void searchBooks() {
		// TODO Auto-generated method stub
		// can see description of books
	}

	public void buyMemberShip() {
		
	}
	
	public void login() {
		
	}
	public void logOut() {
		
	}
	// getters and setters will be added
}
class NonRegistedUser extends User {

	@Override
	public void searchBooks() {
		// TODO Auto-generated method stub
		// can see description of books
	}

	public void register() {
		
	}
	
}

class Members extends User {
	private int memberId;
	Book selectedBook;

	@Override
	public void searchBooks() {
		// TODO Auto-generated method stub
		this.selectedBook = null;
	}

	public void readBook() {

	}
	public void extenMembership() {

	}
	// getters and setters will be added

}

class Book {
	private String bookName;
	private String autherName;

	List<Members> memberList;

	public void access(int memberId) {
		// if available in list of members then only can access book;
	}
	// getters and setters will be added
}
