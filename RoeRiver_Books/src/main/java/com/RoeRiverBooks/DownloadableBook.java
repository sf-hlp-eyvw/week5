package com.RoeRiverBooks;


public class DownloadableBook extends Book {

	DownloadableBook(String isbn, double basePrice, int zipCode,
			ShipOption shipOption) {
		super(isbn, basePrice, zipCode, shipOption);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateTotalPrice() {
		return basePrice * calculateSalesTax();
	}

}
