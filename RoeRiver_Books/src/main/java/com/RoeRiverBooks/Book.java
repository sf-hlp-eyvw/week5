package com.RoeRiverBooks;

import com.bobswarehouse.BookLookUpService;

public class Book {

	String isbn;
	double basePrice;
	int zipCode;
	ShipOption shipOption;
	double totalPrice;

	BookLookUpService lookupService = new BookLookUpService();

	Book(String isbn, double basePrice, int zipCode, ShipOption shipOption) {
		super();
		this.isbn = isbn;
		this.basePrice = basePrice;
		this.zipCode = zipCode;
		this.shipOption = shipOption;
	}

	public double calculateTotalPrice() {
		return this.basePrice;
	}

	public double getOrderPrice() {
		return totalPrice;
	}

	public String getIsbn() {
		return isbn;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public int getZipCode() {
		return zipCode;
	}

	public ShipOption getShipOption() {
		return shipOption;
	}

	public double calculateSalesTax() {
		return zipCode * basePrice;
	}

}
