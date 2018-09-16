package com.leslie.search;

public class BinarySearch {

	final int NOT_FOUND_KEY = -1;
	
	/**
	 * Returns any index matching the value or -1 if no match
	 * @param nums
	 * @param val
	 * @return
	 */
	public int searchAny(int[] nums, int val){
		
		int low = 0;
		int high = nums.length - 1;
		
		while(low <= high){
			
			int mid = (low + high) >>> 1;
			
			if(nums[mid] == val){
				return mid;
			}
			else if(nums[mid] < val){
				low = mid + 1;
			}
			else{
				high = mid - 1;
			}

		}
		
		return NOT_FOUND_KEY;
		
	}
	
	
	/**
	 * Returns the left most insertion point of the specified value.<br>
	 * Does not determine whether or not the value was actually found
	 * 
	 * @param nums
	 * @param val
	 * @return
	 */
	public int searchLeftMostInsertionPoint(int[] nums, int val){
		
		int low = 0;
		int high = nums.length - 1;
		
		while(low <= high){
			
			int mid = (low + high) >>> 1;
			
			if(nums[mid] < val){
				low = mid + 1;
			}
			else{
				high = mid - 1;
			}

		}
		
		return low;
		
	}
	
	
	/**
	 * Returns the right most insertion point of the specified value.<br>
	 * Does not determine whether or not the value was actually found
	 * 
	 * @param nums
	 * @param val
	 * @return
	 */
	public int searchRightMostInsertionPoint(int[] nums, int val){
		
		int low = 0;
		int high = nums.length - 1;
		
		while(low <= high){
			
			int mid = (low + high) >>> 1;
			
			if(nums[mid] > val){
				high = mid - 1;
			}
			else{
				low = mid + 1;
			}

		}
		
		return low;
		
	}
	
	
}
