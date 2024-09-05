package com.Filter;

import java.util.ArrayList;

public class Stars {
	public static void main(String[] args) {
		ArrayList<String> s= new ArrayList<String>();
		s.add("canopus");
		s.add("alpha centauri");
		s.add("rigel");
		s.add("vegel"); 
		s.add("procyon");
		System.out.println(s);
		String[] i=s.stream().toArray(String[]::new);
		for (String i1:i)
		{
			System.out.println(i1);
		}
		String min=s.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(min);
	}
}

	/*Sirius
	Canopus
	Arcturus
	Alpha Centauri
	Vega
	Rigel
	Procyon
	Achernar*/