import java.util.Arrays;

class MaxNumberOfKSumPairs{
  public static int maxOperations(int[] nums, int k){
    int ans =0;
     Arrays.sort(nums);

     int left = 0;
     int right = nums.length-1;

     while(left < right){
      if(nums[left] + nums[right] < k){
        left++;
      }
      else if(nums[left] + nums[right] > k){
        right--;
      }
      else{
        left++;
        right--;
        ans++;
      }
     }
     return ans;
  }
  public static void main(String[] args) {
    int[] nums ={1,2,3,4};
    int k = 5;
    System.out.println(maxOperations(nums, k)); 
  }
}