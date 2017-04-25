package com.RoeRiverBooks;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class BookOrderTest {

	Book hardCoverBook;
	Book downloadableBook;
	Book book;

	@Before
	public void setUp() throws Exception {
		hardCoverBook = new HardcoverBook("2347", 10.0, 75087,
				ShipOption.SAME_DAY);
		downloadableBook = new DownloadableBook("2348", 10.0, 75087,
				ShipOption.NORMAL);
		book = new Book("2345", 10.0, 75087, ShipOption.NORMAL);
	}

	@Test
	public void test_Creating_A_Book() {
		assertThat(book.getBasePrice(), is(10.0));
		assertThat(book.getIsbn(), is("2345"));
		assertThat(book.getZipCode(), is(75087));
		assertThat(book.getShipOption(), is(ShipOption.NORMAL));

	}

	@Test
	public void test_books_added_to_orderList() {
		BookOrder bookOrder = new BookOrder();
		bookOrder.addBookToOrderList(book);
		bookOrder.addBookToOrderList(hardCoverBook);
		System.out.println(bookOrder.toString());
		assertThat(
				bookOrder.toString(),
				is("ISBN \tCost \tZip \tShipOption \n2345\t0.0\t75087 \tNORMAL\n2347\t0.0\t75087 \tSAME_DAY\n"));
	}



}