package com.stclab;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

class Main2 {

    private Deque<Product> stack;
    private Deque<Product> queue;

    public int[] solution(String[] records) {
        int[] answer = new int[2];
        stack = new ArrayDeque<>();
        queue = new LinkedList<>();

        int fifo = 0;
        int lifo = 0;

        for (String singleRecord : records) {
            String[] splitedRecord = singleRecord.split(" ");
            if (splitedRecord[0].equals("P")) {
                stack.push(Product.create(splitedRecord[1], splitedRecord[2]));
                queue.offer(Product.create(splitedRecord[1], splitedRecord[2]));
            } else {
                int amount = Integer.parseInt(splitedRecord[2]);

                for (int i = 0; i < amount; i++) {
                    fifo += calculateFifo();
                    lifo += calculateLifo();
                }
            }
        }
        answer[0] = fifo;
        answer[1] = lifo;
        return answer;
    }

    private int calculateFifo() {
        if (!queue.isEmpty()) {
            Product currentProduct = queue.poll();
            if (currentProduct.amount - 1 != 0) {
                queue.addFirst(Product.create(currentProduct.price, currentProduct.amount - 1));
            }
            return currentProduct.price;
        }
        return 0;
    }

    private int calculateLifo() {
        if (!stack.isEmpty()) {
            Product currentProduct = stack.pop();
            if (currentProduct.amount - 1 != 0) {
                stack.push(Product.create(currentProduct.price, currentProduct.amount - 1));
            }
            return currentProduct.price;
        }
        return 0;
    }

    static class Product {

        private int price;
        private int amount;

        public Product(int price, int amount) {
            this.price = price;
            this.amount = amount;
        }

        public static Product create(int price, int amount) {
            return new Product(price, amount);
        }

        public static Product create(String price, String amount) {
            return new Product(Integer.parseInt(price), Integer.parseInt(amount));
        }

    }

}