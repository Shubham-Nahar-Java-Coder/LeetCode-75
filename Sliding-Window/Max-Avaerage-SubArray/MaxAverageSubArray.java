public class MaxAverageSubArray{
    public static double findMaxAverage(int[] nums, int k){
      // Check if the window size is smaller than the length of the array
      if(nums.length<k){
        // Throws an exception with a message
        throw new IllegalArgumentException("Window size is small and cannot calculate the average");
      }
      int sum =0;
      // Initialize the sum of the first 'k' elements
      for(int i = 0; i<k; i++){
        sum = sum + nums[i];
      }
  
      int maxSum = sum;

      // Initialize the start and end index of the sliding window
      int startIndex = 0;
      int endIndex = k;

      while(endIndex<nums.length){
        // Subtract the element at startIndex from the sum as it's no longer in the window
        sum = sum - nums[startIndex];
        startIndex++;
        
        // Add the element at endIndex to the sum as it enters the window
        sum = sum + nums[endIndex];
        endIndex++;
  
        maxSum = Math.max(maxSum, sum);
      }
  
      return (double)maxSum/k;
    }
    public static void main(String[] args) {
      int[] nums = {1,12,-5,-6,50,3};
      int k = 4;
      System.out.println(findMaxAverage(nums, k));
    }
  }