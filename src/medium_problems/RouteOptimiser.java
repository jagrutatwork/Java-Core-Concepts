package medium_problems;

public class RouteOptimiser {
	

	public static int balanceFinder(int arr[])
	{
		int totalSum = 0;
		for(int i=0; i<arr.length; i++)
		{
			totalSum += arr[i];
		}
		
		int leftSum = 0;
		
		for(int i =0; i<arr.length; i++)
		{
			int rightSum = totalSum - leftSum - arr[i];
			if(leftSum == rightSum)
				return i;
			leftSum += arr[i];
			
		}	
		return -1;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {2, 2, 5, 6, -2};
		
		System.out.println(balanceFinder(arr));
		
	}

}
