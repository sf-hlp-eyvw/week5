package com.RoeRiverBooks;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class BookTest {

	Book hardCoverBook;
	Book downloadableBook;
	Book book;

	@Before
	public void setUp() throws Exception {
		hardCoverBook = new HardcoverBook("2345", 10.0, 75087,
				ShipOption.SAME_DAY);
		downloadableBook = new DownloadableBook("2345", 11.0, 75087,
				ShipOption.NORMAL);
		book = new Book("2345", 12.0, 75087, ShipOption.NORMAL);
	}

	@Test
	public void test_Creating_A_Book() {
		assertThat(book.getBasePrice(), equalTo(12.0));
		assertThat(book.getIsbn(), is("2345"));
		assertThat(book.getZipCode(), equalTo(75087));
		assertThat(book.getShipOption(), equalTo(ShipOption.NORMAL));

	}

	@Test
	public void test_Creating_A_HardCoverBook() {
		assertThat(book.getBasePrice(), equalTo(12.0));
	}

	@Test
	public void test_calculating_buying_one_book_with_SameDayShipping() {
		assertThat(hardCoverBook.calculateTotalPrice(), is(750892.0));
	}
}
