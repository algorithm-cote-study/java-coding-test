package com.ktw.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 좌석번호 (시뮬레이션&구현)
 */
public class Main4 {

    private static boolean[][] visited;
    private static final int[] dx = {0, 1, -1, 0};
    private static final int[] dy = {1, 0, 0, -1};

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String solution(BufferedReader reader) throws IOException {
        int c = Integer.parseInt(reader.readLine());
        int r = Integer.parseInt(reader.readLine());
        int k = Integer.parseInt(reader.readLine());
        visited = new boolean[c + 1][r + 1];
        visited[1][1] = true;
        return dfs(c, r, 1, 1, k);
    }

    private static String dfs(int c, int r, int x, int y, int k) {
        int d = 0;
        for (int i = 1; i < k; i++) {
            int cx = x + dx[d];
            int cy = y + dy[d];

            int count = 0;
            while (cx <= 0 || cx >= c + 1 || cy <= 0 || cy >= r + 1 || visited[cx][cy]) {
                if (count == 4) return "0 0";
                d = (d + 1) % 4;
                cx = x + dx[d];
                cy = y + dy[d];
                count++;
            }
            visited[cx][cy] = true;
            x = cx;
            y = cy;
        }

        return x + " " + y;
    }
}
