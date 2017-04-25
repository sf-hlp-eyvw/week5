package com.RoeRiverBooks;

public class HardcoverBook extends Book {

	HardcoverBook(String isbn, double basePrice, int zipCode,
			ShipOption shipOption) {
		super(isbn, basePrice, zipCode, shipOption);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateTotalPrice() {
		return basePrice + (this.shipOption.incrementPercent * this.basePrice)
				+ calculateSalesTax();
	}
}
