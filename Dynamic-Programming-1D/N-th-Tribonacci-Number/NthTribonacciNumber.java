class NthTribonacciNumber {
    public static int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        }

        int[] dp = new int[40];

        // Initialize first three elements of the array
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        // Calculate tribonacci numbers for indices 3 to n-1
        for (int i = 3; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(tribonacci(25));
    }
}
