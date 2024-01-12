package com.javaex.ex01;

public class MyListApp {

	public static void main(String[] args) {

		/*
		Point[] pArray = new Point[100]; //배열은 개수를 확정해야함
		Point p1 = new Point(2, 2);
		Point p2 = new Point(12, 13);
		Point p3 = new Point(22, 23);
		
		pArray[0] = p1;
		pArray[1] = p2;
		pArray[2] = p3;
		
		for(int i=0; i<pArray.length; i++) {
			System.out.println(pArray[i].toString());
		}
		*/
		
		PointList pList = new PointList();
		
		Point p1 = new Point(2,2);
		Point p2 = new Point(12,13);
		Point p3 = new Point(22,23);
		
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		
		int count = pList.size();
		System.out.println(count);
		
		Point p = pList.get(0);
		System.out.println(p.getX());
		
		System.out.println(pList.toString());
		
		//원관리
		CircleList cList = new CircleList();
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(10);
		
		cList.add(c01);
		cList.add(c02);
		
		System.out.println(cList.toString());
		
		
		
	}

}
