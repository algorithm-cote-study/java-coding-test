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
        String s = br.readLine();
        Deque<String> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == ')') {
                StringBuilder tmp = new StringBuilder();
                while (!stack.isEmpty()) {
                    String current = stack.pop();
                    if (current.equals("(")) {
                        String num = "";
                        while (!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))) {
                            num = stack.pop() + num;
                        }
                        StringBuilder res = new StringBuilder();
                        int cnt = 0;
                        if (num.equals("")) cnt = 1;
                        else cnt = Integer.parseInt(num);
                        for (int i = 0; i < cnt; i++) {
                            res.append(tmp);
                        }
                        stack.push(res.toString());
                        break;
                    }
                    tmp.insert(0, current);
                }
            } else {
                stack.push(String.valueOf(c));
            }
        }

        StringBuilder answer = new StringBuilder();
        while (!stack.isEmpty()) {
            answer.insert(0, stack.pop());
        }

        return answer.toString();
    }
}
