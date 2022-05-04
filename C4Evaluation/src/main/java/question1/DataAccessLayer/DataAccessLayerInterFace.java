package question1.DataAccessLayer;

import java.util.List;

import question1.DaoException.BookNotFoundException;
import question1.daoBean.Book;

public interface DataAccessLayerInterFace {

	public List<Book> getAllBook();
	
	public Book getBookById(int id) throws BookNotFoundException;
	
	public boolean addNewBook(Book book);
	
	public boolean deleteBookById(int id) throws BookNotFoundException;
	
	public boolean updateBook(int id) throws BookNotFoundException;
	
	
}
