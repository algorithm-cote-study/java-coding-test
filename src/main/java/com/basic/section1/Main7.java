package com.basic.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 회문 문자열
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
 * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES" 회문 문자열이 아니면 "NO"
 * 회문 검사시 대소문자를 구분하지 않습니다.
 */
public class Main7 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected static String solution(BufferedReader br) throws IOException {
        String input = br.readLine();
        String answer = "YES";

        return answer;
    }
}
