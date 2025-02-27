package com.java.simple_problems;

/**
 * 
 */
/**
 * 
 */
public class Problem {
	
	//Write a method that prints all the even numbers upto n
	public static void printEven(int m) {
		for(int i=0; i<m; i++)
		{
			if(i%2 ==0)
			{
				System.out.println(" "+i);
			}
		}
	}
	
	//Write a method that prints all the odd numbers upto n
		public static void printOdd(int m) {
			for(int i=0; i<m; i++)
			{
				if(i%2 !=0)
				{
					System.out.println(" "+i);
				}
			}
		}
		
	//Linear search
	public static int linearSearch(int arr[], int element)
	{
		for(int j=0; j<arr.length; j++ )
		{
			if(arr[j]==element)
			{
				return j;
			}
		}
		return -1;
		
	}
	
	//isPrime
	public static boolean isPrime(int n)
	{
		
		//corner cases 0 and 1 
		if(n ==0 || n ==1)
			return false;
		
		int k = 2;
		
			while(k<n)
			{
				if(n%k == 0)
				{
					return false;
				}
					k++;
			}
			
		return true;
	
	}
	
	
	//Prime Number upto n
	public static void printPrime(int num)
	{
		for(int j=0; j<num; j++ )
		{
			if(isPrime(j))
			{
				 System.out.println(j);
			}
		}
		
	}
	
	//reverseString
	public static String reverseString(String x)
	{
		String rev="";
		char[] charArrray = x.toCharArray();
		for(int p=x.length()-1; p>=0; p--) {
			rev += charArrray[p];
		}
		return rev;
	}
	//	
	//	Inefficient String Concatenation (rev += charArray[p])
	//
	//	In Java, strings are immutable, meaning each time you concatenate (+=), a new String object is created.
	//	This results in O(n²) time complexity due to repeated object creation and copying.
	//	For large strings, this will cause performance issues.
	public static String reverseStringBuilder(String x)
	{
		StringBuilder rev = new StringBuilder(x);
		return rev.reverse().toString();
	}
	//	StringBuilder is mutable, so reversing the string is done in-place.
	//	This runs in O(n) time complexity instead of O(n²).
		
	//isPalindrome()
	public static boolean isPalindrome(String str) {
		int left =0;
		int right = str.length()-1;
		char [] arr = str.toCharArray();
		
		while(left<right)
		{
			if(arr[left] != arr[right])
			{
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	//BinarySearch (recursion)
	//Binary Search (while loop)
	//Sorting Algos
	//Selection sort
	public static int[] selectionSort(int arr[])
	{
		int smallest, index;
		
		for (int i = 0; i<arr.length; i++)
		{
			smallest = arr[i];
			index = i;
			for(int j = i+1; j< arr.length; j++)
			{
				if(arr[j]< smallest)
				{
					smallest = arr[j];
					index = j;
				}
				
				
			}
			if(index!=i)
			{
				int temp = arr[i];
	            arr[i] = arr[index];
	            arr[index] = temp;
			}
		}
		
		return arr;
		//time complexity:
		
		//space complexity:
		
	}
	
	
	//BubbleSort
	public static void bubbleSort(int arr[])
	{
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr.length-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}	
		System.out.println("BS HUM FIRST");
		
	}
	
	//BubbleSort - optimized
		public static void bubbleSortOpt(int arr[])
		{
			boolean swapped = false;
			for(int i=0; i<arr.length-1-i; i++) //-i meaning in every iteration of the outer for loop we know 
				//for sure the largest element has been sent to the end hence it doesn't need to
				//be checked further, this means we can reduce the those number(i) of elements from the end for the check
			{
				for(int j=0; j<arr.length-1; j++)
				{
					if(arr[j]>arr[j+1])
					{
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
						swapped = true;
					}
				}
				
				if(!swapped)
				{break;}
			}	
			System.out.println("BSO HUM FIRST");
		}
	
	
	/**
	 * @param args.j
	 */
	public static void main(String [] args) {
		
		printEven(17);
		printOdd(27);
		
//		int[] arr1 = {21, 3, 125, 14, 23, 54, 666, 77, 63, 43, 90, 27};
		//int[] arr1 = {2,7,4,1,5,3};
		
//		System.out.println(linearSearch(arr1, 8));
//		System.out.println(linearSearch(arr1, 23));
		
		System.out.println(isPrime(9)); //f
		
		printPrime(20);
		System.out.println(reverseString("JAGRUT"));
		System.out.println(reverseStringBuilder("JAGRUT"));
		
		System.out.println(isPalindrome("donovan"));
		
		System.out.println(isPalindrome("rever"));
		
		  int[] arr1 = {5, 3, 8, 4, 2};
		  
		  Thread t1 = new Thread(() -> bubbleSortOpt(arr1.clone()));
		  Thread t2 = new Thread(() -> bubbleSort(arr1.clone()));
	
	      t1.start();
	      t2.start();
	        
		  
		
		
		
	}
	
	
	

}
