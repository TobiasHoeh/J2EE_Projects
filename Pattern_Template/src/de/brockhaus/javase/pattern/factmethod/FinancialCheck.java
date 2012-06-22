package de.brockhaus.javase.pattern.factmethod;

import java.util.logging.Logger;

/**
 * 
 * @author mbohnen@brockhaus-group.com Copyright by: Brockhaus Group,
 *         Häusserstraße 36, 69115 Heidelberg
 * 
 */
public abstract class FinancialCheck {
	protected Logger log = Logger.getLogger(this.getClass().getName());

	// these methods must be implemented by subclasses
	protected abstract void checkBank();

	protected abstract void checkCredit();

	protected abstract void checkLoan();

	protected abstract void checkStock();

	/** this might be overwritten, if not, this is the default behaviour */
	protected void checkIncome() {
		log.info("Checking income");
	}

	/**
	 * template method, the way it happens is all the same 4 subclasses
	 */
	// TODO implement according to pattern
	public final void check() {
		// TODO checkBank
		this.checkBank();
		// TODO checkCredit
		this.checkCredit();
		// TODO checkLoan
		this.checkLoan();
		// TODO checkStock
		this.checkStock();
		// TODO check income
		this.checkIncome();
	}
}
