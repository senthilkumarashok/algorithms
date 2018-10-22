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

	
	/*===========================
	 * Heap Sort
	 * ==========================
	 */

	@Test
	public void heapSortTest(){
		
		HeapSort hs = new HeapSort();

		TestUtils.assertArrayEquals(hs.heapSort(TestUtils.getUnsorted()));

	}
	
	/*===========================
	 * Merge Sort
	 * ==========================
	 */

	@Test
	public void mergeSortTest(){
		
		MergeSort algo = new MergeSort();

		TestUtils.assertArrayEquals(algo.doSort(TestUtils.getUnsorted()));

	}
	
}
