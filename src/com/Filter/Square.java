package com.Filter;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Square {
	public static void main(String[] args) {

			ArrayList <Integer> l=new ArrayList<Integer>();
			l.add(5);
			l.add(4);
			l.add(7);
			l.add(20);
			l.add(8);
			l.add(45);
			System.out.println(l);
			//practice from here
			
			Integer[] i=l.stream().toArray(Integer[]::new);
			
			//constructor reference used here
			Stream.of(i).forEach(System.out::println);
//			for(Integer i1:i)
			{
//				System.out.println(i1);
			}
	}
}