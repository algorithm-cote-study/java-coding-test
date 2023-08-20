package com.ktw.section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 겹쳐진 압축 해제
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
        String[] input = br.readLine().split("");

        Deque<String> stack = new ArrayDeque<>();

        for (String s : input) {
            if (!")".equals(s)) {
                stack.push(s);
            } else {

                StringBuilder sb = new StringBuilder();
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    sb.append(stack.pop());
                }
                stack.pop();
                StringBuilder count = new StringBuilder();
                try {
                    while (!stack.isEmpty()) {
                        Integer.parseInt(stack.peek());
                        count.append(stack.pop());
                    }
                } catch (NumberFormatException ignored) {
                }

                if (count.length() == 0) {
                    stack.push(sb.reverse().toString());
                } else {
                    stack.push(sb.reverse().toString().repeat(Integer.parseInt(count.reverse().toString())));
                }
            }
        }

        String[] answer = new String[stack.size()];
        int i = stack.size() - 1;
        while (!stack.isEmpty()) {
            answer[i] = stack.pop();
            i--;
        }

        StringBuilder sb = new StringBuilder();
        for (String a : answer) {
            sb.append(a);
        }

        return sb.toString();
    }
}
