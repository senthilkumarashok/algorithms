package com.leslie.misc;

public class Djikstra {
	
	
	
	public void run(int[][] input, int source, int dest){
						
		//If empty matrix, return
		if(input.length < 1) return;
				
		int rows = input.length;
		int cols = input[0].length;
		
		if(source >= cols || dest >= cols){
			System.err.println("Source & Destination indices should be less the number of column in the input matrix");
			System.exit(1);
		}
		
		//If source same as direction, return 0
		if(source == dest){ 
			System.out.println("Minimum Cost: 0");
			System.out.println("Optimum Path: Same as initial" );
			return;
		}
		
		boolean[] visited = new boolean[cols];
		int[] results = new int[cols];
		
		//Create an array holding ascii character values for each column or node, starting with 'a' i.e. 65
		int[][] colNames = new int[1][cols];
		int pathNameAscii = 65;
		for(int i = 0; i < cols; i++){
			colNames[0][i] = pathNameAscii++;
		}	
			
		//Init sb for path
		StringBuilder sb = new StringBuilder();
		sb.append((char)colNames[0][source]);
		
		//Fill results with max value, but set result of source node to 0
		for(int i = 0; i < cols; i++){
			results[i] = Integer.MAX_VALUE;
		}
		results[source] = 0;
		
		//Set source as visited;
		visited[source] = true;
		
		//Visit each cell row-wise
		int cumMinCost = 0;

		for(int i = 0; i < rows; ){
			
			int rowMinCost = Integer.MAX_VALUE;
			int rowMinCostIndex = -1;
			
			for(int j = 0; j < cols; j++){
				
				//If column is already visited, keep its value/cost & continue
				if(visited[j]) continue;
				
				//In input matrix, no path has -1 value, so set it to MAX_VALUE
				int ijCost = input[i][j] == -1 ? Integer.MAX_VALUE : input[i][j] + cumMinCost;

				//Cost in each cell equals minimum between cell cost + cumBaseCost, and cost of cell above
				results[j] = Math.min(ijCost, results[j]);
		
				//Adjust minimum cost & index if necessary
				if(results[j] < rowMinCost){
					rowMinCost = results[j];
					rowMinCostIndex = j;
				}
	
			}
			
			System.out.println(rowMinCost);
			
			//Exit if couldn't find a min cost index (all nodes have already been visited)
			if(rowMinCostIndex == -1){
				sb.append(" -> No further path");
				break;
			}
			
			//Add cost to current node to cum min cost
			cumMinCost = rowMinCost;

			//Set letter path
			sb.append(" -> ").append((char)colNames[0][rowMinCostIndex]);
			
			//Exit if destination has been reached
			if(rowMinCostIndex == dest){
				break;
			}

			//Set min cost index as visited
			visited[rowMinCostIndex] = true;
				
			//Pick next row to visit -> rowMinCostIndex
			i = rowMinCostIndex;
			
		}
		
		System.out.println("Minimum Cost: " + cumMinCost);
		System.out.println("Optimum Path: " + sb.toString());
		
	}
	
	
	
	
	
	

}
