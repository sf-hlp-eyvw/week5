package com.RoeRiverBooks;

import java.util.ArrayList;
import java.util.List;

import com.bobswarehouse.BookLookUpService;

public class BookOrder {

	private double totalOrderCost = 0.0;
	private BookLookUpService bookLookup;
	List<Book> bookOrderList = new ArrayList<Book>();

	public void addBookToOrderList(Book book) {

		bookOrderList.add(book);
	}

	public void addOrder(Book order) throws BookNotAvailableException {
		if((order instanceof HardcoverBook) && (bookLookup.lookup(order.isbn) < 1)){
			throw new BookNotAvailableException("HardcoverBook : " + order.isbn
					+ "is not available;");
		}
		else {
			totalOrderCost= totalOrderCost + order.calculateTotalPrice();
			bookOrderList.add(order);
		}
	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("ISBN \t" + "Cost \t" + "Zip \t" + "ShipOption \n");

		for (Book book : bookOrderList) {
			result.append(book.getIsbn() + "\t" + book.getOrderPrice() + "\t"
					+ book.getZipCode() + " \t" + book.getShipOption() + "\n");
		}
		return result.toString();
	}

}
