package com.leslie.leet;

import java.util.Arrays;
import java.util.List;

public class LeetMain {

	public static void main(String[] args) {
		
		//int[] nums = {-1, 0, 1, 2, -1, -4};
		//int[] nums = {-4,-2,-2,-2, -2, -2,0,1,2,2,2,2,2,2,3,3,4,4,6,6};
		//int[] nums = {-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0};
		//Expected: [[-5,1,4],[-4,0,4],[-4,1,3],[-2,-2,4],[-2,1,1],[0,0,0]]

		//System.out.println("Input: " + Arrays.toString(nums));

		//Medium1 m1 = new Medium1();
		Medium2 m2 = new Medium2();
		//List<List<Integer>> result = m1.threeSum(nums);

		System.out.println("==== Leslie's ====");
		List<String> result = m2.permuteUnique("ABC");
		result.forEach(System.out::println);

		
		System.out.println("==== First ====");
		int[] nums = {1, 1, 2};
		List<List<Integer>> res = m2.permuteUnique2(nums);
		res.forEach(System.out::println);

		
		System.out.println("==== Second ====");
		res = m2.permuteUnique(nums);
		res.forEach(System.out::println);
		System.out.println("Done");
		
	}
	
	
	
	
	

}
