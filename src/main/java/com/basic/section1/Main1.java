package com.basic.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 : 문자 찾기
 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요. 대소문자를 구분하지 않습니다.
 * 문자열의 길이는 100을 넘지 않습니다.
 *
 * 입력예제
 * Computercooler
 * c
 * 출력예제
 * 2
 */
public class Main1 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected static int solution(BufferedReader br) throws IOException {
        String inputLine = br.readLine();
        String input = br.readLine();

        int answer = 0;

        for (String compare : inputLine.split("")) {
            if (input.equalsIgnoreCase(compare)) {
                answer++;
            }
        }

        return answer;
    }
}
