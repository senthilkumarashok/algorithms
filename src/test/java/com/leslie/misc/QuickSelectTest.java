package com.leslie.misc;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;


public class QuickSelectTest {
	
	@Test(expected = IllegalArgumentException.class)
	public void illegalEmptyInputTest(){
		
		int[] nums = {};
		int k = 4;
		boolean isLargest = false;
		
		QuickSelect qs = new QuickSelect();
		qs.quickSelect(nums, k, isLargest);
		
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void illegalKValueTest(){
		
		int[] nums = {3, 2, 4};
		int k = 4;
		boolean isLargest = false;
		
		QuickSelect qs = new QuickSelect();
		qs.quickSelect(nums, k, isLargest);
		
	}
	
	
	/*
	 * Kth Smallest
	 */
	
	@Test
	public void kthSmallestKandLengthEqualsTest(){
		
		int[] nums = {3, 2, 4};
		int k = nums.length;
		boolean isLargest = false;
		
		QuickSelect qs = new QuickSelect();
		int result = qs.quickSelect(nums, k, isLargest);
		//System.out.println(result);
		
		Arrays.sort(nums);
		
		Assert.assertEquals(nums[getTargetIndex(k, isLargest, nums.length)], result);
		
	}
	
	
	@Test
	public void kthSmallest1Test(){
		
		int[] nums = {42};
		int k = 1;
		boolean isLargest = false;
		
		QuickSelect qs = new QuickSelect();
		int result = qs.quickSelect(nums, k, isLargest);
		//System.out.println(result);
		
		Arrays.sort(nums);
		
		Assert.assertEquals(nums[getTargetIndex(k, isLargest, nums.length)], result);
		
	}
	
	
	@Test
	public void kthSmallest2Test(){
		
		int[] nums = {7, 4, -9, 0, 0, 4, 9, 91, 44, 23};
		int k = 6;
		boolean isLargest = false;
		
		QuickSelect qs = new QuickSelect();
		int result = qs.quickSelect(nums, k, isLargest);
		//System.out.println(result);
		
		Arrays.sort(nums);
		
		Assert.assertEquals(nums[getTargetIndex(k, isLargest, nums.length)], result);
		
	}
	
	
	@Test
	public void kthSmallest3Test(){
		
		int[] nums = {-89, -13, -2, -4, -5, -1, 0};
		int k = 2;
		boolean isLargest = false;
		
		QuickSelect qs = new QuickSelect();
		int result = qs.quickSelect(nums, k, isLargest);
		//System.out.println(result);
		
		Arrays.sort(nums);
		
		Assert.assertEquals(nums[getTargetIndex(k, isLargest, nums.length)], result);
		
	}
	
	
	@Test
	public void kthSmallest4Test(){
		
		int[] nums = {-5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5};
		int k = 10;
		boolean isLargest = false;
		
		QuickSelect qs = new QuickSelect();
		int result = qs.quickSelect(nums, k, isLargest);
		//System.out.println(result);
		
		Arrays.sort(nums);
		
		Assert.assertEquals(nums[getTargetIndex(k, isLargest, nums.length)], result);
		
	}
	
	
	@Test
	public void kthSmallest5Test(){
		
		int[] nums = {9, 1, 0, -43, 7, 22, -22, 44, 7, 210};
		int k = 3;
		boolean isLargest = false;
		
		QuickSelect qs = new QuickSelect();
		int result = qs.quickSelect(nums, k, isLargest);
		//System.out.println(result);
		
		Arrays.sort(nums);
		
		Assert.assertEquals(nums[getTargetIndex(k, isLargest, nums.length)], result);
		
	}
	
	
	
	/*
	 * Kth Smallest
	 */
	
	@Test
	public void kthLargestKandLengthEqualsTest(){
		
		int[] nums = {3, 2, -8, 1, 4, 76};
		int k = nums.length;
		boolean isLargest = true;
		
		QuickSelect qs = new QuickSelect();
		int result = qs.quickSelect(nums, k, isLargest);
		//System.out.println(result);
		
		Arrays.sort(nums);
		
		Assert.assertEquals(nums[getTargetIndex(k, isLargest, nums.length)], result);
		
	}
	
	
	@Test
	public void kthLargest1Test(){
		
		int[] nums = {42};
		int k = 1;
		boolean isLargest = true;
		
		QuickSelect qs = new QuickSelect();
		int result = qs.quickSelect(nums, k, isLargest);
		//System.out.println(result);
		
		Arrays.sort(nums);
		
		Assert.assertEquals(nums[getTargetIndex(k, isLargest, nums.length)], result);
		
	}
	
	
	@Test
	public void kthLargest2Test(){
		
		int[] nums = {7, 4, -9, 0, 0, 4, 9, 91, 44, 23};
		int k = 6;
		boolean isLargest = true;
		
		QuickSelect qs = new QuickSelect();
		int result = qs.quickSelect(nums, k, isLargest);
		//System.out.println(result);
		
		Arrays.sort(nums);
		
		Assert.assertEquals(nums[getTargetIndex(k, isLargest, nums.length)], result);
		
	}
	
	
	@Test
	public void kthLargest3Test(){
		
		int[] nums = {-89, -13, -2, -4, -5, -1, 0};
		int k = 2;
		boolean isLargest = true;
		
		QuickSelect qs = new QuickSelect();
		int result = qs.quickSelect(nums, k, isLargest);
		//System.out.println(result);
		
		Arrays.sort(nums);
		
		Assert.assertEquals(nums[getTargetIndex(k, isLargest, nums.length)], result);
		
	}
	
	
	@Test
	public void kthLargest4Test(){
		
		int[] nums = {-5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5};
		int k = 10;
		boolean isLargest = true;
		
		QuickSelect qs = new QuickSelect();
		int result = qs.quickSelect(nums, k, isLargest);
		//System.out.println(result);
		
		Arrays.sort(nums);
		
		Assert.assertEquals(nums[getTargetIndex(k, isLargest, nums.length)], result);
		
	}
	
	
	@Test
	public void kthLargest5Test(){
		
		int[] nums = {9, 1, 0, -43, 7, 22, -22, 44, 7, 210};
		int k = 3;
		boolean isLargest = true;
		
		QuickSelect qs = new QuickSelect();
		int result = qs.quickSelect(nums, k, isLargest);
		//System.out.println(result);
		
		Arrays.sort(nums);
		
		Assert.assertEquals(nums[getTargetIndex(k, isLargest, nums.length)], result);
		
	}
	
	
	private int getTargetIndex(int k, boolean isLargest, int length){
		
		return isLargest ? length - k : k - 1;
		
	}

}
