package com.leslie.leet;

import static org.hamcrest.CoreMatchers.containsString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.leslie.utilities.Utilities;

public class Medium1 {
	
	
	/**
	 * #15
	 * @param nums
	 * @return
	 */
	public List<List<Integer>>threeSum(int[] nums){
		
		List<List<Integer>> result = new ArrayList<>();
		
		if(nums.length < 3) return result;
		
		Arrays.sort(nums);
		
		for(int i = 0; i < nums.length - 2; i++){
			
			int low = i + 1, high = nums.length - 1;
			int comp = -nums[i];
			
			//Skipping duplicates. First dup number scanned, then subsequent are skipped. 
            //Doing the reverse may skip some combinations. EX: [-1, -1, 0, 1, 2]
            //If 1st -1 is skipped, combination [-1, -1, 2] will be skipped as well
			if(i - 1 >= 0 && nums[i] == nums[i-1]) continue;
			
			while(low < high){
				
				if(nums[low] + nums[high] == comp){
                    
					result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    
                    //Since low & high are a match, need to skip all duplicate low & high
                    while(low < high && nums[low] == nums[low + 1]) low++;
				    while(low < high && nums[high] == nums[high - 1]) high--;                    
					low++;
					high--;
				}
				else if(nums[low] + nums[high] < comp){
					low++;
				}
				else{
					high--;
				}
				
			}

		}
	
		return result;
		
	}
	
	public List<String> permute(String str){
		
		List<String> results = new ArrayList<>();
		List<char[]> resultsChar = new ArrayList<>();
		
		char[] chars = str.toCharArray();
		
		resultsChar.add(chars);
		
		for(int i = 0; i < chars.length; i++){
			resultsChar = permute(chars, i, resultsChar);
		}
		
		//Converting List<char[]> to List<String>
		for(char[] chs : resultsChar){
			results.add(new String(chs));
		}
		
		return results;
		
	}
	
	
	private List<char[]> permute(char[] chars, int index, List<char[]> charList){
		
		int length = chars.length;
		
		List<char[]> results = new ArrayList<>();
		
		for(char[] chs : charList){
			
			results.add(chs);
			
			for(int i = index + 1; i < length; i++){
				
				char[] clone = Utilities.copyChars(chs, 0, length - 1);
				Utilities.swapChars(clone, i, index);
				results.add(clone);		
			}
			
		}
		
		return results;
	}

}
