class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        // Initialize two pointers, left and right, at the beginning and end of the
        // array
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        // Iterate through the array until left pointer is less than right pointer
        while (left < right) {
            // Calculate the area between the two vertical lines at positions left and right
            int area = Math.min(height[left], height[right]) * (right - left);

            // Update maxArea to be the maximum of the current area and the previous maximum
            // area
            maxArea = Math.max(area, maxArea);

            // Move the pointer corresponding to the shorter vertical line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(height));
    }
}