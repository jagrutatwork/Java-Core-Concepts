package medium_problems;

import java.util.Arrays;

//Hackerearth problem - wave array -  wiggle sort


public class WiggleSort { 
	
	
	
	public static int[] wiggleSort(int arr[]) {
		
		Arrays.sort(arr);
		
		for(int i=0; i+1< arr.length; i+=2) //i+1<arr.length to avoid ArrayOutOfBoundsException
		{
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		    
		}
		
		return arr;
	}
	
	public static int[] wiggleSort2(int arr[])//Without using Arrays.sort();
	{
		
		//For even index
		
//		for(int i=0; i+1<arr.length-1;i+=2)
//		{
//			if(arr[i+1]>arr[i])
//			{
//				swap(arr, i, i+1);
//			}
//		}
//		
//		//For odd index
//		for(int i=1; i+1<arr.length;i+=2)
//		{
//			if(arr[i+1]<arr[i])
//			{
//				swap(arr, i, i+1);
//			}
//		}
		
		//this is wrong write single for loop and inside it write if statements to check odd/even positions
		
		for(int i=0; i<arr.length-1;i++) {
			if((i%2==0) && (arr[i+1]>arr[i]))
			{
				swap(arr, i, i+1);
			}
			else if((i%2==1) && (arr[i+1]<arr[i]))
			{
				swap(arr, i, i+1);
			}
			
		}
		
		return arr;
	}
	
	public static void swap(int arr[], int a, int b)
	{
		
			int temp = arr[a];
			arr[a] =arr[b];
			arr[b] = temp;

	} 
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 4, 5, 8, 10};
		wiggleSort(arr);
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		int arr2[] = {3, 2, 11, 9, 5, 19, 8, 10};
		wiggleSort2(arr2);
		
		for(int i : arr2) {
			System.out.print(i+" ");
		}
		
	}

}
