public class LongestSubarrayOf1stAfterDeletingOneElement {
    public static int longestSubArray(int[] nums) {
        int ans = 0;
        int count = 0;
        int i = 0;
        int j = -1;

        while (i < nums.length) {
            // If current element is 1, move to the next element
            if (nums[i] == 1) {
                i++;
            }
            // If current element is 0
            else {
                count++; // Increment count of zeros
                i++; // Move to the next element
            }
            // Check if count exceeds 1 and j is less than i
            while (count > 1 && j < i) {
                j++;// Move the starting index of the subarray forward
                // If the element at index j is 0, decrement count
                if (nums[j] == 0) {
                    count--;
                }
            }
            // Update ans with the maximum length of subarray seen so far
            ans = Math.max(ans, i - j - 1);
        }
        return ans - 1;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 1, 1, 0, 1, 1, 0, 1 };
        System.out.println(longestSubArray(nums));
    }
}
