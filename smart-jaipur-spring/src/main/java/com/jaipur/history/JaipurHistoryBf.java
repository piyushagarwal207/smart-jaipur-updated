package com.jaipur.history;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class JaipurHistoryBf implements HistoryObject {

	@Override
	public String getPlace(String placeid) {
		// TODO Auto-generated method stub
		System.out.println("Hello Jaipur History BFunction "+placeid);
		return ("Hello Jaipur History BFunction "+placeid);
	}
	
}
