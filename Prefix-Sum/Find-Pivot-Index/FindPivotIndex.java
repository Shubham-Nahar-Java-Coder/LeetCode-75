public class FindPivotIndex {
    public static int pivotIndex(int[] nums){
        int[] preSum = new int[nums.length];
        preSum[0] = 0;
        int total = nums[0];

        for (int i = 1; i < nums.length; i++) {
            total = total + nums[i];
            preSum[i] = preSum[i-1] + nums[i-1];            
        }
        for (int i = 0; i < nums.length; i++) {
            if(preSum[i] == total - preSum[i] - nums[i]){
                return i;
            }            
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,7,4,1,1,15};
        System.out.println(pivotIndex(nums));
    }    
}
