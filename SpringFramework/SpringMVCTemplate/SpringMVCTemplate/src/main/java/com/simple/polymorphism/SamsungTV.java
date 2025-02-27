package com.simple.polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("tv")
public class SamsungTV implements TV{	

	@Autowired
	@Qualifier("apple")
	//@Resource (name="apple")
	private Speaker speaker;
	private int price ;
		
	public SamsungTV(Speaker speaker, int price) {
		this.speaker = speaker;
		this.price = price;
		System.out.println("===> SamsungTV(2) 객체 생성... "+"가격:"+price);
	}

	public SamsungTV(){
		System.out.println("TV 생성자 호출됨..");
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("===> SamsungTV(2) 객체 생성");
		this.speaker = speaker;
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() 호출");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("===> setPrice() 호출");
		this.price = price;
	}
	
	public void initMethod() {
		System.out.println("객체 초기화 작업 처리..");
	}
	
	public void destroyMethod() {
		System.out.println("객체 삭제 전에 처리할 로직 처리...");
	}
	
	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다.");
	}
	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}
	public void volumeUp() {
		//speaker = new SonySpeaker();
		speaker.volumeUp();
		//System.out.println("SamsungTV---소리 올린다.");
	}
	
	public void volumeDown() {
		//speaker = new SonySpeaker();
		speaker.volumeDown();
		//System.out.println("SamsungTV---소리 내린다.");
	}
	
	
}
