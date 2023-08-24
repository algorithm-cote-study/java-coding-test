package com.ktw.section4;

import static com.ktw.section4.Main1.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ktw.common.TestFileUtil;
import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("이진수 정렬 - 정렬")
class Main1Test {


    @Test
    @DisplayName("이진수 정렬 - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section4/main1/test_case1.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("8 5 6 9 7", solution);
    }

    @Test
    @DisplayName("이진수 정렬 - 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section4/main1/test_case2.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("1 2 4 3 5", solution);
    }


    @Test
    @DisplayName("이진수 정렬 - 케이스3")
    void test_case_3() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section4/main1/test_case3.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("5 12 17 7 21 23 45", solution);
    }
}