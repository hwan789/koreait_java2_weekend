package com.kita.second.level2;

public class Dog extends Animal {
    
    boolean cutiness;
    
    public Dog(String name) {
    	super(name);
    	super.age = 1;
    	this.cutiness = true;
    }
    
    void cry() {
    	System.out.println("개가 운다.");
    }
    
    void barking() {
    	System.out.println("개가 짖는다.");
    }
    
}
