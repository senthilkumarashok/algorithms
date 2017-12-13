package com.leslie.leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.leslie.utilities.Utilities;

public class Medium2 {

	
	public List<String> permuteUnique(String str){
		
		Date startDate = new Date();

		Set<String> results = new HashSet<>();
		results.add(str);
		
		for(int i = 0; i < str.length() - 1; i++) {//O(n-1) * 
			results = permuteUnique(i, results);
		}

		List<String> res = new ArrayList<>(results);
		
		Date endDate = new Date();
		
		System.out.println("StartDate: " + startDate + ", EndDate: " + endDate + ", Duration: " + (endDate.getTime() - startDate.getTime() + " ms"));
		
		return res;

	}


	private Set<String> permuteUnique(int floating, Set<String> set){
		
		Set<String> results = new HashSet<>();
		
		for(String str : set){//n-
			
			results.add(str);
			
			for(int i = floating + 1; i < str.length(); i++){//O(n-1)
				
				results.add(Utilities.swapStr(str, floating, i));
				
			}

		}
		
		return results;
		
	}



	public List<List<Integer>> permuteUnique(int[] nums) {
		
		Date startDate = new Date();
				
		List<List<Integer>> ans = new ArrayList<>();
		
		if (nums == null || nums.length == 0) {
			return ans;
		}
		
		permute(ans, nums, 0);
		
		Date endDate = new Date();
		
		System.out.println("StartDate: " + startDate + ", EndDate: " + endDate + 
				", Duration: " + (endDate.getTime() - startDate.getTime() + " ms"));
		
		return ans;
		
	}

	
	private void permute(List<List<Integer>> ans, int[] nums, int index) {
		
		if (index == nums.length) {
			List<Integer> temp = new ArrayList<>();
			for (int num : nums) {
				temp.add(num);
			}
			ans.add(temp);
			return;
		}
		
		Set<Integer> appeared = new HashSet<>();
		
		for (int i = index; i < nums.length; ++i) {
			if (appeared.add(nums[i])) {
				Utilities.swap(nums, index, i);
				permute(ans, nums, index + 1);
				Utilities.swap(nums, index, i);
			}
		}
		
	}

	
	public List<List<Integer>> permuteUnique2(int[] nums) {

		Date startDate = new Date();
		
		List<List<Integer>> res = new ArrayList<List<Integer>>();

		if (nums == null || nums.length == 0)
			return res;

		boolean[] used = new boolean[nums.length];

		List<Integer> list = new ArrayList<Integer>();

		Arrays.sort(nums);

		dfs(nums, used, list, res);
		
		Date endDate = new Date();
		
		System.out.println("StartDate: " + startDate + ", EndDate: " + endDate + ", Duration: " + (endDate.getTime() - startDate.getTime() + " ms"));
		

		return res;

	}

	public void dfs(int[] nums, boolean[] used, List<Integer> list, List<List<Integer>> res) {

		if (list.size() == nums.length) {
			res.add(new ArrayList<Integer>(list));
			return;
		}

		for (int i = 0; i < nums.length; i++) {
			if (used[i])
				continue;
			if (i > 0 && nums[i - 1] == nums[i] && !used[i - 1])
				continue;
			used[i] = true;
			list.add(nums[i]);
			dfs(nums, used, list, res);
			used[i] = false;
			list.remove(list.size() - 1);
		}

	}

}
