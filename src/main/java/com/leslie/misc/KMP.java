package com.leslie.misc;

import java.util.Arrays;

public class KMP {
	
	
	/*
	 * PUBLIC Methods
	 */
	
	public int doKMP(String text, String pattern){
		
		System.out.println("Text: " + text + ", Pattern: " + pattern);
		
		if(text == null  || 
				pattern == null || 
				pattern.length() > text.length() ||
				pattern.length() == 0 ||
				text.length() == 0) return 0;
		
		int[] table = computePartialMatchTableImproved(pattern);
		
		System.out.println("Partial Match Table: " + Arrays.toString(table));
		
		int t = 0, p = 0;
		int count = 0;
		
		while(t < text.length()){
			
			if(text.charAt(t) == pattern.charAt(p)){
				
				p++;
				t++;
				
				if(p == pattern.length() - 1){
					count++;
					p = table[p - 1];
				}
				
			}
			else if (p > 0){
				p = table[p - 1];
			}
			else{
				t++;
			}
	
			
		}
		
		System.out.println("Count: " + count);
		
		return count;
		
	}
	
	
	/*
	 * PRIVATE Methods
	 */
	
	
	
	private int[] computePartialMatchTable(String pattern){
		
		int length = pattern.length();
		
		int[] table = new int[length];
		
		for(int i = 1; i < length; i++){
			
			if(pattern.charAt(i) == pattern.charAt(0)){
				
				int k = i, j = 0;
				
				table[k] = Math.max(table[k], 1);
				
				k++;
				j++;
				
				while(k < length && pattern.charAt(k) == pattern.charAt(j)){
					table[k] = Math.max(table[k], k - i + 1);
					k++;
					j++;
				}
				
			}
			
		}
		
		return table;	
		
	}
	
	
	/**
	 * Source & explanation: https://www.youtube.com/watch?v=tWDUjkMv6Lc&feature=youtu.be
	 * @param pattern
	 * @return
	 */
	private int[] computePartialMatchTableImproved(String pattern){
		
		int length = pattern.length();
		
		int[] table = new int[length];
		
		int j = 0;//Length of longest prefix/suffix
		int i = 1;
		
		while(i < length){
			
			if(pattern.charAt(i) == pattern.charAt(j)){
				
				table[i] = j + 1;
				i++;
				j++;
				
			}
			else{ 
				
				if(j > 0){
					j = table[j - 1];
				}
				else{
					table[i] = 0;
					i++;
				}
				
			}
			
		}
		
		return table;	
		
	}

}
