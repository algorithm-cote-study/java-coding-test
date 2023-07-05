package com.ktw.section2;

import static com.ktw.section2.Main2.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ktw.common.TestFileUtil;
import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("같은 빈도수 만들기")
class Main2Test {


    @Test
    @DisplayName("같은 빈도수 만들기 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section2/main2/test_case1.txt");
        // when
        String answer = solution(reader);
        // then
        assertEquals("0 2 2 3 3", answer);
    }

    @Test
    @DisplayName("같은 빈도수 만들기 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section2/main2/test_case2.txt");
        // when
        String answer = solution(reader);
        // then
        assertEquals("0 0 2 2 2", answer);
    }

    @Test
    @DisplayName("같은 빈도수 만들기 케이스3")
    void test_case_3() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section2/main2/test_case3.txt");
        // when
        String answer = solution(reader);
        // then
        assertEquals("0 0 0 0 0", answer);
    }

    @Test
    @DisplayName("같은 빈도수 만들기 케이스4")
    void test_case_4() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section2/main2/test_case4.txt");
        // when
        String answer = solution(reader);
        // then
        assertEquals("0 0 0 1 1", answer);
    }

    @Test
    @DisplayName("같은 빈도수 만들기 케이스5")
    void test_case_5() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section2/main2/test_case5.txt");
        // when
        String answer = solution(reader);
        // then
        assertEquals("1 0 0 0 0", answer);
    }
}