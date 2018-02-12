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
	
	/*
	  ==================================
	  		Multiple arrays
	  ==================================
	 */
	public List<int[]> quickSort(List<int[]> numsList){
		
		List<int[]> sortedList = new ArrayList<>();
	
		for(int[] nums : numsList){
			
			quickSort2(nums, 0, nums.length - 1);
			sortedList.add(nums);
			
		}
		
		return sortedList;
	}
	
	
	/*
	  ==================================
	  		REWRITE
	  ==================================
	 */
	public int[] quickSort2(int[] nums){
		
		quickSort2(nums, 0, nums.length - 1);

		return nums;		
		
	}
	
	
	private void quickSort2(int[] nums, int start, int end){
		
		//If 1- elements, return
		if(end - start < 1) return;
		
		int pivot = end;
		int left = start;
		int right = end - 1;
		
		while( left < right ){
			
			//Do <= to ensure pivot will end up in its right place. Even if duplicates,
			//Algo is in place and order should be maintained
			while(left < right && nums[left] <= nums[pivot]) left++;
			
			while(left < right && nums[right] > nums[pivot]) right--;
			
			if(left < right){
				Utilities.swap(nums, left, right);
			}
				
		}
		
		if(nums[left] > nums[pivot]){
			Utilities.swap(nums, left, pivot);
			pivot = left;
		}
		
		quickSort2(nums, start, pivot - 1);
		quickSort2(nums, pivot + 1, end);
		
	}
	
	
	
	
	
	
	/*
	  ==================================
	  		ORIGINAL
	  ==================================
	 */
	
	public int[] quickSort(int[] nums){
		
		quickSort(nums, 0, nums.length - 1);
		
		return nums;
		
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
	private void quickSort(int[] nums, int start, int end){
		
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
