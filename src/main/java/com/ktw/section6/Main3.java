package com.ktw.section6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 바둑대회 (DFS)
 */
public class Main3 {

    private static int answer;
    private static boolean[] visited;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());
        answer = Integer.MAX_VALUE;
        int[][] board = new int[n][2];
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            int[] stones = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            board[i] = stones;
        }

        dfs(board, 0, 0, n);

        return answer;
    }

    private static void dfs(int[][] board, int L, int s, int n) {
        if (L == n / 2) {
            int a = 0;
            int b = 0;
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    a += board[i][0];
                } else {
                    b += board[i][1];
                }
            }
            answer = Math.min(answer, Math.abs(a - b));
            return;
        }

        for (int i = s; i < n; i++) {
            visited[i] = true;
            dfs(board, L + 1, i + 1, n);
            visited[i] = false;
        }
    }


}
