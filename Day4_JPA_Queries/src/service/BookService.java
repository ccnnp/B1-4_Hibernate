package service;

import java.util.List;

import entities.Book;

public interface BookService 
{
	public abstract Book getBookById(int Id);
	public abstract List<Book>getBookByTitle(String Title);
	public abstract List<Book>getAuthorBooks(String Author);
	public abstract List<Book>getBookInPriceRange(double low,double high);
	public abstract List<Book>getAllBooks();
	public abstract long getBookCount();
}
