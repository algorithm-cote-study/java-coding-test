package com.ktw.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0, 1);
        for (int num : nums) {
            sum += num;
            int target = sum - m;
            if (map.containsKey(target)) {
                answer += map.get(target);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return answer;
    }
}
