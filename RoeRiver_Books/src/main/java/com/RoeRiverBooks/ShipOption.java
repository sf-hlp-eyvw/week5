package com.RoeRiverBooks;

public enum ShipOption {
	SAME_DAY("24 hours", 1.20), THREE_DAY("72 hours", 1.15), GROUND("5 days",
			1.05), NORMAL("normal", 1);

	double incrementPercent;
	String description;

	ShipOption(String description, double incrementPercent) {
		this.incrementPercent = incrementPercent;
	}
}
