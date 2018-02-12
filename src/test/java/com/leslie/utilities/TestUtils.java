package com.leslie.utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;

public class TestUtils {
	

	private static int[][] unsorted = {
			new int[]{},
			new int[]{1},
			new int[]{2, 1},
			new int[]{1, 0, -1},
			new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
			new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0},
			new int[]{-5, -4 ,-3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
			new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5},
			new int[]{1, 1, 2, 2, 2, 3, 4, 4, 4, 4, 5, 6, 7, 8, 8, 8},
			new int[]{4, -5, 95, 3, 22, 1, 0, 44, 59, 3, -89, -3, 3, 11, 121, 18, -7, 33, 298, 46},
			new int[]{99, 26, 33, 42, 10, 14, 19, 27, 44, 35, 31, 0},
			new int[]{9, 8, 7, 6, 5, -3, 4, 3, 2, 1, -1},
			new int[]{-1, 26, 33, 42, 10, 14, 19, 27, 44, 35, 31, -2, 5, 9, -67, 9, 54, 
							0, -498, 73890, 3, 45, 91, 34, 44, -9, -2, 22},
			new int[]{-1, 26, 33, 42, 10},
			new int[]{3, 2, -8, 1, 4, 76}
	};

	
	public static List<int[]> getUnsorted(){
		
		List<int[]> unsortedCopy = new ArrayList<>();
		
		for(int[] nums : unsorted){
			unsortedCopy.add(nums.clone());
		}
		
		return unsortedCopy;
		
	}
	
	public static List<int[]> sort(){
		
		List<int[]> expectedSortedResult = new ArrayList<>();
		
		for(int[] nums : unsorted){
			
			int[] numsCopyExpectedSorted = nums.clone();
			Arrays.sort(numsCopyExpectedSorted);
			expectedSortedResult.add(numsCopyExpectedSorted);
			
		}
		
		return expectedSortedResult;
		
	}
	
	
	public static void assertArrayEquals(List<int[]> sortedResult){
	
		List<int[]> expectedSortedResult = TestUtils.sort();
	
		for(int i = 0; i < sortedResult.size(); i++){
			Assert.assertArrayEquals(expectedSortedResult.get(i), sortedResult.get(i));
		}
		
	}
	
	

}
