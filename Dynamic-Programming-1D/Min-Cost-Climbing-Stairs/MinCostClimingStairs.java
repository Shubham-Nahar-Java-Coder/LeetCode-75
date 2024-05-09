class MinCostClimingStairs {
  public static int minCost(int[] cost) {
    //Edge Case: If there are no steps or only one step, the cost is 0
    if (cost.length == 0 || cost.length == 1) {
      return 0;
    }
    // Edge Case:  If there are only two steps, return the minimum cost of either step.
    if (cost.length == 2) {
      return Math.min(cost[0], cost[1]);
    }

    int[] dp = new int[cost.length];

    dp[0] = cost[0];
    dp[1] = cost[1];

    // Iterate over the cost array starting from the third step
    for (int i = 2; i < cost.length; i++) {
      // Calculate the minimum cost to reach the current step by considering
      // the cost of the current step plus the minimum cost of reaching the
      // previous step or the step before the previous step
      dp[i] = Math.min(cost[i] + dp[i - 1], cost[i] + dp[i - 2]);
    }
    // Return the minimum cost of reaching the last step, which is the minimum
    // of the cost of reaching the last two steps.
    return Math.min(dp[dp.length - 1], dp[dp.length - 2]);
  }

  public static void main(String[] args) {
    int[] cost = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
    System.out.println(minCost(cost));
  }
}