package com.leslie.sorting;

import java.util.ArrayList;
import java.util.List;

import com.leslie.utilities.Utilities;

public class HeapSort {
	
	/*
	 * Public Methods 
	 */
	
	public int[] heapSort(int[] nums){
		
		doHeapSort(nums);
		return nums;
		
	}
	

	public List<int[]> heapSort(List<int[]> numsList){
		
		List<int[]> sortedList = new ArrayList<>();
	
		for(int[] nums : numsList){
			
			doHeapSort(nums);
			sortedList.add(nums);
			
		}
		
		return sortedList;
	}
	
	
	private void doHeapSort(int[] nums){
		
		int length = nums.length;
		
		if(length <= 1) return;
		
		buildMaxHeap(nums);
		
		for(int i = 1; i < length; i++){

			Utilities.swap(nums, 0, length - i);
			heapify(nums, 0, length - i - 1);
			
		}
		
	}
	
	
	private void buildMaxHeap(int[] nums){

		for(int i = nums.length/2; i >= 0; i--){
			heapify(nums, i, nums.length - 1);
		}
		
	}
	
	
	private void heapify(int[] nums, int root, int end){
		
		int parent = root;
		int left = 2*root + 1;
		int right = left + 1;
		
		if(left <= end && nums[left] > nums[parent]){
			parent = left;
		}
		
		if(right <= end && nums[right] > nums[parent]){
			parent = right;
		}
		
		if(parent != root){
			Utilities.swap(nums, parent, root);
			heapify(nums, parent, end);
		}
		
	}


}
