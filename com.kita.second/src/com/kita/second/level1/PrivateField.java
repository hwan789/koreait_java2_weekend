package com.kita.second.level1;

public class PrivateField {
	private int field1;
	private String field2;
	
	PrivateField(int field1, String field2) {
		this.field1 = field1;
		this.field2 = field2;
	}

	public int getField1() {
		return field1;
	}

	public void setField1(int field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

}
//get,set 생성
//우클릭-소스-제너레이트 게터세터-셀렉트 올-제너레이트
