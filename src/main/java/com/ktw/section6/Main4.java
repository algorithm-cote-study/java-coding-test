package com.ktw.section6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 팰린드롬의 경우수
 */
public class Main4 {

    private static boolean[] visited;
    private static int[] dp;

    private static StringBuilder answer;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String solution(BufferedReader reader) throws IOException {
        String[] s = reader.readLine().split("");
        visited = new boolean[s.length];
        dp = new int[s.length];
        answer = new StringBuilder();
        dfs(s, 0);

        return "";
    }

    private static void dfs(String[] s, int L) {
        if (L == s.length) {
            StringBuilder sb = new StringBuilder();
            for (int d : dp) {
                sb.append(s[d]);
            }
            System.out.println(sb);
            return;
        }
        for (int i = 0; i < s.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dp[L] = i;
                dfs(s, L + 1);
                visited[i] = false;
            }
        }
    }
}
