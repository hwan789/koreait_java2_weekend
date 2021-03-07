package com.kita.second.level2.sogilli;

public class Hyori { 
	
	//접근제어 
	//public : 접근 제한 없음
	//protected : 
	//default : 본인 패키지 내부
	//private : 자신 클래스 내부

	//필드
	public String music;
	int follower;
	private boolean star = true;
	
	//생성자
	public Hyori(String music) {
		this.music = music;
		follower = 100;
		star = true;
	}
	Hyori(int follower) {
		this.sing();
		this.drinkTea();
		this.yoga();
	}
	private Hyori(boolean star) {}
	
	//메소드
	public void sing() {}
	void drinkTea() {}
	private void yoga() {}
	
}
