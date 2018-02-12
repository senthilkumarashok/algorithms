package com.leslie.misc;

import com.leslie.utilities.Utilities;

/**
 * Used to find the kth largest or smallest in an unsorted array
 * @author Leslie
 *
 */
public class QuickSelect {
	
	/**
	 * 
	 * @param nums
	 * @param k
	 * @param isLargest - True if desired to find the kth largest. Otherwise will return the kth smallest
	 * @return the kth largest/smallest number
	 */
	public int quickSelect(int[] nums, int k, boolean isLargest){
		
		if(nums.length == 0 || k > nums.length){
			throw new IllegalArgumentException("Invalid input. k must be <= array length");
		}
		
		int target = isLargest ? nums.length - k : k - 1;
		
		int pivot = quickSelect(nums, 0, nums.length - 1);
		
		while(true){

			//System.out.println("Pivot: " + pivot + ", target: " + target);
			
			if(pivot == target){
				return nums[pivot];
			}
			else if(target > pivot){
				pivot = quickSelect(nums, pivot + 1, nums.length - 1);
			}
			else{
				pivot = quickSelect(nums, 0, pivot - 1);
			}
			
		}
		
	}
	
	
	private int quickSelect(int[] nums, int start, int end){
		
		if(end - start < 1) return start;
		
		int pivot = end;
		int left = start;
		int right = end - 1;
		
		//System.out.println("Start: " + start + ", end: " + end + ", pivot: " + pivot + ", left: " + left + ", right: " + right);
		while(left < right){
			
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
		
		return pivot;
	}
	
	

}
