package com.RoeRiverBooks;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BookNotAvailableExceptionTest {
	@Rule public ExpectedException thrown = ExpectedException.none();

	// @Before
	// // public void setUp() throws Exception {
	// // }

	@Test
	public void testBookNotAvailableException()
			throws BookNotAvailableException {

		String expected = "Book not available";
		thrown.expect(BookNotAvailableException.class);
		thrown.expectMessage(expected);
		throw new BookNotAvailableException(expected);
	}

}
