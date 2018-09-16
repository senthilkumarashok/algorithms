package com.leslie.search;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

	
	/*
	 * ANY MATCH or -1
	 */
	
	@Test
	public void binarySearchAnyFirstIndexMatchTest(){
		
		int[] nums = {-1989, -10, -1, 0, 0, 2, 2, 4, 5, 5, 9, 11, 12, 10374};
		
		BinarySearch bs = new BinarySearch();
		int val = nums[0];
		int res = bs.searchAny(nums, val);
		
		System.out.println("nums: " + Arrays.toString(nums) + ", search: " + val + ", index: " + res);
		
		Assert.assertTrue(res != bs.NOT_FOUND_KEY);
		Assert.assertEquals(val, nums[res]);

	}
	
	
	@Test
	public void binarySearchAnyLastIndexMatchTest(){
		
		int[] nums = {-1989, -10, -1, 0, 0, 2, 2, 4, 5, 5, 9, 11, 12, 10374};
		
		BinarySearch bs = new BinarySearch();
		int val = nums[nums.length - 1];
		int res = bs.searchAny(nums, val);
		
		System.out.println("nums: " + Arrays.toString(nums) + ", search: " + val + ", index: " + res);
		
		Assert.assertTrue(res != bs.NOT_FOUND_KEY);
		Assert.assertEquals(val, nums[res]);

	}
	
	
	@Test
	public void binarySearchAnyMiddleIndexMatchTest(){
		
		int[] nums = {-1989, -10, -1, 0, 0, 2, 2, 4, 5, 5, 9, 11, 12, 10374};
		
		BinarySearch bs = new BinarySearch();
		int val = nums[nums.length/2];
		int res = bs.searchAny(nums, val);
		
		System.out.println("nums: " + Arrays.toString(nums) + ", search: " + val + ", index: " + res);
		
		Assert.assertTrue(res != bs.NOT_FOUND_KEY);
		Assert.assertEquals(val, nums[res]);

	}
	
	
	@Test
	public void binarySearchAnyMatchFoundTest1(){
		
		int[] nums = {-1989, -10, -1, 0, 0, 2, 2, 4, 5, 5, 9, 11, 12, 10374};
		
		BinarySearch bs = new BinarySearch();
		int val = 12;
		int res = bs.searchAny(nums, val);
		
		System.out.println("nums: " + Arrays.toString(nums) + ", search: " + val + ", index: " + res);
		
		Assert.assertTrue(res != bs.NOT_FOUND_KEY);
		Assert.assertEquals(val, nums[res]);

	}
	
	
	@Test
	public void binarySearchAnyNotFoundTest1(){
		
		int[] nums = {-1989, -10, -1, 0, 0, 2, 2, 4, 5, 5, 9, 11, 12, 10374};
		
		BinarySearch bs = new BinarySearch();
		int val = nums[0] - 1;
		int res = bs.searchAny(nums, val);
		
		System.out.println("nums: " + Arrays.toString(nums) + ", search: " + val + ", index: " + res);
		
		Assert.assertEquals(bs.NOT_FOUND_KEY, res);

	}
	
	@Test
	public void binarySearchAnyNotFoundTest2(){
		
		int[] nums = {-1989, -10, -1, 0, 0, 2, 2, 4, 5, 5, 9, 11, 12, 10374};
		
		BinarySearch bs = new BinarySearch();
		int val = nums[nums.length - 1] + 1;
		int res = bs.searchAny(nums, val);
		
		System.out.println("nums: " + Arrays.toString(nums) + ", search: " + val + ", index: " + res);
		
		Assert.assertEquals(bs.NOT_FOUND_KEY, res);

	}
	
	
	@Test
	public void binarySearchAnyNotFoundTest3(){
		
		int[] nums = {-1989, -10, -1, 0, 0, 2, 2, 4, 5, 5, 9, 11, 12, 10374};
		
		BinarySearch bs = new BinarySearch();
		int val = 1;
		int res = bs.searchAny(nums, val);
		
		System.out.println("nums: " + Arrays.toString(nums) + ", search: " + val + ", index: " + res);
		
		Assert.assertEquals(bs.NOT_FOUND_KEY, res);

	}
	
	
	/*
	 * LEFT MOST insertion point
	 */
	
	@Test
	public void binarySearchLeftMostInsertionPointTest(){
		
		int[] nums = {-1989, -10, -1, 0, 0, 0, 2, 2, 4, 5, 5, 9, 11, 12, 10374};
		
		BinarySearch bs = new BinarySearch();
		int val = 0;
		int res = bs.searchLeftMostInsertionPoint(nums, val);
		
		System.out.println("nums: " + Arrays.toString(nums) + ", search: " + val + ", index: " + res);
	
		Assert.assertEquals(val, nums[res]);
		Assert.assertEquals(3, res);

	}
	
	
	@Test
	public void binarySearchLeftMostInsertionPointNoMatchTest(){
		
		int[] nums = {-1989, -10, -1, 0, 0, 0, 2, 2, 4, 5, 5, 9, 11, 12, 10374};
		
		BinarySearch bs = new BinarySearch();
		int val = nums[0] - 1;
		int res = bs.searchLeftMostInsertionPoint(nums, val);
		
		System.out.println("nums: " + Arrays.toString(nums) + ", search: " + val + ", index: " + res);
		
		Assert.assertNotEquals(val, nums[res]);
		Assert.assertEquals(0, res);

	}

	
	/*
	 * RIGHT MOST insertion point
	 */
	
	@Test
	public void binarySearchRightMostInsertionPointTest(){
		
		int[] nums = {-1989, -10, -1, 0, 0, 0, 2, 2, 4, 5, 5, 9, 11, 12, 10374};
		
		BinarySearch bs = new BinarySearch();
		int val = 2;
		int res = bs.searchRightMostInsertionPoint(nums, val);
		
		System.out.println("nums: " + Arrays.toString(nums) + ", search: " + val + ", index: " + res);

		Assert.assertEquals(8, res);

	}
	
	
	@Test
	public void binarySearchRightMostInsertionPointNoMatchTest(){
		
		int[] nums = {-1989, -10, -1, 0, 0, 0, 2, 2, 4, 5, 5, 9, 11, 12, 10374};
		
		BinarySearch bs = new BinarySearch();
		int val = nums[0] - 1;
		int res = bs.searchRightMostInsertionPoint(nums, val);
		
		System.out.println("nums: " + Arrays.toString(nums) + ", search: " + val + ", index: " + res);
		
		Assert.assertNotEquals(val, nums[res]);
		Assert.assertEquals(0, res);

	}

	
}
