package com.kita.second.level1;

import java.util.Scanner;

public class Test {
 public static void main(String[] args) {
	
	 Korean yh = new Korean("대한민국");
	 System.out.println(yh.nation);
	 
	 Korean ms = new Korean("미국");
	 System.out.println(ms.nation);
	 
	 Scanner sc = new Scanner(System.in);

	 ClassEx c1 = new ClassEx();
	 int result = c1.sum(3,8,4,1,2,6,7,3);
			 System.out.println("result:" + result);
	 int result2 = c1.sum(4,5,8,7,5,4,3);
	 System.out.println("result2:" + result2);
 }
}
