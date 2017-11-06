package com.leslie.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.youtube.com/watch?v=9qYD3Uag3Jk
 * @author leslie
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
	

	
	static void quickSort(int[] nums, int start, int end){
		
		int pivot = end;
		int left = start;
		int right = end - 1;
		
		while(left <= right){
			
			
		}
		
		
		
	}
	
	

}
