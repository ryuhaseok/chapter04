package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		
		//로또번호 중복체크
		Set<Integer> iSet = new HashSet<Integer>();
		
		//중복은 set이 알아서 걸러주니까 iSet의 size가 6개 될때까지만 반복 돌려주면 됨
		
		while(true) {
			if (iSet.size()>=6) {
				break;
			}
			int no = (int)(Math.random()*45)+1;
			iSet.add(no); 
		}
		
		for(Integer num : iSet) {
			System.out.println(num.toString());
		}
		
		
		
		

	}

}
