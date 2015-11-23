package com.yunda.dp.observer;

public interface Girl {
	
	void registerObserver(Boy boy);
	
	void removeObserver(Boy boy);
	
	void notifyObservers(String message);
	
	void action(String action);

}
