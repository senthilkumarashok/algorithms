package com.leslie.sorting;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SingleSortingTest {

	int[] nums = {2, 4, 5, -1, 0, 0, -10, 12, 11, 2, 5, 9, -1989, 10374};
	
	
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
		HeapSort algo = new HeapSort();		
		numsCopy = algo.heapSort(numsCopy);
		System.out.println("Sorted: " + Arrays.toString(numsCopy));

		//Then
		int[] numsCopyExpectedSorted = nums.clone();			
		Arrays.sort(numsCopyExpectedSorted);
		System.out.println("Expected Sorted: " + Arrays.toString(numsCopyExpectedSorted));
		Assert.assertArrayEquals(numsCopyExpectedSorted, numsCopy);

	}
	
	
	
	
}
