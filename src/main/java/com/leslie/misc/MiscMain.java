package com.leslie.misc;

public class MiscMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//runDjikstra();
		//runRedAndBlueTapeFB();
		
		KMP kmp = new KMP();
		kmp.doKMP("dpainfaininindf", "");
		
	}
	
	/*
	public static void runRedAndBlueTapeFB(){
		
		RedBlueTapeFB rb = new RedBlueTapeFB();
		
		int[] red = {4,6};
		int[][] arr = { e{4,5} };
		List<int[]> blueList = Arrays.asList(arr);
		
		System.out.println(rb.isRedVisible(red, blueList));
		
	}
	*/
	
	public static void runDjikstra(){
		
		
		
		int[][] inputLeslie = 
			{
					{ 0,   1,  -1,  -1,  8},
					{-1,   0,   2,  -1,  -1},
					{-1,  -1,   0,   9,   1},
					{-1,  -1,  -1,   0,  -1},
					{-1,  -1,  -1,   6,   0}				
			};
		
		Djikstra dj = new Djikstra();
		
		//System.out.println("=== Input Leslie === ");
		//System.out.println("Expected Min Cost: 10. Path: a -> b -> c -> e -> d");
		//dj.run2(inputLeslie, 0, 3);
		
		int[][] inputDeepGeek = 
			{
				  //    { 0,   1,   2,   3,   4,    5,    6,   7,    8},
				  /*0*/	{ 0,   4,  -1,  -1,  -1,   -1,   -1,    8,   -1},
				  /*1*/ { 4,   0,   8,  -1,  -1,   -1,   -1,   11,   -1},
				  /*2*/ {-1,   8,   0,   7,  -1,    4,   -1,   -1,    2},
				  /*3*/ {-1,  -1,   7,   0,   9,   14,   -1,   -1,   -1},
				  /*4*/ {-1,  -1,  -1,   9,   0,   10,   -1,   -1,   -1},
				  /*5*/ {-1,  -1,   4,  14,  10,    0,    2,   -1,   -1},
				  /*6*/ {-1,  -1,  -1,   -1,  -1,   2,    0,    1,    6},
				  /*7*/ { 8,  11,  -1,   -1,  -1,   -1,   1,    0,    7},
				  /*8*/ {-1,  -1,   2,   -1,  -1,   -1,   6,    7,    0}
			};
		//http://www.geeksforgeeks.org/greedy-algorithms-set-6-dijkstras-shortest-path-algorithm/
		//System.out.println("=== Input Deep Geeks === ");
		//dj.run(inputDeepGeek, 6, 5);
		/*
		
		Vertex   Distance from Source
			0                0
			1                4
			2                12
			3                19
			4                21
			5                11
			6                9
			7                8
			8                14
		
		*/
		
		
		int[][] inputDeep = 
			{
					{ 0,   2,  1,  6,  -1,   -1},
					{ -1,   0,  3,  -1,  -1,   -1},
					{ -1,   -1,  0,  -1,  2,   4},
					{ -1,   -1,  -1,  0,  5,   -1},
					{ -1,   -1,  -1,  -1,  0,   1},
					{ -1,   -1,  -1,  -1,  -1,   0}
			};
		
		int[][] inputDeep2 = 
			   {{0,2,1,6,-1,-1},
                {2,0,3,-1,-1,-1},
                {1,3,0,-1,2,4},
                {6,-1,-1,0,5,-1},
                {-1,-1,2,5,0,1},
                {-1,-1,4,-1,1,0}};
		
		dj.run2(inputDeep, 0, 5);
		
	}

	@Override
	public String toString() {
		return "MiscMain []";
	}

	
}
