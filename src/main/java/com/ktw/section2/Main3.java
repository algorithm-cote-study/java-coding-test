package com.ktw.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 서로 다른 빈도수 만들기 (해싱, 시간파싱)
 */
public class Main3 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        String[] input = reader.readLine().split("");
        Map<String, Integer> map = new HashMap<>();

        Set<Integer> lines = new HashSet<>();
        for (String s : input) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int answer = 0;
        for (Entry<String, Integer> object : map.entrySet()) {
            int amount = map.get(object.getKey());
            if (!lines.contains(amount)) {
                lines.add(amount);
            } else {
                int count = 0;
                while (lines.contains(amount)) {
                    amount--;
                    count++;
                }
                answer += count;
                if (amount != 0) {
                    lines.add(amount);
                }
            }
        }

        return answer;
    }
}
