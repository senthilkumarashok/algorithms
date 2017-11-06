package com.leslie.sorting;

import org.junit.Test;

import com.leslie.utilities.TestUtils;

public class SortingTest {



	/*===========================
	 * Quick Sort
	 * ==========================
	 */

	@Test
	public void quickSortTest(){
		
		QuickSort qs = new QuickSort();

		TestUtils.assertArrayEquals(qs.quickSort(TestUtils.getUnsorted()));

	}

	
}
