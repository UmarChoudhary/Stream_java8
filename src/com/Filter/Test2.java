package com.Filter;

import java.util.ArrayList;

public class Test2 {
	
	public static void main(String[] args) {
		ArrayList<Integer> l= new ArrayList<Integer>();
		l.add(5);
		l.add(6);
		l.add(2);
		l.add(1);
		l.add(0);
		l.add(2);
		System.out.println(l);
		Integer min =l.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(min);
		Integer max =l.stream().max(i1,i2)->i2.compareTo(i1)).get();
		System.out.println(max);
	}
}
