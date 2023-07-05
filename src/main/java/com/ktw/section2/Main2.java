package com.ktw.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 같은 빈도수 만들기
 */
public class Main2 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String solution(BufferedReader reader) throws IOException {
        String[] alphabets = reader.readLine().split("");
        int max = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 0);
        map.put("b", 0);
        map.put("c", 0);
        map.put("d", 0);
        map.put("e", 0);

        for (int i = 0; i < alphabets.length; i++) {
            int value = map.getOrDefault(alphabets[i], 0) + 1;
            map.put(alphabets[i], value);
            max = Math.max(max, value);
        }

        StringBuilder answer = new StringBuilder();

        for (Integer value : map.values()) {
            answer.append(max - value).append(" ");
        }

        return answer.toString().trim();
    }
}
