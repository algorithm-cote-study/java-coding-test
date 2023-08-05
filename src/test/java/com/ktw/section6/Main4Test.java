package com.ktw.section6;

import static com.ktw.section6.Main4.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ktw.common.TestFileUtil;
import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("팰린드롬의 경우수 - DFS")
class Main4Test {


    @Test
    @DisplayName("팰린드롬의 경우수 - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section6/main4/test_case1.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("baaaab aabbaa abaaba", solution);
    }
}