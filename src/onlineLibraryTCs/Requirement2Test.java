package onlineLibraryTCs;


import static org.junit.Assert.*;
import org.junit.Test;
import onlineLibrary.Book;
import onlineLibrary.OnlineLibrary;
import onlineLibrary.ShoppingCart;

public class Requirement2Test {

	@Test
	public void test() {
		ShoppingCart shoppingcart=OnlineLibrary.CreatShoppingCart();
		Book book=shoppingcart.addBook("Java Book",127);
		assertTrue(book.bookName=="Java Book"&&book.bookPrice==127);
		assertTrue(shoppingcart.bookCount==1&&shoppingcart.totalValue==127);
		
	}

}
