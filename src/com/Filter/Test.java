package com.Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer> ();
		marks.add(95);
		marks.add(55);
		marks.add(96);
		marks.add(31);
		marks.add(78);
		marks.add(34);
		marks.add(32);
		System.out.println(marks);
		List<Integer> l2= marks.stream().filter(i->i%2==0).collect(Collectors.toList());
//		System.out.println(l2);
		List<Integer> l21=marks.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(l21);
		List<Integer> l3=  marks.stream().filter(m->m>70).collect(Collectors.toList());
		System.out.println(l3);
		List<Integer> l4 = marks.stream().filter(i->i<35).collect(Collectors.toList());
		System.out.println("Failed Student: "+l4);
		double failedStudent =marks.stream().filter(i->i<35).count();
		System.out.println(failedStudent);
		List<Integer> sorted = marks.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorting: "+sorted);
		List<Integer> fav = marks.stream().sorted((x,y)->((x>y)?1:(x<y)?-1:0)).collect(Collectors.toList());
		System.out.println(fav);
//		List<Integer> l5 = marks.stream().sorted((x,y)->x.compareTo(y).collect(Collectors.toList());
//		System.out.println(l5);
	}
 }