package com.leslie.sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

	/*
	 * Public Methods
	 */

	public List<int[]> doSort(List<int[]> numsList){
		
		List<int[]> sortedList = new ArrayList<>();
	
		for(int[] nums : numsList){
			
			doSort(nums);
			sortedList.add(nums);
			
		}
		
		return sortedList;
	}
	
	
	public void doSort(int[] nums){
		
		if(nums.length < 2) return;
		
		int mid = nums.length/2;
		
		int[] L = new int[mid];
		int[] R = new int[nums.length - mid];
		
		for(int l = 0; l < mid; l++){
			L[l] = nums[l];
		}
		
		for(int r = mid; r < nums.length; r++){
			R[r - mid] = nums[r];
		}
		
		doSort(L);
		doSort(R);
		merge(nums, L, R);
		
	}

	

	
	/*
	 * Private Methods
	 */

	
	
	
	private void merge(int[] A, int[] L, int R[]){
		
		int a = 0, l = 0, r = 0;
		
		while(l < L.length && r < R.length){
			
			if(L[l] < R[r]){
				A[a++] = L[l++];
			}
			else{
				A[a++] = R[r++];
			}

		}
		
		while(l < L.length){
			A[a++] = L[l++];
		}
		
		while(r < R.length){
			A[a++] = R[r++];
		}
		
	}
	
	
}
