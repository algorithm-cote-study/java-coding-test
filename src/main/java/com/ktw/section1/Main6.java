package com.ktw.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 과일 가져가기
 */
public class Main6 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[][] fruitsOnDesk = new int[n][3];
        int[] minFruits = new int[n];
        for (int i = 0; i < n; i++) {
            int[] fruitOnDesk = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            fruitsOnDesk[i] = fruitOnDesk;
        }

        for (int i = 0; i < n - 1; i++) {
            int target = i;
            int compare = i + 1;
            if (minFruits[i] == 1) {
                continue;
            }
            while (compare < n) {
                if (minFruits[compare] != 1 && validIsUnique(fruitsOnDesk[compare])) {
                    int targetIndex = getMinIndex(fruitsOnDesk[target]);
                    int compareIndex = getMinIndex(fruitsOnDesk[compare]);
                    if (targetIndex != compareIndex && fruitsOnDesk[target][compareIndex] > 0 && fruitsOnDesk[compareIndex][targetIndex] > 0) {
                        if (fruitsOnDesk[target][targetIndex] + 1 <= fruitsOnDesk[target][compareIndex] - 1
                            && fruitsOnDesk[compare][compareIndex] + 1 <= fruitsOnDesk[compare][targetIndex] - 1) {
                            fruitsOnDesk[target][targetIndex]++;
                            fruitsOnDesk[target][compareIndex]--;
                            fruitsOnDesk[compare][compareIndex]++;
                            fruitsOnDesk[compare][targetIndex]--;
                            break;
                        }
                    }
                }

                compare++;
            }
        }

        int answer = 0;
        for (int[] fruits : fruitsOnDesk) {
            answer += getMin(fruits);
        }

        return answer;
    }

    public static int getMin(int[] fruits) {
        int min = Integer.MAX_VALUE;
        for (int fruit : fruits) {
            min = Math.min(min, fruit);
        }
        return min;
    }

    public static boolean validIsUnique(int[] fruits) {
        int cnt = 0;
        int min = getMin(fruits);
        for (int fruit : fruits) {
            if (min == fruit) {
                cnt++;
            }
        }
        return cnt == 1;
    }

    public static int getMinIndex(int[] fruits) {
        int min = getMin(fruits);
        for (int i = 0; i < 3; i++) {
            if (fruits[i] == min) return i;
        }
        return 0;
    }

}
