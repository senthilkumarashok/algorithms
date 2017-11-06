package com.leslie.sorting;

import java.util.ArrayList;
import java.util.List;

import com.leslie.utilities.Utilities;

/**
 * https://www.youtube.com/watch?v=9qYD3Uag3Jk
 * @author Leslie
 *
 */
public class QuickSort {

	/*
	 * Public Methods 
	 */
	
	public int[] quickSort(int[] nums){
		
		quickSort(nums, 0, nums.length - 1);
		
		return nums;
		
	}
	
	
	
	public List<int[]> quickSort(List<int[]> numsList){
		
		List<int[]> sortedList = new ArrayList<>();
	
		for(int[] nums : numsList){
			
			quickSort(nums, 0, nums.length - 1);
			sortedList.add(nums);
			
		}
		
		return sortedList;
	}
	

	/*
	 * 0  1  2
	 * 2, 1, 0
	 * low = 0, high = -1, high may get out of bounds
	 * 
	 * 0  1  2
	 * 4, 5, 6
	 * low = 2, high = 1, Low won't get out of bounds
	 * 
	 * 0 1 2 3 4
	 * 2 3 5 6 4
	 * low = 2, high = 2
	 * 
	 * 0 1 2 3 4 5 6
	 * 2 3 5 2 1 6 4
	 * 
	 * low = 2, high = 4
	 */
	static void quickSort(int[] nums, int start, int end){
		
		if(end - start + 1 <= 1) return;
		
		int pivot = end;
		int low = start;
		int high = end - 1;
		
		while(low <= high){
			
			while(low <= high && nums[low] <= nums[pivot]){
				low++;
			}
			
			while(high >= low && nums[high] > nums[pivot]){
				high--;
			}
			
			if(low < high){
				Utilities.swap(nums, low, high);
			}	
			
		}

		if(low != pivot){
			Utilities.swap(nums, low, pivot);
		}
		
		quickSort(nums, start, low - 1);
		quickSort(nums, low + 1, end);
		
	}
	
	

}
