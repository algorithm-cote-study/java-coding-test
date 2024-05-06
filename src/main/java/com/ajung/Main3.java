package com.ajung;

public class Main3 {

    public static int solution(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        if (sum % 2 != 0) {
            return 0;
        }

        int targetSum = sum / 2;

        int[] dp = new int[targetSum + 1];
        dp[0] = 1;

        for (int num : numbers) {
            for (int j = targetSum; j >= num; j--) {
                dp[j] = (dp[j] + dp[j - num]) % 100000;
            }
        }

        return dp[targetSum];
    }
}
