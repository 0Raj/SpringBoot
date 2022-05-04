package question1.SeviceLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import question1.DaoException.BookNotFoundException;
import question1.DataAccessLayer.DataAccessLayer;
import question1.daoBean.Book;

@Service
public class ServiceLayer {
	
	@Autowired
	private DataAccessLayer dataAccessLayer;
	
	public List<Book> getAllBooks(){
		return this.dataAccessLayer.getAllBook();
	}
	
	public Book getBookById(int id) throws BookNotFoundException{
		return this.dataAccessLayer.getBookById(id);
	}
	
	public boolean addNewBook(Book book) {
		return this.dataAccessLayer.addNewBook(book);
	}
	
	public boolean deleteBookById(int id) throws BookNotFoundException {
		
		return this.dataAccessLayer.deleteBookById(id);
	}
	
	public boolean updateBook(int id) throws BookNotFoundException {
		
		return this.dataAccessLayer.updateBook(id);
	}
}
