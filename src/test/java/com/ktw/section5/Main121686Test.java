package com.ktw.section5;

import static com.ktw.section5.Main121686.solution;

import java.io.IOException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("PCCP 모의고사 1회 - 운영체제")
class Main121686Test {

    @Test
    void test_case_1() throws IOException {
        //given
        int[][] program = {{2, 0, 10}, {1, 5, 5}, {3, 5, 3}, {3, 12, 2}};
        //then
        long[] result = solution(program);

        Assertions.assertArrayEquals(new long[]{20, 5, 0, 16, 0, 0, 0, 0, 0, 0, 0}, result);
    }
}