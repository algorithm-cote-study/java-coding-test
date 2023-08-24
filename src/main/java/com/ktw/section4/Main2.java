package com.ktw.section4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 수열 찾기
 * 6' 02"
 */
public class Main2 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String solution(BufferedReader br) throws IOException {
        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            if (map.containsKey(num * 2)) {
                map.put(num * 2, map.get(num * 2) - 1);
            }
        }

        Arrays.sort(nums);

        StringBuilder answer = new StringBuilder();
        for (int num : nums) {
            if (map.containsKey(num) && map.get(num) > 0) {
                answer.append(num).append(" ");
            }
        }

        return answer.deleteCharAt(answer.length() - 1).toString();
    }
}
