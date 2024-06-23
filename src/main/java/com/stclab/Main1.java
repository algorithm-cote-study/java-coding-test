package com.stclab;

public class Main1 {

    public int[][] solution(int[][] image) {
        int[][] answer = new int[image.length * 2][image.length * 2];

        drawImage(image, answer);

        return answer;
    }

    private void drawImage(int[][] image, int[][] answer) {
        int length = answer.length;
        for (int i = 0; i < image.length; i++) {
            int[] drawRow = drawRowImage(image[i]);
            answer[i] = drawRow;
            answer[length - i - 1] = drawRow;
            System.out.println();
        }

    }

    private int[] drawRowImage(int[] image) {
        int length = image.length * 2;
        int[] newRowImage = new int[length];

        for (int i = 0; i < image.length; i++) {
            newRowImage[i] = image[i];
            newRowImage[length - i - 1] = image[i];
        }

        return newRowImage;
    }

    public static void main(String[] args) {
        Main1 main = new Main1();
        // [[207, 207, 207, 84], [207, 207, 84, 255], [207, 84, 84, 207], [84, 255, 207, 0]]
        int[][] image = {{207, 207, 207, 84}, {207, 207, 84, 255}, {207, 84, 84, 207}, {84, 255, 207, 0}};
        main.solution(image);
    }

}
