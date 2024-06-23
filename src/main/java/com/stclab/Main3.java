package com.stclab;

import java.util.PriorityQueue;
import java.util.Queue;

class Solution {

    public int solution(int[][] customer) {
        int answer = 0;

        Queue<Customer> priorityQueue = new PriorityQueue<>();
        for (int[] singleCustomer : customer) {
            priorityQueue.offer(Customer.create(singleCustomer[0], singleCustomer[1]));
        }

        Customer current = priorityQueue.poll();
        if (current == null) {
            return 0;
        }
        int endTime = current.y;
        int startTime = current.x;
        while (!priorityQueue.isEmpty()) {
            Customer target = priorityQueue.poll();
            //
            if (target.x > endTime) {
                answer += (endTime - startTime);
                startTime = target.x;
                endTime = target.y;
            } else if (target.y > endTime) {
                endTime = target.y;
            }
        }
        answer += (endTime - startTime);
        return answer;
    }

    static class Customer implements Comparable<Customer> {

        private int x;
        private int y;

        public Customer(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public static Customer create(int x, int y) {
            return new Customer(x, y);
        }

        @Override
        public int compareTo(Customer o) {
            return this.x - o.x;
        }

    }

}