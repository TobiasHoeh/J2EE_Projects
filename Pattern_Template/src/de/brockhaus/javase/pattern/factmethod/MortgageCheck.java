package de.brockhaus.javase.pattern.factmethod;


/**
 * 
 * @author mbohnen@brockhaus-group.com Copyright by: Brockhaus Group,
 *         Häusserstraße 36, 69115 Heidelberg
 * 
 */
// TODO extend appropriate class
public class MortgageCheck extends FinancialCheck {

	@Override
	protected void checkBank() {
		log.info("Checking bank 4 mortgage");
	}

	@Override
	protected void checkCredit() {
		log.info("Checking credit 4 mortgage");
	}

	// TODO override checkIncome
	@Override
	protected void checkIncome() {
		log.info("Checking income 4 mortgage");
	}

	@Override
	protected void checkLoan() {
		log.info("Checking loan 4 mortgage");
	}

	@Override
	protected void checkStock() {
		log.info("Checking stock 4 mortgage");
	}
}
