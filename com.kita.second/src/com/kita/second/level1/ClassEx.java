package com.kita.second.level1;

public class ClassEx  {
	//클레스 -설계도
	//필드 -속성
	//메소드 -동작
	//생성자 -
	
    //필드 : 상태,속성을 나타냄
     int field1;
     String field2;
     int[] field3;
	
     int field4; 
     static int field5;
     
     void method4() {}
     static void method5() {}
     
     static void methodTest() {
//    	 this.field4 = 10;
//    	 method4();
    	 
    	 field5 = 10;
    	 method5();
     }
	//생성자 : 필드를 초기화 시킴 
     public ClassEx() {
    	 super();
     }     
     public ClassEx(int field1) {
    	 this.field1 = field1 + 1;
     }     
     public ClassEx(int field1, String field2) {
    	 this(field1);
    	 this.field2 = field2;
     }     
     public ClassEx(int field1, String field2, int[] field3) {
    	 this(field1, field2);
    	 this.field3 = field3;
     }	
	//메소드 : 동작을 나타냄
      int sum(int n1, int n2) {
    	 int result = n1 + n2;
    	 return result;
     }      
      int sum(int n1, int n2, int n3 ) {
    	  int result = sum(n1, n2) + n3;
    	  return result;
     }
      //int sum(int[] arr){}
      //int[] arr;
      int sum(int... arr) { 
    	  int total = 0;
     	 //실행코드
    	  for(int i = 0; i < arr.length; i++) {
    		  total += arr[i];
    	  }
     	 
     	 return total;
      }
      
    //오버로딩 = 매개변수의 1.타입 2.개수 3.위치
}
