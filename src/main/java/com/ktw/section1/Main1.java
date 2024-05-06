package com.ktw.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 사다리타기
 */
public class Main1 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String solution(BufferedReader reader) throws IOException {
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(reader.readLine());

        String[] students = new String[n + 1];
        for (int i = 1; i < n + 1; i++) {
            char temp = (char)(i + 64);
            students[i] = String.valueOf(temp);
        }
        String input;
        while ((input = reader.readLine()) != null) {
            int[] ladderStart = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int start : ladderStart) {
                String temp = students[start + 1];
                students[start + 1] = students[start];
                students[start] = temp;
            }
        }
        for (int i = 1; i < n; i++) {
            sb.append(students[i]).append(" ");
        }
        sb.append(students[n]);
        return sb.toString();
    }

}
