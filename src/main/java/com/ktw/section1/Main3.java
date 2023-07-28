package com.ktw.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 잃어버린 강아지 (시뮬레이션 & 구현)
 */
public class Main3 {

    private static final int[] dx = {-1, 0, 1, 0};
    private static final int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int[][] board = new int[10][10];
        for (int i = 0; i < 10; i++) {
            board[i] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int[] location = new int[2];
        int[] dogLocation = new int[2];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (board[i][j] == 3) {
                    dogLocation[0] = i;
                    dogLocation[1] = j;
                } else if (board[i][j] == 2) {
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return dfs(board, location, dogLocation, 0);
    }

    private static int dfs(int[][] board, int[] location, int[] dogLocation, int count) {
        int dr = 0;
        int dogDr = 0;
        int n = board.length;

        while (count < 10000) {
            count++;
            int lx = location[0] + dx[dr];
            int ly = location[1] + dy[dr];

            int dogX = dogLocation[0] + dx[dogDr];
            int dogY = dogLocation[1] + dy[dogDr];

            if (lx < 0 || lx >= n || ly < 0 || ly >= n || board[lx][ly] == 1) {
                dr = (dr + 1) % 4;
            } else {
                location = new int[]{lx, ly};
            }

            if (dogX < 0 || dogX >= n || dogY < 0 || dogY >= n || board[dogX][dogY] == 1) {
                dogDr = (dogDr + 1) % 4;
            } else {
                dogLocation = new int[]{dogX, dogY};
            }

            if (location[0] == dogLocation[0] && location[1] == dogLocation[1]) {
                return count;
            }

        }

        return 0;
    }
}
