package onlineLibrary;

import java.util.ArrayList;

public class ShoppingCart {
	public ShoppingCart() {
		books=new ArrayList<Book>();
		totalValue=bookCount=0;
	}
	public int bookCount,totalValue;
	public ArrayList<Book> books;
	public  Book addBook(String bookName, int bookPrice) {
		// TODO Auto-generated method stub
		Book book=new Book();
		book.bookName=bookName;
		book.bookPrice=bookPrice;
		books.add(book);
		bookCount++;
		totalValue+=bookPrice;
		return book;
	}

	public ArrayList<Book> addBooks(String[] booksNames, Integer[] booksPrices) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<booksNames.length;i++) {
			Book book=new Book();
			book.bookName=booksNames[i];
			book.bookPrice=booksPrices[i];
			books.add(book);
			bookCount++;
			totalValue+=booksPrices[i];
		}
		return books;
	}

}
