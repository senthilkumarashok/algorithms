package com.leslie.sorting;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SortingTest {

	private List<int[]> unsorted = Arrays.asList(
			new int[]{},
			new int[]{1},
			new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
			new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0},
			new int[]{-5, -4 ,-3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
			new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5},
			new int[]{1, 1, 2, 2, 2, 3, 4, 4, 4, 4, 5, 6, 7, 8, 8, 8},
			new int[]{4, -5, 95, 3, 22, 1, 0, 44, 59, 3, -89, -3, 3, 11, 121, 18, -7, 33, 298, 46}
	);
	
	private List<int[]> sorted = Arrays.asList(
			new int[]{},
			new int[]{1},
			new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
			new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
			new int[]{-5, -4 ,-3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
			new int[]{-5, -4 ,-3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
			new int[]{1, 1, 2, 2, 2, 3, 4, 4, 4, 4, 5, 6, 7, 8, 8, 8},
			new int[]{-89, -7, -5, -3, 0, 1, 3, 3, 3, 4, 11, 18, 22, 33, 44, 46, 59, 95, 121, 298}
	);

	/*===========================
	 * Quick Sort
	 * ==========================
	 */

	@Test
	public void quickSortTest(){
		
		QuickSort qs = new QuickSort();

		assertArrayEquals(qs.quickSort(unsorted));

	}
	
	
	
	/*
	 * Private Methods
	 */
	
	private void assertArrayEquals(List<int[]> sortedResult){
		
		for(int i = 0; i < sortedResult.size(); i++){
			Assert.assertArrayEquals(sorted.get(i), sortedResult.get(i));
		}
		
	}
	
	
	
}
