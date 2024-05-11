class ProductOfArrayExceptSelf {
  public static int[] productExceptSelf(int[] nums) {
    // Initialize arrays to store products to the left and right of each element
    int[] left = new int[nums.length];
    int[] right = new int[nums.length];

    // There are no elements to the left of the first element, so the product is 1
    left[0] = 1;
    for (int i = 1; i < nums.length; i++) {
      // Product to the left of current element
      left[i] = left[i - 1] * nums[i - 1];
    }

    // There are no elements to the right of the last element, so the product is 1
    right[nums.length - 1] = 1;
    for (int i = nums.length - 2; i > -1; i--) {
      // Product to the right of current element
      right[i] = right[i + 1] * nums[i + 1];
    }
    // Calculate the final result by multiplying left and right products for each
    // element
    int[] ans = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      ans[i] = left[i] * right[i];
    }
    return ans;
  }

  public static void main(String[] args) {
    int[] nums = { -1, 1, 0, 3, -3 };
    int[] ans = productExceptSelf(nums);
    for (int i = 0; i < ans.length; i++) {
      System.out.print(ans[i] + " ");
    }
  }
}