package com.leslie.misc;

public class MiscMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runDjikstra();
		
	}
	
	
	
	public static void runDjikstra(){
		
		
		int[][] input = 
			{
					{ 0,   1,  -1,  -1,  8},
					{-1,   0,   2,  -1,  -1},
					{-1,  -1,   0,   9,   1},
					{-1,  -1,  -1,   0,  -1},
					{-1,  -1,  -1,   6,   0}				
			};
		
		Djikstra dj = new Djikstra();
		dj.run(input, 0, 3);
		
		
	}

}
