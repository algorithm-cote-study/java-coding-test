package com.ktw.section5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

/**
 * PCCP 모의고사1회 - 운영체제
 */
public class Main121686 {

    static long[] solution(int[][] program) {
        long[] waitTimes = new long[11];

        Queue<Program> programs = Arrays.stream(program).map(p -> new Program(p[0], p[1], p[2])).sorted(Comparator.comparingInt(p -> p.calledAt))
            .collect(Collectors.toCollection(LinkedList::new));

        PriorityQueue<Program> pq = new PriorityQueue<>((a, b) -> {
            if (a.priority != b.priority) {
                return a.priority - b.priority;
            }
            return a.calledAt - b.calledAt;
        });

        int time = 0;
        while (!programs.isEmpty() || !pq.isEmpty()) {
            while (!programs.isEmpty() && time >= programs.peek().calledAt) {
                pq.add(programs.poll());
            }

            if (pq.isEmpty()) {
                time = programs.peek().calledAt;
                continue;
            }

            Program p = pq.poll();
            waitTimes[p.priority] += time - p.calledAt;
            time += p.executionTime;
        }
        waitTimes[0] = time;

        return waitTimes;
    }

    private static class Program {

        private final int priority;
        private final int calledAt;
        private final int executionTime;

        Program(int priority, int calledAt, int executionTime) {
            this.priority = priority;
            this.calledAt = calledAt;
            this.executionTime = executionTime;
        }

    }
}
