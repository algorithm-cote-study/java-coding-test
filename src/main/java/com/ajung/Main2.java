package com.ajung;

public class Main2 {

    public static int solution(int p, int m, int d) {
        int minRate = 0;
        int maxRate = 100;  // 0%부터 100%까지

        while (minRate < maxRate) {
            int rate = (minRate + maxRate) / 2;
            long futureValue = p;

            for (int i = 0; i < m; i++) {
                futureValue += (futureValue * rate) / 100;
            }

            if (futureValue < d) {
                minRate = rate + 1;
            } else {
                maxRate = rate;
            }
        }

        return minRate;
    }
}
