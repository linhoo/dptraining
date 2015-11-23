package com.yunda.dp.stategy;

public class Accountant {

	TaxCalculator calculator;

	double computeIncomeTax(double income) {
		return calculator.computeIncomeTax(income);
	}

	void setTaxCalculator(TaxCalculator calculator) {
		this.calculator = calculator;
	}
	
	public static void main(String[] args) {
		double income = 10000;
		Accountant accountant = new Accountant();
		TaxCalculator chineseCalculator = new ChineseTaxCalculator();
		TaxCalculator usCalculator = new AmericanTaxCalculator();
		accountant.setTaxCalculator(chineseCalculator);
		System.out.println(accountant.computeIncomeTax(income));
		accountant.setTaxCalculator(usCalculator);
		System.out.println(accountant.computeIncomeTax(income));
	}

}
