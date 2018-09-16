package com.leslie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

import javax.swing.tree.TreeNode;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		
		Queue<TreeNode> queue = new LinkedList<>();
		
		TreeMap<Integer, Integer> mp = new TreeMap<>();
		mp.keySet();
		Collections.sort(new ArrayList<>(mp.keySet()));
		List<List<Integer>> list = new ArrayList<>();
		list.stream().map(c -> c).collect(Collectors.toList());
		
		Set<Integer> set = new HashSet<>();

		TreeMap<Integer, Integer> map = new TreeMap<>();
		Map.Entry<Integer, Integer> entry = map.firstEntry();

		map.put(1, 3);
		map.put(6, -3);
		map.put(4, 4);
		map.put(3, 54);
		map.put(2, 1);

		PriorityQueue<String> pq = new PriorityQueue<String>();

		/*
		 * Set<Set<Integer>> set = new HashSet<>(); List<List<Integer>> list =
		 * new ArrayList<>(); set. list.addAll(new ArrayList<>(set.));
		 */

		Integer[] nums = {1,2,3};
		
		//System.out.println(permute(nums));

		List<Integer> input = Arrays.asList(nums);
		List<List<Integer>> ll = doSome(input);
		System.out.println(ll.size() + " | " + ll);
	}

	public static List<List<Integer>> permute(int[] nums) {
		
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		
		backTrack(res, new LinkedHashSet<Integer>(), nums);
		
		return res;
	}

	private static void backTrack(List<List<Integer>> res, Set<Integer> set, int[] nums) {
		
		if (set.size() == nums.length)
			
			res.add(new ArrayList<Integer>(set));
		
		else {
			
			for (int i = 0; i < nums.length; i++) {
				
				if (set.add(nums[i])) {
					backTrack(res, set, nums);
					set.remove(nums[i]);
				}
				
			}
			
		}
		
	}
	
	
	
	
	
	

	
	private static List<List<Integer>> doSome(List<Integer> nums){
		
		if(nums.size() < 2){

			List<Integer> perm = new ArrayList<>();
			perm.addAll(nums);
			List<List<Integer>> res = new ArrayList<>();
			res.add(nums);
			return res;
		}
		
		List<List<Integer>> res = new ArrayList<>();
		
		for(int i = 0; i < nums.size(); i++){
			
			List<Integer> newNums = new ArrayList<>();
			newNums.addAll(nums);
			newNums.remove(nums.get(i));
			
			List<List<Integer>> newRes = doSome(newNums);

			for(List<Integer> ll : newRes){
				ll.add(nums.get(i));
			}
			
			res.addAll(newRes);
			
		}
		
		
		return res;
		
	}

	
	
	

}
