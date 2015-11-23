package com.yunda.dp.observer;

public class UglyBoy implements Boy {

	@Override
	public void update(String message) {
		System.out.println("I am ugly boy");
		System.out.println(message);
		System.out.println("I am sad");
	}

}
