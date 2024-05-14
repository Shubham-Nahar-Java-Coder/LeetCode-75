public class LongestSubarrayOf1stAfterDeletingOneElement {
    public static int longestSubArray(int[] nums){
        int ans = 0;
        int count = 0;
        int i = 0;
        int j = -1;

        while(i< nums.length){
            if(nums[i] == 1){
                i++;
            }
            else{
                count++;
                i++;
            }
            while(count>1 && j < i){
                j++;
                if(nums[j] == 0){
                    count--;
                }
            }

            ans = Math.max(ans, i-j-1);
        }
        return ans -1;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,0,1,1,0,1};
        System.out.println(longestSubArray(nums));
    }
}
