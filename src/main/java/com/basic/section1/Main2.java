package com.basic.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 대소문자 변환
 *
 * 대문자 -> 소문자
 * 소문자 -> 대문자
 */
public class Main2 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String solution(BufferedReader br) throws IOException {
        String input = br.readLine();
        StringBuilder answer = new StringBuilder();

        for (String data : input.split("")) {
            if (data.equals(data.toLowerCase())) {
                answer.append(data.toUpperCase());
            } else {
                answer.append(data.toLowerCase());
            }
        }

        return answer.toString();
    }
}
