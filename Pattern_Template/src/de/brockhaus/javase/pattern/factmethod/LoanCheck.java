package de.brockhaus.javase.pattern.factmethod;

/**
 * Things that needs to be done during a loan check, this is probably different
 * to the things that needs to be done for mortgage.
 * 
 * @author mbohnen@brockhaus-group.com Copyright by: Brockhaus Group,
 *         Häusserstraße 36, 69115 Heidelberg
 * 
 */
// TODO extend appropriate class
public class LoanCheck extends FinancialCheck {

	@Override
	protected void checkBank() {
		log.info("Checking bank 4 loan");
	}

	// TODO override missing methods

	@Override
	protected void checkLoan() {
		log.info("Checking loan 4 loan");
	}

	@Override
	protected void checkStock() {
		log.info("Checking stock 4 loan");
	}

	@Override
	protected void checkCredit() {
		// TODO Auto-generated method stub

	}
}
