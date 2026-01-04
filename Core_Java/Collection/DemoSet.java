package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s=new HashSet<>();
		//add objects
		s.add("java");                    //set doesnot alllowed duplicates
		s.add("java");
		s.add("JAVA");
		s.add("spring");
		s.add("boot");
		System.out.println(s);
		for(String st:s)
			System.out.println(st);
		
		TreeSet<String> ts=new TreeSet<>(s);  //conversion constructor-adding tree set object and passing into a collection
		ts.add("1");
		ts.add("10");
		//ts.add(null);
		//ts.add(null);
		System.out.println("tree set" +ts);
		//linked hash set
		LinkedHashSet<String> lhs=new LinkedHashSet<>(ts);
		System.out.println("displaying lhs using ts"+lhs);
		LinkedHashSet<String> lhs2=new LinkedHashSet<>();
		lhs2.add("apple");
		lhs2.add("orange");
		lhs2.add("strawberry");
		lhs2.add("blueberry");
		for(String ss:lhs2)
			System.out.println(ss);
		
		
	}	
}
