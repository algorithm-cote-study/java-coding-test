package com.ktw.section5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 꽃이 피는 최단시간
 */
public class Main4 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int[] plants = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] growTime = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Queue<Flower> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < plants.length; i++) {
            priorityQueue.offer(Flower.from(plants[i], growTime[i]));
        }

        return findMinTime(priorityQueue);
    }

    private static int findMinTime(Queue<Flower> priorityQueue) {
        int answer = 0;
        int max = 0;
        while (!priorityQueue.isEmpty()) {
            Flower current = priorityQueue.poll();
            answer += current.plant;
            max = Integer.max(max, answer + current.growth);
        }

        return max;
    }

    static class Flower implements Comparable<Flower> {

        private final int plant;
        private final int growth;

        Flower(int plant, int growth) {
            this.plant = plant;
            this.growth = growth;
        }

        public static Flower from(int plant, int growth) {
            return new Flower(plant, growth);
        }

        @Override
        public int compareTo(Flower o) {
            return o.growth - this.growth;
        }
    }
}
