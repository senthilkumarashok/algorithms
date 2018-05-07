
# Sorting Algorithms Fundamentals
---



## Performance Summary


|           	| **BUBBLE**   	| **SELECTION** 	| **INSERTION** 	| **SHELL** 		| **MERGE**     | **HEAP**      | **QUICK**|
|-----------	|----------	|-----------	|-----------	|------------	|------------	|------------	|------------	|
| **Worst**     	| O(n^2)   	| O(n^2)    	| O(n^2)    	| O(n ^ 3/2)  	| O(n log n) 	| O(n log n) 	| O(n log n) 	|
| **Average**   	| Θ(n^2)   	| Θ(n^2)    	| Θ(n^2)    	| Θ(n(^ 7/6)) 	| Θ(n log n) 	| Θ(n log n) 	| Θ(n log n) 	|
| **Best**      	| Ω(n)     	| Ω(n^2)    	| Ω(n)      	| Ω(n log n)  	| Ω(n log n) 	| Ω(n log n) 	| Ω(n log n) 	|
| **Space**     	| Constant 	| Constant  	| Constant  	|             	|            	|            	|            	|
| **Stable?**   	| Yes      	| Yes       	| Yes       	|             	|            	|            	|            	|
| **In-Place?** 	| Yes      	| Yes       	| Yes       	| Yes         	|            	|            	|            	|



### References

[Data Structures and Algorithms Complete Tutorial Computer Education for All](https://www.youtube.com/watch?v=YWnBbNj_G-U "link title")


<p align="center">
  <img src="https://github.com/lalifk/algorithms/blob/develop/resources/images/sorting/SummaryOfSortingMethods.png" width="500"/>
</p>



## Quick Facts


### General

+ Choice of sorting methods is dictated by size of keys, size of dataset, and pre-existing order of input data
Another consideration is amount of auxiliary space ...? 

### Bubble

+ Bubble sort worst case occurs when array is sorted in reverse order
+ Bubble sort best case array is already sorted
+ Bubble sort not efficient to use on large datasets
+ Bubble sort used for very small data sets

### Selection

+ Selection sort makes fewer data moves than bubble sort. About n2/2 comparisons and n exchanges
+ Selection sort is preferable to other quadratic algorithms when data movement is time consuming. Ex: Sorting of files with short keys
+ Selection sort can be used for small datasets with small keys and large record size

### Insertion

+ Insertion sort makes about n2/4 comparisons and n2/8 exchanges
+ Insertion sort performs better than bubble & selection sort
+ Insertion and shell sort give best performance among quadratic algorithms
+ Insertion and shell sort can be used for moderately large data sets
+ Insertion sort performs very well for smaller input sizes. And yes, it does beat merge sort

### Shell

+ Shell sort is an extension of insertion sort
+ Shell sort sometimes refered to as diminishing increment sort
+ Shell sort is a major improvement over quadratic sorting algorithms
+ Shell sort inventor is Donaled Shell
+ Shell sort is a method of choice for sorting of mederately large data sets consisting of few thousands data items

### Quick

+ Quick sort gives best performance if input data is randomly distributed
+ Quick sort gave best performance among logarithmic sorting methods, if input data is randomly distributed
+ Quick Sort will perform much better that Merge Sort on average since its constants (hidden by the big-O notation) are much smaller

### Heap

+ Heap sort preferable when distribution and order of input data is not predictable. It's a robust method with guaranteed logarithmic performance in all situations

### Merge

+ Merge sort has somewhat better performance than heap sort; however, it requires memory space as large as the input data to be sorted
+ Merge sort may not be a good choice for a very large dataset

### Radix

+ Radix sort shows good performance if dataset has short integer keys



## Resources


+ ??
