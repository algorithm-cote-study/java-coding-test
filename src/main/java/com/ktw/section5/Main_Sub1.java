package com.ktw.section5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 그리디 : 결혼식
 *
 * 현수는 다음 달에 결혼을 합니다.
 * 현수는 결혼식 피로연 장소를 빌려 3일간 수지 않고 하려고 합니다.
 * N명의 친구들에게 참석하는 시간 정보를 미리 요구했습니다.
 * 피로연 장소에 존재하는 최대 인원수를 구하시오.
 * 13,15 (13시 정각에는 존재하지만 15시 정각에는 존재하지 않음
 */
public class Main_Sub1 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int n = Integer.parseInt(reader.readLine());
        int[][] participants = new int[n][2];
        Queue<Participant> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            participants[i] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            priorityQueue.offer(new Participant(participants[i][0], "S"));
            priorityQueue.offer(new Participant(participants[i][1], "E"));
        }

        return findMaxParticipants(priorityQueue, n);
    }

    private static int findMaxParticipants(Queue<Participant> participants, int n) {
        int answer = 0;
        int cnt = 0;

        while (!participants.isEmpty()) {
            Participant cur = participants.poll();
            if (cur.divider.equals("S")) {
                cnt++;
                answer = Math.max(answer, cnt);
            } else {
                cnt--;
            }
        }

        return answer;
    }

    private record Participant(int time, String divider) implements Comparable<Participant> {

        @Override
        public int compareTo(Participant o) {
            return this.time - o.time;
        }
    }
}
