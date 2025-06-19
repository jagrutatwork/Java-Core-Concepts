package com.java.simple_problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
	
	
	//practice
	public String reverseString1(String str)
	{
		String rev = "";
		
		char[] charArray = str.toCharArray();
		
		for(int i = str.length()-1;i>0; i--)
		{
			rev += charArray[i];
		}
		
		return rev;
		
	}
	
	//for efficiency:
	public String reverseString2(String str) //using string builder
	{
		StringBuilder rev = new StringBuilder(str);
		
		return rev.reverse().toString();
	}
	
	
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
	
	
	//practice
	
	public static void bubbleSort1(int arr[])
	{
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr.length-1; j++)
			{
				//swap logic
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void bubbleSort2(int arr[])
	{
		boolean swapped = false;
		
		for(int i=0; i<arr.length-1-i; i++)
		{
			for(int j=0; j<arr.length-1; j++)
			{
				//swap logic
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped =  true;
				}
			}
			
			if(!swapped)
			{
				break;
			}
		}
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
	
		//PRACTICE
		public static boolean isPalindrome1(String str)
		{
			
			int i =0;
			int j = str.length()-1;
			while(i<j)
			{
				if(str.charAt(i) != str.charAt(j))
				{
					return false;
				}
				i++;
				j--;
			}
			
			
			return true;
		}
		
		
		
		public static int [] removeDuplicates(int[] arr)
		{
			Set<Integer> hashSet = new HashSet<Integer>();
			
			
			for(int i=0; i<arr.length; i++)
			{
				hashSet.add(arr[i]);
			}
			
			int hashSetArr[] = new int[hashSet.size()];
			
			int index = 0;
			for(int h : hashSet)
			{
				hashSetArr[index++] = h;
			}
			
			return hashSetArr;
		}
		
		public static String [] removeDuplicates1(String arr[])
		{
			Set<String> hashSet = new HashSet<String>();
			
			for(int i=0;  i<arr.length; i++)
			{
				hashSet.add(arr[i]);
			}
			
			String hashSetarr[] = new String[hashSet.size()];
			
			int ind = 0;
			for(String s: hashSet)
			{
				hashSetarr[ind++] = s;
			}
			
			return hashSetarr;
		}
		
	
		//for maintaining order use linkedHashSet
		
		
		//another problem is where the array is sorted// we need to replace the duplicates with null
		//if not sorted we can first sort and then
		public static int removeDuplicates(Integer nums[]) {
			if (nums.length == 0)
				return 0;

			int uniqueCount = 1;

			for (int i = 1; i < nums.length; i++) {
				if (nums[i] != null && !nums[i].equals(nums[i - 1])) {
					uniqueCount++;
				} else {
					nums[i] = null;
				}

			}

			System.out.println(Arrays.toString(nums));

			return uniqueCount;
		}
		
		public static int replaceDuplicatesWithNull(Integer arr[]){
			
			if(arr.length == 0)
			{
				return 0;
			}
			
			if(arr.length == 1)
			{
				return 1;
			}
			
			int uniqueCount = 1;
			for(int i = 1; i<arr.length; i++)
			{
				if(arr[i] != null && !arr[i].equals(arr[i-1])) {
					
					uniqueCount++;
					
				}
				else {
					arr[i] = null;
				}
				
				return uniqueCount;
			}
			return 0;
		}
		
		public static boolean isPrime1(int num)
		{
			if(num ==0 || num == 1)
			{
				return false;
			}
			
			int k = 2;
			while(k<num)
			{
				if(num%k ==0)
				{
					return false;
				}
				k++;
			}
			return true;
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
		
		System.out.println(" isPrime1 : "); //f
		
		System.out.println(isPrime1(9)); //f
		
		
		System.out.println(isPrime1(8)); //f
		
		System.out.println(isPrime1(5)); //t
		
		System.out.println(isPrime1(7)); //t
		
		
		printPrime(20);
		System.out.println(reverseString("JAGRUT"));
		System.out.println(reverseStringBuilder("JAGRUT"));
		
		System.out.println("is Palindrome 1");
		System.out.println(isPalindrome1("donovan"));
		
		System.out.println(isPalindrome1("rever"));
		
		System.out.println(" ");
		
		  int[] arr1 = {5, 3, 8, 4, 2};
		  
//		  Thread t1 = new Thread(() -> bubbleSortOpt(arr1.clone()));
//		  Thread t2 = new Thread(() -> bubbleSort(arr1.clone()));
//	
//	      t1.start();
//	      t2.start();
	        
		  
		
		
		
	}
	
	
	
	

}
