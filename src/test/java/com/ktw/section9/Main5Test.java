package com.ktw.section9;

import static com.ktw.section9.Main5.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ktw.common.TestFileUtil;
import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("팰린드롬 만들기 - DP")
class Main5Test {
    
    @Test
    @DisplayName("팰린드롬 만들기 - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section9/main5/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(2, solution);
    }
}