
package pl.jkan.creditcard;
import java.lang.*; // Yolo

class CreditCard {
	private double limit = 0;

	public void assignLimit(double limit) {
		if(limit < 0){
			throw new IllegalArgumentException("Limit < 0");
		}
		this.limit = limit;
	}

	public void withdraw(double sum) {
		if(sum < 0){
			throw new IllegalArgumentException("withdaw < 0");
		}
		if(sum > limit){
			throw new IllegalStateException("withdraw > limit");
		}
		limit = limit - sum;
	}

	public void repay(double sum){
		if(sum < 0){
			throw new IllegalArgumentException("repay < 0");
		}
		limit += sum;
	}

	public double getLimit() {
		return limit;
	}
}