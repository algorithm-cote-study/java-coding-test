package com.ktw.section5;

import static com.ktw.section5.Main3.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ktw.common.TestFileUtil;
import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("스프링쿨러")
class Main3Test {


    @Test
    @DisplayName("스프링쿨러 - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section5/main3/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(3, solution);
    }

    @Test
    @DisplayName("스프링쿨러 - 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section5/main3/test_case2.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(1, solution);
    }

    @Test
    @DisplayName("스프링쿨러 - 케이스3")
    void test_case_3() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section5/main3/test_case3.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(-1, solution);
    }

    @Test
    @DisplayName("스프링쿨러 - 케이스4")
    void test_case_4() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section5/main3/test_case4.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(3, solution);
    }


}