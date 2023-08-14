package com.ktw.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 최대 길이 바이토닉 수열 (시뮬레이션 & 구현)
 */
public class Main5 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int[] nums = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        return findBitonicArray(nums);
    }

    private static int findBitonicArray(int[] nums) {
        int[] bitonicSequenceLengths = new int[nums.length];

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                int count = 2;
                boolean isUp = true;
                boolean isDown = false;
                int before = i + 1;
                int after = i + 2;
                while (after < nums.length && nums[before] < nums[after]) {
                    count++;
                    before = after;
                    after++;
                }
                while (after < nums.length && nums[before] > nums[after]) {
                    isDown = true;
                    count++;
                    before = after;
                    after++;
                }
                if (isUp && isDown) {
                    bitonicSequenceLengths[i] = count;
                }
            }
        }

        return Arrays.stream(bitonicSequenceLengths).max().getAsInt();
    }
}
