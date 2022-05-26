package service;

import java.util.List;

import dao.BookDao;
import dao.BookDaoImp;
import entities.Book;

public class BookServiceImp implements  BookService
{
	private BookDao dao;
	
	public BookServiceImp() {
		dao=new BookDaoImp();
	}

	@Override
	public Book getBookById(int Id) {
		return dao.getBookById(Id);
	}

	@Override
	public List<Book> getBookByTitle(String Title) {
		return dao.getBookByTitle(Title);
	}

	@Override
	public List<Book> getAuthorBooks(String Author) {
		return dao.getAuthorBooks(Author);
	}

	@Override
	public List<Book> getBookInPriceRange(double low, double high) {
		return dao.getBookInPriceRange(low,high);
	}

	@Override
	public List<Book> getAllBooks() {
		return dao.getAllBooks();
	}

	@Override
	public long getBookCount() {
		return dao.getBookCount();
	}
	
}
