package com.ktw.section1.part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 청소
 */
public class Main2 {

    private static final int[] dy = {1, 0, -1, 0};
    private static final int[] dx = {0, 1, 0, -1};

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String solution(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[n][n];
        int[] current = {0, 0};
        for (int i = 0; i < n; i++) {
            int[] singleBoard = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            board[i] = singleBoard;
        }
        int k = Integer.parseInt(br.readLine());
        moveRobot(board, k, current);
        return current[0] + " " + current[1];
    }

    private static void moveRobot(int[][] board, int k, int[] current) {
        int direction = 0;
        for (int i = 0; i < k; i++) {
            int x = current[0];
            int y = current[1];
            // x,y 가 길이보다 작고 장애물이 없으면 전진
            if (x >= 0 && y >= 0 && x < board.length && y < board[0].length && board[x][y] == 0) {
                //                board[x][y] = 1;
                current[0] += dx[direction];
                current[1] += dy[direction];
            } else {
                // 그 외의 경우 방향 전환
                // 범위를 벗어난 경우는 원래대로 복귀해야함
                rollback(board, current, direction);
                direction = (direction + 1) % 4;
                current[0] += dx[direction];
                current[1] += dy[direction];
            }
        }
        // 범위를 벗어난 경우는 원래대로 복귀해야함
        rollback(board, current, direction);
    }

    /**
     * 범위가 벗어난 경우는 rollback
     *
     * @param board
     * @param current
     * @param direction
     */
    private static void rollback(int[][] board, int[] current, int direction) {
        if (current[0] < 0 || current[1] < 0 || current[0] >= board.length || current[1] >= board[0].length
            || board[current[0]][current[1]] != 0) {
            int tx = dx[direction];
            int ty = dy[direction];
            current[0] = tx >= 0 ? current[0] - tx : current[0] + Math.abs(tx);
            current[1] = ty >= 0 ? current[1] - ty : current[1] + Math.abs(ty);
        }
    }

}
