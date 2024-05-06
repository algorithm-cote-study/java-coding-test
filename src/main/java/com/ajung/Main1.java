package com.ajung;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 1 - .QZ
 * 2 - ABC
 * 3 - DEF
 * 4 - GHI
 * 5 - JKL
 * 6 - MNO
 * 7 - PRS
 * 8 - TUV
 * 9 - WXY
 * 2220281
 */

public class Main1 {

    private static final String[] MATCH_ALPHABET = {".QZ", "ABC", "DEF", "GHI", "JKL", "MNO", "PRS", "TUV", "WXY"};


    public String solution(String keypad) {
        int[] splitKeypad = Arrays.stream(keypad.split("")).mapToInt(Integer::parseInt).toArray();

        Deque<Integer> queue = new LinkedList<>();
        for (int input : splitKeypad) {
            queue.offer(input);
        }

        return findInputAlphabet(queue);
    }

    private static String findInputAlphabet(Deque<Integer> queue) {
        StringBuilder answer = new StringBuilder();

        int compare = queue.poll();
        int count = 1;
        while (!queue.isEmpty()) {
            int target = queue.poll();

            if (target != 0) {
                if (compare == target) {
                    count++;
                } else {
                    answer.append(convertIntegerToString(compare, count));
                    compare = target;
                    count = 1;
                }
            } else {
                answer.append(convertIntegerToString(compare, count));
                count = 0;
            }

        }
        answer.append(convertIntegerToString(compare, count));
        return answer.toString();
    }


    private static char convertIntegerToString(int input, int count) {
        return MATCH_ALPHABET[input - 1].charAt(count - 1);
    }
}
