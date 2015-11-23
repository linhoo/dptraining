package com.yunda.dp.observer;

public class HandsomeBoy implements Boy {

	@Override
	public void update(String message) {
		System.out.println("I am handsome");
		System.out.println(message);
		System.out.println("I will persuit her");
	}

}
