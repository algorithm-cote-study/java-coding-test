package com.ktw.section2;

import static com.ktw.section2.Main4.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ktw.common.TestFileUtil;
import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("음수가 있는 부분수열 - 해싱")
class Main4Test {

    @Test
    @DisplayName("음수가 있는 부분수열 - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section2/main4/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(5, solution);
    }

    @Test
    @DisplayName("음수가 있는 부분수열 - 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section2/main4/test_case2.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(5, solution);
    }

    @Test
    @DisplayName("음수가 있는 부분수열 - 케이스3")
    void test_case_3() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section2/main4/test_case3.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(6, solution);
    }

    @Test
    @DisplayName("음수가 있는 부분수열 - 케이스4")
    void test_case_4() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section2/main4/test_case4.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(2, solution);
    }

    @Test
    @DisplayName("음수가 있는 부분수열 - 케이스5")
    void test_case_5() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section2/main4/test_case5.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(1, solution);
    }
}