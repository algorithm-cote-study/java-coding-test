package com.ktw.section1;

import static com.ktw.section1.Main4.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ktw.common.TestFileUtil;
import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("좌석번호 - 시뮬레이션&구현")
class Main4Test {


    @Test
    @DisplayName("좌선번호 - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section1/main4/test_case1.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("6 3", solution);
    }

    @Test
    @DisplayName("좌선번호 - 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section1/main4/test_case2.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("2 3", solution);
    }

    @Test
    @DisplayName("좌선번호 - 케이스3")
    void test_case_3() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section1/main4/test_case3.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("4 3", solution);
    }

    @Test
    @DisplayName("좌선번호 - 케이스4")
    void test_case_4() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section1/main4/test_case4.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("0 0", solution);
    }
}