package com.kita.second.level1.practice;

public class Adventurer {
    // 필드
	int strength;
	int dexterity;
	int intelligence;
	int luck;
	int hp;
	// 생성자
	//기본스텟 전부 10으로 맞추기
	public Adventurer() {
		 strength = 10;
		 dexterity = 10;
		 intelligence = 10;
		 luck = 10;
		 hp = 10;
	}
	
	public Adventurer(int strength, int dexterity) {
		this.strength = strength;
		this.dexterity = dexterity;
	}
	
	// 메소드
	void attack() {
		System.out.println("기본공격을 합니다.");
	}
	void jump() {
		System.out.println("점프를 한다.");
	}
}
