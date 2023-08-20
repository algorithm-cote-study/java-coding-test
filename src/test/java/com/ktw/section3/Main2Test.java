package com.ktw.section3;

import static com.ktw.section3.Main2.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ktw.common.TestFileUtil;
import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("겹쳐진 압축 해제 - 자료구조")
class Main2Test {


    @Test
    @DisplayName("겹쳐진 압축 해제 - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section3/main2/test_case1.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("abbabbabbef", solution);
    }

    @Test
    @DisplayName("겹쳐진 압축 해제 - 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section3/main2/test_case2.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("ababkbcbcbc", solution);
    }

    @Test
    @DisplayName("겹쳐진 압축 해제 - 케이스3")
    void test_case_3() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section3/main2/test_case3.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("abcdcdcdabcdcdcd", solution);
    }

    @Test
    @DisplayName("겹쳐진 압축 해제 - 케이스4")
    void test_case_4() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section3/main2/test_case4.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("ababacacacacacacababacacacacacac", solution);
    }

    @Test
    @DisplayName("겹쳐진 압축 해제 - 케이스5")
    void test_case_5() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section3/main2/test_case5.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("absgsgabsgsgabsgsg", solution);
    }


}