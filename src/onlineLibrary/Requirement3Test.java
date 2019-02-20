package onlineLibrary;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Requirement3Test {

	@Test
	public void test() {
		ShoppingCart shoppingcart=OnlineLibrary.CreatShoppingCart();
		String[] BooksNames = {"Java Book","Web design Book"} ;
		Integer[] BooksPrices= {127,100};
		ArrayList<Book> books=shoppingcart.addBooks(BooksNames,BooksPrices);
		for(int i=0;i<books.size();i++) {
			assertTrue(BooksNames[i].equals(books.get(i).bookName));
			assertTrue( BooksPrices[i]==books.get(i).bookPrice);
		}
		assertTrue(shoppingcart.bookCount==2&&shoppingcart.totalValue==227);	}

}
