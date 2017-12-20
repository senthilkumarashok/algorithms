package com.leslie.misc;

public class Djikstra {
	
	/*
	
	
	deepti.guthal [9:56 AM] 
{{0,2,1,6,0,0},
                               {2,0,3,0,0,0},
                               {1,3,0,0,2,4},
                               {6,0,0,0,5,0},
                               {0,0,2,5,0,1},
                               {0,0,4,0,1,0}}


[9:57] 
above on is mine

	*/
	public void run(int[][] input, int source, int dest){
						
		if(!validate(input, source, dest)) return;
		
		int rows = input.length;
		int cols = input[0].length;
		
		boolean[] visited = new boolean[cols];
		int[] results = new int[cols];
		int[] path = new int[cols];
		
		//Fill results with max value, but set result of source node to 0
		for(int i = 0; i < cols; i++){
			results[i] = Integer.MAX_VALUE;
			path[i] = -1;
		}
		results[source] = 0;
		
		//Set source as visited;
		visited[source] = true;
		
		//Visit each cell row-wise
		int cumMinCost = 0;

		for(int i = source; i < rows; ){
			
			int rowMinCost = Integer.MAX_VALUE;
			int rowMinCostIndex = -1;
			
			for(int j = 0; j < cols; j++){
				
				//If column is already visited, keep its value/cost & continue
				if(visited[j]) continue;
				
				//In input matrix, no path has -1 value, so set it to MAX_VALUE
				int ijCost = input[i][j] == -1 ? Integer.MAX_VALUE : input[i][j] + cumMinCost;

				//Cost in each cell equals minimum between cell cost + cumBaseCost, and cost of cell above
				if(ijCost < results[j]){
					results[j] = ijCost;
					path[j] = i;
				}
		
				//Adjust minimum cost & index if necessary
				if(results[j] < rowMinCost){
					rowMinCost = results[j];
					rowMinCostIndex = j;
				}
	
			}
			
			//System.out.println(rowMinCost);
			
			//Exit if couldn't find a min cost index (all nodes have already been visited)
			if(rowMinCostIndex == -1){
				//sb.append(" -> No further path");
				break;
			}
			
			//Add cost to current node to cum min cost
			cumMinCost = rowMinCost;

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
		
		//Print path
		printPath(path, source, dest);
		
	}
	
	
	
	public void run2(int[][] input, int source, int dest){
		
		if(!validate(input, source, dest)) return;
	
		//int rows = input.length;
		int cols = input[0].length;
				
		//Initially fill cost matrix will all infinity, except for source index
		//Initially fill path matrix will -1. Set initial path node to source
		int[] path = new int[cols];
		int[] cost = new int[cols];
		for(int i = 0; i < cols; i++){
			cost[i] = Integer.MAX_VALUE;
			path[i] = -1;
		}
		cost[source] = 0;
		path[0] = source;
		
		//Create visited matrix
		boolean[] visited = new boolean[cols];
		
		//Calculate minimum cost starting at source
		int minCost = 0;
		int currentNode = source;

		while(currentNode != dest){
			
			int nextNode = -1;
			int nodeMinCost = Integer.MAX_VALUE;
			
			for(int i = 0; i < cols; i++){
				
				if(i == currentNode || visited[i]) continue;//Only consider non-visited nodes
				
				//-1 in input matrix indicates no path
				int nodeCost = input[currentNode][i] == -1 ? Integer.MAX_VALUE : input[currentNode][i] + minCost;
	
				if(nodeCost < cost[i]){
					cost[i] = nodeCost;
					path[i] = currentNode;
				}

				if(cost[i] < nodeMinCost){
					nodeMinCost = nodeCost;
					nextNode = i;
				}

			}
			
			//Set current node to visited
			visited[currentNode] = true;
			
			//NextNode wasn't updated, So no further path
			if(nextNode == -1){
				break; 
			}
			
			minCost = nodeMinCost;
			currentNode = nextNode;
		
		}
		
		//Print min cost
		System.out.println("Min cost is: " + minCost);
		
		//Print path
		printPath(path, source, dest);
	
		
	}
	
	
	private boolean validate(int[][] input, int source, int dest){
		
		//If empty matrix, return
		if(input.length < 1) return false;
				
		//int rows = input.length;
		int cols = input[0].length;
		
		if(source >= cols || dest >= cols){
			System.err.println("Source & Destination indices should be less the number of column in the input matrix");
			System.exit(1);
		}
		
		//If source same as destination, return 0
		if(source == dest){ 
			System.out.println("Minimum Cost: 0");
			System.out.println("Optimum Path: " + ((char)('a' + dest)) );
			return false;
		}
		
		return true;
		
	}
	
	
	private void printPath(int[] path, int source, int dest){
		
		StringBuilder sb = new StringBuilder();
		if(path[dest] != -1){//If there is a path
			
			sb.append((char)('a' + dest)).append(" >- ");
			int previous = path[dest];
			while(previous != source){
				sb.append((char)('a' + previous)).append(" >- ");
				previous = path[previous];
			}
			
		}
		
		sb.append((char)('a' + source));
		
		System.out.println(sb.reverse().toString());
		
	}
	

}
