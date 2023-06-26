package com.ktw.section5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 그리디 : 스프링 쿨러
 */
public class Main3 {


    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[][] springCoolers = new int[nums.length + 1][2];
        for (int i = 0; i < nums.length; i++) {
            int start = Math.max(0, i - nums[i]);
            int end = Math.min(n, i + nums[i]);
            springCoolers[i][0] = start;
            springCoolers[i][1] = end;
        }

        return findMinCooler(springCoolers, n);
    }

    private static int findMinCooler(int[][] springCoolers, int n) {
        int answer = 0;
        int start = 0;
        int end = 0;
        Arrays.sort(springCoolers, Comparator.comparingInt(a -> a[0]));

        for (int i = 0; i < n + 1; i++) {
            int j = i;
            while (j < n + 1 && springCoolers[j][0] <= start) {
                end = Math.max(end, springCoolers[j][1]);
                j++;
            }
            answer++;
            if (end == n) return answer;
            if (start == end) return -1;
            start = end;
        }
        return answer;
    }


}
