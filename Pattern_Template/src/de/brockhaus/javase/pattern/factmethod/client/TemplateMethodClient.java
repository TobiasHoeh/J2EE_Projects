package de.brockhaus.javase.pattern.factmethod.client;

import de.brockhaus.javase.pattern.factmethod.LoanCheck;
import de.brockhaus.javase.pattern.factmethod.MortgageCheck;

/**
 * 
 * @author mbohnen@brockhaus-group.com
 * Copyright by: 
 * Brockhaus Group, Häusserstraße 36, 69115 Heidelberg
 *
 */
public class TemplateMethodClient
{
	public static void main(String[] args)
	{
		LoanCheck lc = new LoanCheck();
		//lc.check();
		
		MortgageCheck m = new MortgageCheck();
		m.check();
	}
}
