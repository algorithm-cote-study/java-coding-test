package com.ktw.section6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 동전교환 - DFS 부분집합
 */
public class BasicMain5 {

    private static int n, m, answer = Integer.MAX_VALUE;

    private static void dfs(int L, int sum, int[] arr) {
        if (sum > m) return;
        if (L >= answer) return;
        if (sum == m) {
            answer = Math.min(answer, L);
            return;
        }
        for (int i = 0; i < n; i++) {
            dfs(L + 1, sum + arr[i], arr);
        }
    }


    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        n = Integer.parseInt(reader.readLine());
        int[] coins = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(coins);
        m = Integer.parseInt(reader.readLine());
        dfs(0, 0, coins);

        return answer;
    }
}
