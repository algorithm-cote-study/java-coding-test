package com.stclab;

public class Main3_2 {

    public static int solution(int[][] customer) {
        int max = Integer.MIN_VALUE;
        for (int[] cus : customer) {
            max = Math.max(max, cus[1]);
        }
        boolean[] memorize = new boolean[max + 1];
        int count = 0;
        for (int[] cus : customer) {
            if (!memorize[cus[0]])
                count++;
            for (int i = cus[0]; i <= cus[1]; i++) {
                memorize[i] = true;
            }
        }

        int total = 0;
        for (boolean memory : memorize) {
            if (memory)
                total++;
        }
        return total - count;
    }

}
