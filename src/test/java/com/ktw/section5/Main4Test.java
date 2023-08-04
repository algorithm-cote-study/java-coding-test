package com.ktw.section5;

import static com.ktw.section5.Main4.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ktw.common.TestFileUtil;
import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("꽃이피는 최단시간")
class Main4Test {

    @Test
    @DisplayName("꽃이피는 최단시간 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section5/main4/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(8, solution);
    }

    @Test
    @DisplayName("꽃이피는 최단시간 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section5/main4/test_case2.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(11, solution);
    }

    @Test
    @DisplayName("꽃이피는 최단시간 케이스3")
    void test_case_3() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section5/main4/test_case3.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(8, solution);
    }

    @Test
    @DisplayName("꽃이피는 최단시간 케이스4")
    void test_case_4() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section5/main4/test_case4.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(54, solution);
    }

    @Test
    @DisplayName("꽃이피는 최단시간 케이스5")
    void test_case_5() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section5/main4/test_case5.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(29, solution);
    }
}