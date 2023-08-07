package com.ktw.section9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 팰린드롬 만들기 - DP
 */
public class Main5 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int n = Integer.parseInt(reader.readLine());
        int[] nums = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        return findMinNumCount(n, nums);
    }

    private static int findMinNumCount(int n, int[] nums) {
        int[][] board = new int[n + 1][n + 1];

        int count = 1;
        while (count < n) {
            int left = 1;
            int right = left + count;
            while (right <= n) {
                if (nums[left - 1] == nums[right - 1]) {
                    board[left][right] = board[left + 1][right - 1];
                } else {
                    board[left][right] = Math.min(board[left][right - 1], board[left + 1][right]) + 1;
                }
                left++;
                right++;
            }
            count++;
        }

        return board[1][n];
    }
}
