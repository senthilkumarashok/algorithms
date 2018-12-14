package com.leslie.misc;

import java.util.Arrays;

public class KMP {
	
	
	/*
	 * PUBLIC Methods
	 */
	
	public void doKMP(String text, String pattern){
		
		System.out.println(Arrays.toString(computePartialMatchTable(pattern)));
		System.out.println(Arrays.toString(computePartialMatchTable2(pattern)));

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
	private int[] computePartialMatchTable2(String pattern){
		
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
