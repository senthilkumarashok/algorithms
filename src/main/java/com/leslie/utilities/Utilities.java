package com.leslie.utilities;

import com.leslie.tree.TreeNode;

public class Utilities {


	public static void swap(int[] nums, int i, int j){
		
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
		
	}
	
	
	public static int[] copy(int[] nums, int start, int end){
		
		int[] copy = new int[end - start + 1];
		
		for(int i = start; i <= end; i++){
			copy[i - start] = nums[i];
		}

		return copy;
	}
	
	
	public static void swapChars(char[] chars, int i, int j){
		
		char temp = chars[i];
		chars[i] = chars[j];
		chars[j] = temp;
		
	}

	public static char[] copyChars(char[] chars, int start, int end){
		
		char[] copy = new char[end - start + 1];
		
		for(int i = start; i <= end; i++){
			copy[i - start] = chars[i];
		}

		return copy;
	}
	
	
	public static String swapStr(String str, int i, int j){
		
		if(i == j) return new String(str);
		
		/*
		int low = Math.min(i, j);
		int high = Math.max(i, j);
		

		StringBuilder sb = new StringBuilder();
		sb.append(str.substring(0, low))
		.append(str.charAt(high))
		.append(str.substring(low + 1, high))
		.append(low)
		.append(Math.min(high+1, str.length()));
		
		return sb.toString();
		*/
		char[] chars = str.toCharArray();
		Utilities.swapChars(chars, i, j);
		
		return new String(chars);
	
	}
	
	
	
	
}
