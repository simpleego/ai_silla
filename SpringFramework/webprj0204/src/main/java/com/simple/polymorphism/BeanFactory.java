package com.simple.polymorphism;

public class BeanFactory {
	
	public Object getBean(String beanName) {
		
		if (beanName.equals("samsung")) {
			return null;//new //SamsungTV();
		}
		
		if (beanName.equals("lg")) {
			return new LgTV();
		}		
		
		return null;		
	}

}
