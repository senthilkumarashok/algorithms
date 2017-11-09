package com.leslie;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
	
	
	public static void main(String[] args) {
		
		
		//System.out.println("Hello World!");
		int[] nums = {1, 2, 3};
		
		testInt(nums);
		
		System.out.println(Arrays.toString(nums));
		
	}
	
	
	static void testInt(int[] nums){

		int[] nums2 = nums;
		nums2[0] = 0;
		
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(nums2));
		
	}

}
