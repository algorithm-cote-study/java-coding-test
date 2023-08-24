package com.ktw.section4;

import static com.ktw.section4.Main2.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ktw.common.TestFileUtil;
import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("수열찾기 - 정렬")
class Main2Test {


    @Test
    @DisplayName("수열 찾기 - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section4/main2/test_case1.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("1 3 5", solution);
    }

    @Test
    @DisplayName("수열 찾기 - 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section4/main2/test_case2.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("1 1 3 7", solution);
    }


    @Test
    @DisplayName("수열 찾기 - 케이스3")
    void test_case_3() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section4/main2/test_case3.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("2 3 5 5 7 7", solution);
    }
}