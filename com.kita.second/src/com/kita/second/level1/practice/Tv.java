package com.kita.second.level1.practice;

public class Tv {
  
	//필드
	//전원(isPowerOn) 채널(channel) 볼륨(volume)
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	//생성자
	//기본값 전원 false, 채널 1, 볼륨 0
	public Tv() {
		isPowerOn = false;
		channel = 1;
		volume = 0;
	}
	
	//메소드
	//전원켜기(powerOn), 전원끄기(powerOff)
	//채널올리기(channelUp), 채널내리기(channelDown)
	//볼륨높이기(VolumeUp), 볼륨낮추기(VolumeDown)
	void powerOn() {
		if(isPowerOn) {
			System.out.println("전원이 이미 켜져있습니다.");
			return;
		}
		isPowerOn = true;
		System.out.println("전원을 킵니다.");
	}
	void powerOff() {
		if(!isPowerOn) {
			System.out.println("전원이 이미 꺼져있습니다.");
			return;
		}
		isPowerOn = false;
		System.out.println("전원을 끕니다.");
	}
	
	void channelUp() {
		channel++;
		System.out.println("채널을 올립니다.");
	}
	void channeldown() {
		if(channel<2) {
			System.out.println("최소채널입니다.");
		}
		channel--;
		System.out.println("채널을 내립니다.");
	}
	
	void volumeUp() {
		volume++;
		System.out.println("볼륨을 올립니다.");
	}
	void volumedown() {
		if(volume<2) {
			System.out.println("최소볼륨입니다.");
		}
		volume--;
		System.out.println("볼륨을 내립니다.");
	}

}
