package com.ktw.section1;

import static com.ktw.section1.Main6.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ktw.common.TestFileUtil;
import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("과일 가져가기 - 시뮬레이션&구현")
class Main6Test {


    @Test
    @DisplayName("과일 가져가기 - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section1/main6/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(58, solution);
    }

    @Test
    @DisplayName("과일 가져가기 - 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section1/main6/test_case2.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(24, solution);
    }
}