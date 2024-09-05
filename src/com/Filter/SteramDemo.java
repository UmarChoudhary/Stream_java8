package com.Filter;

import java.util.stream.Stream;

public class SteramDemo {
	public static void main(String[] args) {
		Stream<Integer> s= Stream.of(9,58,586,5654,23545,475698);
		s.forEach(System.out::println);
		
		Integer[] i= {10,20,30,40,50,60};
		Stream.of(i).forEach(System.out::println);
	}
}
