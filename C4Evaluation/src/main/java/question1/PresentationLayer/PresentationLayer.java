package question1.PresentationLayer;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import question1.DaoException.BookNotFoundException;
import question1.SeviceLayer.ServiceLayer;
import question1.daoBean.Book;
import question1.util.AppConfig;

public class PresentationLayer {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		ServiceLayer serviceLayer = ctx.getBean(ServiceLayer.class,"serviceLayer");
		
		boolean result = serviceLayer.addNewBook(new Book("How To Infulence", "Rajasekar", 100.05));
		System.out.println(result);
		
		List<Book> bookList = serviceLayer.getAllBooks();
		System.out.println(bookList);
		System.out.println("==================================");
		
		try {
			if(serviceLayer.deleteBookById(1)) {
				System.out.println("Deleted Successfully");
			}
		} catch (BookNotFoundException e) {
			System.out.println(e.getMessage()+"to delete");
		}
		
		
		try {
			Book myBook = serviceLayer.getBookById(2);
			System.out.println("Search Result for book is");
			System.out.println(myBook);
		} catch (BookNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
