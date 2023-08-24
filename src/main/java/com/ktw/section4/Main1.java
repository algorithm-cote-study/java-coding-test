package com.ktw.section4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 이진수 정렬
 */
public class Main1 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String solution(BufferedReader br) throws IOException {
        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<BinaryInteger> binaryIntegerList = new ArrayList<>();

        for (int num : nums) {
            binaryIntegerList.add(BinaryInteger.of(num, Integer.toBinaryString(num)));
        }

        Collections.sort(binaryIntegerList);
        StringBuilder result = new StringBuilder();
        for (BinaryInteger binaryInteger : binaryIntegerList) {
            result.append(binaryInteger.getOriginal()).append(" ");
        }

        return result.deleteCharAt(result.length() - 1).toString();
    }

    private static class BinaryInteger implements Comparable<BinaryInteger> {

        private final int original;
        private final int binaryCount;

        public int getOriginal() {
            return original;
        }


        private BinaryInteger(int original, String integerToBinary) {
            this.original = original;
            this.binaryCount = integerToBinary.replace("0", "").length();
        }

        public static BinaryInteger of(int original, String integerToBinary) {
            return new BinaryInteger(original, integerToBinary);
        }

        @Override
        public int compareTo(BinaryInteger o) {
            if (o.binaryCount == this.binaryCount) return this.original - o.original;
            return this.binaryCount - o.binaryCount;
        }
    }
}
