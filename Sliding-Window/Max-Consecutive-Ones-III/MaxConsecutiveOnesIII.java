public class MaxConsecutiveOnesIII {
    public static int longestOnes(int[] nums, int k){
        int i = 0;
        int j = -1;
        int ans = 0;
        int countOfZero = 0;
        // Loop through the array using the pointer i
        while(i<nums.length){
             // If the current element is 0, increment countOfZero and move the window's start pointer
            if(nums[i] == 0){
                countOfZero++;
                i++;
            }
            else{
                i++;
            }
            // Adjust the window size until countOfZero becomes equal to or lesser than k
            while(countOfZero < k){
                j++;
                if(nums[j] == 0){
                    countOfZero--;
                }
            }           
            int sizeOfWindow = i - 1 - j;
            ans = Math.max(ans, sizeOfWindow);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k =3;
        System.out.println(longestOnes(nums, k));
    }
}
