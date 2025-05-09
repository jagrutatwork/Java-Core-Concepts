package medium_problems;

import java.util.Arrays;
import java.util.HashMap;

public class RemoveDuplicates {

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
	
	 public static int keepAtTheMostOnlyTwoOccurences(Integer[] nums) {
	        if (nums.length == 0)
	            return 0;
	        
	        HashMap<Integer, Integer> freqMap = new HashMap<>();
	        
	        // Step 1: Track the frequency of each number
	        for (int i = 0; i < nums.length; i++) {
	            int num = nums[i];
	            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
	        }

	        // Step 2: Rebuild the array
	        int insertPos = 0;
	        
	        // Step 3: Iterate over the map and fill the array
	        for (Integer num : freqMap.keySet()) {
	            int count = Math.min(freqMap.get(num), 2); // Ensure no more than two occurrences
	            for (int i = 0; i < count; i++) {
	                nums[insertPos++] = num;
	            }
	        }

	        // Step 4: Fill the remaining positions with null
	        while (insertPos < nums.length) {
	            nums[insertPos++] = null;
	        }

	        // Print the final array
	        System.out.println("Array after processing: " + Arrays.toString(nums));
	        
	        return insertPos; // Number of unique elements
	    }



//	public static int keepAtTheMostOnlyTwoOccurences(Integer nums[]) {
//		if (nums.length == 0)
//			return 0;
//
//		int count = 1; // Start counting from the first element
//		int insertPos = 1; // Position to insert the valid element (starting after the first element)
//
//		// Iterate through the array starting from the second element
//        for (int i = 1; i < nums.length; i++) {
//            // If the current element is the same as the previous one, increment count
//            if (nums[i].equals(nums[i - 1])) {
//                count++;
//            } else {
//                // If it's a new element, reset count to 1
//                count = 1;
//            }
//
//            // Only insert element if count <= 2
//            if (count <= 2) {
//                // Check if insertPos is within bounds
//                if (insertPos < nums.length) {
//                    nums[insertPos] = nums[i]; // Insert the current element at insertPos
//                    insertPos++; // Move insert position forward
//                }
//            } else {
//                // Set the element to null if it exceeds 2 occurrences
//                nums[i] = null;
//            }
//        }
//
//
//		// Print the entire array including nulls
//		
//		System.out.println(Arrays.toString(nums));
//
//		return insertPos; // Return the position of the first empty slot (the count of valid elements)
//	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer nums[] = {1, 2, 2};
//		
//		System.out.print("Unique Elements number : " +removeDuplicates(nums));

		Integer nums[] = { 1, 2, 2, 2, 3, 3, 4, 4, 4, 5, 6, 6 };

		System.out.print("Unique Elements number : " + keepAtTheMostOnlyTwoOccurences(nums));

	}

}
