package com.ktw.section1;

import static com.ktw.section1.Main7.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ktw.common.TestFileUtil;
import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("비밀번호 - 시뮬레이션")
class Main7Test {


    @Test
    @DisplayName("시뮬레이션 - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section1/main7/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(8, solution);
    }

    @Test
    @DisplayName("시뮬레이션 - 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section1/main7/test_case2.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(12, solution);
    }


}