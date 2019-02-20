

import static org.junit.Assert.*;

import org.junit.Test;

import onlineLibrary.OnlineLibrary;
import onlineLibrary.ShoppingCart;

public class Requirement1Test {

	@Test
	public void test() {
		ShoppingCart shoppingcart=OnlineLibrary.CreatShoppingCart();
		assertTrue(shoppingcart.bookCount==0&&shoppingcart.totalValue==0);
	}

}
