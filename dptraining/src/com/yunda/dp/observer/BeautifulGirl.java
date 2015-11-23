package com.yunda.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class BeautifulGirl implements Girl {

	List<Boy> boys = new ArrayList<Boy>();

	@Override
	public void registerObserver(Boy boy) {
		boys.add(boy);
	}

	@Override
	public void removeObserver(Boy boy) {
		boys.remove(boy);
	}

	@Override
	public void notifyObservers(String message) {
		for (Boy boy : boys) {
			boy.update(message);
		}
	}
	
	public void action(String action) {
		notifyObservers(action);
	}

	public static void main(String[] args) {
		Girl girl = new BeautifulGirl();
		Boy handsomeBoy = new HandsomeBoy();
		Boy uglyBoy = new UglyBoy();
		girl.registerObserver(handsomeBoy);
		girl.registerObserver(uglyBoy);
		girl.action("go to work");
		
	}

}
