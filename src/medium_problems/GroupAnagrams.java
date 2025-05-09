package medium_problems;

import java.util.*;

public class GroupAnagrams {
	
	
	public static List<List<String>> groupAnagrams(String[] arr)
	{
		Map<String, List<String>> map = new HashMap<>();
		
		
		for(int i=0; i<arr.length; i++)
		{
			char[] chars = arr[i].toCharArray();
			Arrays.sort(chars);
			
			String sorted = new String(chars);
			
			if(map.containsKey(sorted))
			{
				map.get(sorted).add(arr[i]);
			}
			else {
				List<String> newList = new ArrayList<>();
				newList.add(arr[i]);
				map.put(sorted, newList);
			}
			
		}
		
		return new ArrayList<>(map.values());
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(input);

        System.out.println(result);
		
	}

}
