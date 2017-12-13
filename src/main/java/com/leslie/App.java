package com.leslie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App {
	
	
	public static void main(String[] args) {
		
		
		List<List<Integer>> list = new ArrayList<>();
		Set<Set<Integer>> set = new HashSet<>();
		
		Set<Integer> list1 = new HashSet<>();
		list1.add(1);
		list1.add(2);
		if(set.add(list1)){
			list.add(new ArrayList<>(list1));
		}
		
		Set<Integer> list2 = new HashSet<>();
		list2.add(2);
		list2.add(1);
		if(set.add(list2)){
			list.add(new ArrayList<>(list2));
		}
		
		System.out.println(set);
		System.out.println(list);
	
		

		
		
		/*
		Set<Set<Integer>> set = new HashSet<>();
		List<List<Integer>> list = new ArrayList<>();
		set.
		list.addAll(new ArrayList<>(set.));
		*/
	}
	
	
	

}
