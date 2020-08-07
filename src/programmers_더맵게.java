import java.util.PriorityQueue;

public class programmers_더맵게 {
    public static void main(String[] args) {
        int[] scoville = {1,2,3,9,10,12};
        int K = 7;
        System.out.println(solution(scoville,K));
    }

    public static int solution(int[] scoville, int K) {
        PriorityQueue pq = new PriorityQueue<Integer>();
        int answer = 0;

        for (int i: scoville) {
            pq.add(i);
        }

        while(pq.size()>1){ //두개는 있어야 할 수 있다
            if((int)pq.peek() >= K) return answer;
            int lowestScv = (int) pq.poll();
            int secondlowScv = (int) pq.poll();
            int newScv = lowestScv+(secondlowScv*2);
            answer++;
            pq.add(newScv);
        }

        if((int)pq.peek() < K) return -1;
        else return answer;
    }
}
