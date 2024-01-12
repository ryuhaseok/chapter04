package com.javaex.ex02;

import java.util.Arrays;


public class MyList {
	
	//필드
	private Object[] oArray;
	private int crtPos;
	
	
	//생성자
	public MyList() {
		
		oArray = new Object[3];
		crtPos = 0;
	}
		
	//메소드 일반
	public void add(Object o) {
		// 현재배열개수+1 배열을 새로 만든다
		// 이전배열의 값을 새배열에 옮긴다
		// 마지막방에 새주소를 추가한다
		oArray[crtPos] = o;
		// crtPos = crtPos + 1;
		crtPos += 1;
	}
	public int size() {

		return crtPos;
	}
	public Object get(int index) {

		return oArray[index];
	}

	@Override
	public String toString() {
		return "MyList [oArray=" + Arrays.toString(oArray) + ", crtPos=" + crtPos + "]";
	}
	

}
