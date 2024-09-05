package com.Filter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Dup {
//	public static void main(String[] args) {
//		
//	
//     List<Integer> list = Arrays.asList(12,34,12,98,15,78,98);
//     Set<Integer> set = new HashSet<>();
//    //one line code for 
//     list.stream() //converting list to stream
//     .filter(n-> !set.add(n)) // to filter out the elementsthat are not added to the set
//     .forEach(System.out::println);//print the duplicate
//}
//}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("a,z,d,c,e,q,a".split(","));
		Set<String> set = new HashSet<>();
		list.stream()
		.filter(u->!set.add(u))
		.forEach(System.out::println);
	}
}