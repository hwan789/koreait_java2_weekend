package com.kita.second.level2;

public class AnimalTest {
public static void main(String[] args) {
	
	Animal ani = new Animal("흰둥이");
	ani.cry();
	ani = new Cat("까미");
	ani.cry();
	ani = new Dog("점박이");
	ani.cry();
	
	Dog d = (Dog)ani;
//	ani.bark();
	d.bark();
	
//	double num1 = 10;
//	int num = (int)10.5;
	
	
	
	Dog d1 = new Dog("누렁이");
	System.out.println("d1의 이름은" + d1.name);
	System.out.println("d1 :" + d1.cutiness);
	d1.cry();
	d1.bark();
	
	Animal a1 = new Animal("미미");
	System.out.println("a1의 이름은" + a1.name);
	a1.cry();
}
}
