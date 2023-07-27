package com.ktw.section1;

import static com.ktw.section1.Main3.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ktw.common.TestFileUtil;
import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("잃어버린 강아지 - 시뮬레이션&구현")
class Main3Test {

    @Test
    @DisplayName("잃어버린 강아지 - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section1/main3/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(51, solution);
    }

    @Test
    @DisplayName("잃어버린 강아지 - 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section1/main3/test_case2.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(17, solution);
    }

}