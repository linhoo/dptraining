package com.yunda.dp.stategy;

public class ChineseTaxCalculator implements TaxCalculator {

	@Override
	public double computeIncomeTax(double income) {
		if (income <= 3500) {
			return 0;
		}
		return (income - 3500) * 0.25;
	}

}
