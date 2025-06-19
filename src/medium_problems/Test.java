package medium_problems;

import java.util.HashMap;
import java.util.Map;

public class Test {
	
	public static String convertToPalindrome(String str) {
		
		char[] arr = str.toCharArray();
		
		Map<Character, Integer> map = new HashMap<>();
		
		//Storing the charaters with their occurence (increasing no. of occurence by 1 each time they repeat)
		for (int i = 0; i < arr.length; i++) {
			char c = str.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		//Check if more than one character has an oddcount //which means a palindrome canot be made
		int oddCount = 0;
		char oddChar = '0';
		
		for(char c : map.keySet())
		{
			if(map.get(c)%2 != 0)
			{
				oddCount++;
				oddChar = c;
			}
		}
		
		if(oddCount > 1)
		{
			return null;
		}
		
		//Build half the palindrome
		StringBuilder half = new StringBuilder();
		
		for(char c: map.keySet())
		{
			int count = map.get(c)/2;
			for(int i=0; i< count; i++)
			{
				half.append(c);
			}
		}
		
		
		
		//Build full palindrome
		String firstHalf = half.toString();
		String secondHalf = half.reverse().toString();
		
		if(oddCount == 1)
		{
			return firstHalf + oddChar + secondHalf;
		}
		else {
			return firstHalf + secondHalf;
		}

	}
	
	
	
	public static Boolean canBePalindrome(String str)
	{
		char arr[] = str.toCharArray();
		
		Map<Character, Integer> map = new HashMap<>();
			
		for(int i=0; i<arr.length; i++)
		{
			char c = arr[i];
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		int oddCount = 0;
		char oddChar = 0;
		
		
		for(char c : map.keySet())
		{
			if(map.get(c)%2 !=0)
			{
				oddCount++;
				oddChar = c;
			}
		}
		
		if(oddCount>1)
		{
			return false;
		}
		
		return true;
	}
	
	
	public static String convertToPalindrome2(String str)
	{
		char arr[] = str.toCharArray();
		
		Map<Character, Integer> map = new HashMap<>();
			
		for(int i=0; i<arr.length; i++)
		{
			char c = arr[i];
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		int oddCount = 0;
		char oddChar = 0;
		
		
		for(char c : map.keySet())
		{
			if(map.get(c)%2 !=0)
			{
				oddCount++;
				oddChar = c;
			}
		}
		
		if(oddCount>1)
		{
			return null;
		}
		
		
		StringBuilder half = new StringBuilder();
			
	    for(char c : map.keySet())
	    {
	    	if(map.get(c)/2 == 0)
	    	{
	    		half.append(c);
	    	}
	    }
	    
	    //create first half
	    
	    String firstHalf = half.toString();
	    
	    String secondHalf = half.reverse().toString();
	    
	    String ret = "";
	    
	    if(oddCount==0)
	    {
	    	ret =  firstHalf + secondHalf;
	    }
	    else if(oddCount ==1) {
	    	ret =  firstHalf + oddChar + secondHalf;
	    	
	    }
	    
	    return ret;
		
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(convertToPalindrome("asas"));
		
		System.out.println(canBePalindrome("asas"));
		
		System.out.println(canBePalindrome("asarys"));
		
	}

}
