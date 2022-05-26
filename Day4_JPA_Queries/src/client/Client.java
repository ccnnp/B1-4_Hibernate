package client;

import service.BookService;
import service.BookServiceImp;

public class Client {

	public static void main(String[] args) 
	{
		BookService obj=new BookServiceImp();
		System.out.println("Total no. of books");
		System.out.println("Total books: "+obj.getBookCount());
		
		System.out.println("Listing Book with Id:102");
		System.out.println("Total books: "+obj.getBookById(102));
		
		System.out.println("Listing all Books:");
		System.out.println("Total books: "+obj.getAllBooks());
		
		System.out.println("Book written by Upendra:");
		System.out.println("Total books: "+obj.getAuthorBooks("Upendra"));
		
		System.out.println("Book by Title:");
		System.out.println("Total books: "+obj.getBookByTitle("Python"));
		
		System.out.println("Listing book between 200 to 500:");
		System.out.println("Total books: "+obj.getBookInPriceRange(200,500));
	}

}
