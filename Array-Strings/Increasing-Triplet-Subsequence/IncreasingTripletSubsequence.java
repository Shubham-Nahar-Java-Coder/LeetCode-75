class IncreasingTripletSubsequence {
    public static boolean increasingTriplet(int[] nums) {

        // Check if the input array is null or has fewer than 3 elements
        if (nums == null || nums.length < 3) {
            return false;
        }

        // Initialize two variables to store the smallest and second smallest elements
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        // Iterate through each element in the input array
        for (int num : nums) {
            // If the current element is less than or equal to the smallest element found so
            // far
            if (num <= first) {
                first = num;
            }
            // else, if the current element is less than or equal to the second smallest
            // element found so far
            else if (num <= second) {
                second = num;
            }
            // If neither of the above conditions is met, it means we found an increasing
            // triplet
            else {
                return true;
            }
        }
        // If the loop completes without finding an increasing triplet, return false
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 4, 3, 2, 1 };
        System.out.println(increasingTriplet(nums)); // False
        int[] nums1 = { 1, 2, 3, 4, 5 };
        System.out.println(increasingTriplet(nums1)); // True
        int[] nums2 = { 2, 1, 5, 0, 4, 6 };
        System.out.println(increasingTriplet(nums2)); // True
    }
}