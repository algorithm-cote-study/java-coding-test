package com.ktw.section9;

import static com.ktw.section9.Main1.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ktw.common.TestFileUtil;
import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("등차수열")
class Main1Test {


    @Test
    @DisplayName("등차수열 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section9/main1/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(4, solution);
    }
}