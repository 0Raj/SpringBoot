package question1.DataAccessLayer;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import question1.DaoException.BookNotFoundException;
import question1.daoBean.Book;
import question1.util.MyEntityManager;

@Repository
public class DataAccessLayer implements DataAccessLayerInterFace {

	@Override
	public List<Book> getAllBook() {
		List<Book> booksList = null;
		
		EntityManager em = MyEntityManager.connectEntityManager();
		
		String jpql = "Select a from Book a";
		
		TypedQuery<Book> myQuery = em.createQuery(jpql, Book.class);
		
		booksList = myQuery.getResultList();
		
		em.close();
		
		return booksList;
	}

	@Override
	public Book getBookById(int id) throws BookNotFoundException {
		Book resultBook = null;
		
		EntityManager em = MyEntityManager.connectEntityManager();
		
		resultBook = em.find(Book.class, id);
		
		if(resultBook == null) {
			throw new BookNotFoundException("Book Not Found");
		}
		
		em.close();
		
		return resultBook;
	}

	@Override
	public boolean addNewBook(Book book) {
		
		boolean result = true;
		
		EntityManager em = MyEntityManager.connectEntityManager();
		
		em.getTransaction().begin();
		em.persist(book);
		em.getTransaction().commit();
		
		return result;
	}

	@Override
	public boolean deleteBookById(int id) throws BookNotFoundException {
		boolean result = false;
		EntityManager em = MyEntityManager.connectEntityManager();
		Book myBook = em.find(Book.class, id);
		
		if(myBook != null) {
			em.getTransaction().begin();
			em.remove(myBook);
			em.getTransaction().commit();
			result = true;
		}else {
			throw new BookNotFoundException("Book Not found");
		}
		
		return result;
	}

	@Override
	public boolean updateBook(int id) throws BookNotFoundException {
		boolean result = false;
		
		return result;
	}
	
}
