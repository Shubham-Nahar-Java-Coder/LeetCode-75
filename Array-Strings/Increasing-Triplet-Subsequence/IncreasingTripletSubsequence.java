class IncreasingTripletSubsequence {
    public static boolean increasingTriplet(int[] nums) {

        if (nums == null || nums.length < 3) {
            return false;
        }

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num;
            } else {
                return true;
            }
        }
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