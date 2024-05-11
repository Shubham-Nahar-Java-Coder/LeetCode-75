class SingleNumber {
    public static int singleNumber(int[] nums) {
        // Initialize a variable to store the single number
        // Initialize it with the first element of the array
        int single = nums[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // XOR operation to find the single number
            // If the number occurs twice, XOR cancels them out, leaving only the single
            // occurrence
            single = single ^ nums[i];
        }
        return single;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 1, 2, 1, 2 };
        System.out.println(singleNumber(nums));
    }
}