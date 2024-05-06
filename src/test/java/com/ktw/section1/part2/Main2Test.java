package com.ktw.section1.part2;

import com.ktw.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static com.ktw.section1.part2.Main2.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("청소")
class Main2Test {

    @Test
    @DisplayName("청소 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section1/main2/test_case1.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("2 2", solution);
    }

    @Test
    @DisplayName("청소 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section1/main2/test_case2.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("4 5", solution);
    }

    @Test
    @DisplayName("청소 케이스3")
    void test_case_3() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section1/main2/test_case3.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("0 1", solution);
    }

}