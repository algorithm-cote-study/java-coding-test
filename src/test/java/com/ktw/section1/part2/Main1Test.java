package com.ktw.section1.part2;

import com.ktw.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static com.ktw.section1.part2.Main1.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("사다리타기")
class Main1Test {

    @Test
    @DisplayName("사다리타기 - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section1/main1/test_case1.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("D B A C E", solution);
    }

    @Test
    @DisplayName("사다리타기 - 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section1/main1/test_case2.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("A C B F D G E", solution);
    }

    @Test
    @DisplayName("사다리타기 - 케이스3")
    void test_case_3() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section1/main1/test_case3.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("C A B F D E H G", solution);
    }

    @Test
    @DisplayName("사다리타기 - 케이스4")
    void test_case_4() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section1/main1/test_case4.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("C A F B D I E K G L J H", solution);
    }

}