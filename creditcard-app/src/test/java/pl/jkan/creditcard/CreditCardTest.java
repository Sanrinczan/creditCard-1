package pl.jkan.creditcard;

import org.junit.Assert;
import org.junit.Test;

public class CreditCardTest {

	@Test
	public void limitDefaultsToZero(){
		CreditCard card = new CreditCard();

		Assert.assertTrue(card.getLimit() == 0);
	}

	@Test
	public void unableToAssignNegativeLimit(){
		CreditCard card = new CreditCard();

		int limitBefore = card.getLimit();
		card.assignLimit(-100);
		int limitAfter = card.getLimit();

		Assert.assertTrue(limitBefore == limitAfter);
	}

	@Test
	public void assignCreditLimitToCard() {
		CreditCard card = new CreditCard();

		card.assignLimit(2000);

		Assert.assertTrue(card.getLimit() == 2000);
	}
}
