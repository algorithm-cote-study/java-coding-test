package com.ktw.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 음수가 있는 부분수열 (해싱 & 시간 파싱)
 */
public class Main4 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int[] nums = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int m = Integer.parseInt(reader.readLine());
        int answer = 0;
        
        int start = 0;
        int end = 1;
        int compare = nums[start];
        while (true) {
            if (compare == m) {
                answer++;
            }
            if (end >= nums.length) {
                start++;
                end = start + 1;
                if (end >= nums.length) {
                    break;
                }
                compare = nums[start];
            } else {
                compare += nums[end];
                end++;
            }
        }

//        for (int i = 0; i < nums.length; i++) {
//            int target = i + 1;
//            int compare = nums[i];
//            if (compare == m) {
//                answer++;
//            }
//            while (target < nums.length) {
//                compare += nums[target];
//                if (compare == m) {
//                    answer++;
//                }
//                target++;
//            }
//        }

        return answer;
    }
}
