package com.leslie.sorting;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SingleSortingTest {

	int[] nums = {2, 4, 5, -1, 0};
	
	
	@Before
	public void setup(){
	
		
	}
	
	
	/*===========================
	 * Quick Sort
	 * ==========================
	 */

	@Test
	public void singleSortTest(){
		
		//Given
		int[] numsCopy = nums.clone();
		System.out.println("Unsorted: " + Arrays.toString(numsCopy));
		
		//When
		QuickSort qs = new QuickSort();		
		numsCopy = qs.quickSort(numsCopy);
		System.out.println("Sorted: " + Arrays.toString(numsCopy));

		//Then
		int[] numsCopyExpectedSorted = nums.clone();			
		Arrays.sort(numsCopyExpectedSorted);
		System.out.println("Expected Sorted: " + Arrays.toString(numsCopyExpectedSorted));
		Assert.assertArrayEquals(numsCopyExpectedSorted, numsCopy);

	}
	
	
	
	
}
