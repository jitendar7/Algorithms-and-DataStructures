package com.sorting;
/*
 * Complexity of insertion sort is O(N^2)
 * 
 * The algorithm sorts the input numbers 'in place'
 * 
 */

public class InsertionSort {

	
	public static void sort(int[] arr){
		int len = arr.length;
		
		System.out.print("Before Sorting ... ");
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+",");
		}
		
		
		for(int j=1;j<len;j++){
			int key = arr[j];
			
			//Insert A[j] into the sorted sequence A[0.. j-1]
			int i = j-1;
			
			while(i>=0 && arr[i]>key){
				arr[i+1]=arr[i];
				i--;
			}
			
			arr[i+1]=key;
			
		}
		

		System.out.print("\nAfter Sorting .... ");
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+",");
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {5,6,3,2,1,0,12,11,4};
		
		sort(arr);
		
	}
	
	

}
