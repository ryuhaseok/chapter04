package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List;

public class MyListApp {

	public static void main(String[] args) {
		
		//Array와 Linked List를 바꿀 경우가 생길 수 있기 때문에 
		//List로 섞어쓰기 해준다.
		//add(), size()
		ArrayList<Point> pList = new ArrayList<Point>();
		
		Point p01 = new Point(2, 2);
		Point p02 = new Point(3, 3);
		Point p03 = new Point(4, 4);
		
		
		pList.add(p01); //2,2를 넣은게 아닌 주소를 넣은것
		pList.add(p02);
		pList.add(p03);
		pList.add(p01); // 주소 동일

		/*
		Circle c01 = new Circle(1000);
		pList.add(c01)
		*/

		System.out.println("size:" + pList.size());
		
		//변수로 y값
		System.out.println(p01.getY());
		
		//리스트로 y값
		/*
		Point var01 = pList.get(0);
		var01.getY();
		*/
		pList.get(0).getY();
		
		//전체 출력
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		System.out.println("-------------------------------------");
		
		pList.remove(0);
		//전체 출력
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		System.out.println("-------------------------------------");
		
		pList.remove(p02);
		//전체 출력
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println(pList.toString());
		
		System.out.println("================================");
		
		List<Integer> iList = new ArrayList<Integer>();
		
		Integer i01 = 3;
		Integer i02 = 6;
		
		iList.add(i01);
		iList.add(i02);
		
		System.out.println(iList.toString());
		
		
		
	}

}
