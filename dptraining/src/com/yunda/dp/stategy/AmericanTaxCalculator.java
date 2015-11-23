package com.yunda.dp.stategy;

public class AmericanTaxCalculator implements TaxCalculator {

	@Override
	public double computeIncomeTax(double income) {
		if (income <= 8000) {
			return 0;
		}
		return (income - 8000) * 0.25;
	}

}
