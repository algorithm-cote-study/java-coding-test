package com.ktw.section1;

import static com.ktw.section1.Main5.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ktw.common.TestFileUtil;
import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("최대길이 바이토닉 수열 - 시뮬레이션&구현")
class Main5Test {


    @Test
    @DisplayName("최대길이 바이토닉 수열 - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section1/main5/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(5, solution);
    }

    @Test
    @DisplayName("최대길이 바이토닉 수열 - 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section1/main5/test_case2.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(8, solution);
    }

    @Test
    @DisplayName("최대길이 바이토닉 수열 - 케이스3")
    void test_case_3() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section1/main5/test_case3.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(6, solution);
    }

    @Test
    @DisplayName("최대길이 바이토닉 수열 - 케이스4")
    void test_case_4() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section1/main5/test_case4.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(5, solution);
    }
}