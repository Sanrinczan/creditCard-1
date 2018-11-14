package pl.jkan.creditcard;
import java.lang.*; // Yolo

class CreditCard {
	private double limit = 0;

	public void assignLimit(double limit) {
		if(limit < 0){
			throw new IllegalArgumentException("Limit is to low");
		}
		this.limit = limit;
	}   

	public double getLimit() {
		return limit;
	}
}
