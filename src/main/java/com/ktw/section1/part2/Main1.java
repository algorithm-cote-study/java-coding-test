package com.ktw.section1.part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

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

    public static String solution(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] people = IntStream.rangeClosed(0, n).toArray();
        String ladders = "";
        while ((ladders = br.readLine()) != null) {
            int[] ladder = Arrays.stream(ladders.split(" ")).mapToInt(Integer::parseInt).toArray();
            change(ladder, people);
        }
        // [0,4,2,1,3,5]
        return changePeople(people);
    }

    /**
     * 배열에 있는 숫자를 알파벳으로 변환함
     *
     * @param people
     * @return
     */
    private static String changePeople(int[] people) {
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i < people.length; i++) {
            answer.append(Character.toChars(people[i] + 64)).append(" ");
        }
        answer.deleteCharAt(answer.length() - 1);
        return answer.toString();
    }

    /**
     * 위치 변경
     *
     * @param ladder
     * @param people
     */
    private static void change(int[] ladder, int[] people) {
        for (int singleLadder : ladder) {
            int tmp = people[singleLadder + 1];
            people[singleLadder + 1] = people[singleLadder];
            people[singleLadder] = tmp;
        }
    }

}
