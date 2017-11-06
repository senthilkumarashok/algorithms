package com.leslie.utilities;

public class Utilities {
	
	/*
	public static void assertArrayEquals(int[] expected, int[] actual){
		
		Assert.assertEquals("Array lengths not equals", expected.length, actual.length);
		
		for(int i = 0; i < expected.length; i++){
			Assert.assertEquals("Elements at index " + i + " not equals", expected[i], actual[i]);
		}
		
	}
	*/
	
	
	public static void swap(int[] nums, int i, int j){
		
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
		
	}
	
	
	public static int[] copy(int[] nums, int start, int end){
		
		int[] copy = new int[end - start + 1];
		
		for(int i = start; i <= end; i++){
			copy[i - start] = nums[i];
		}

		return copy;
	}
	

}
