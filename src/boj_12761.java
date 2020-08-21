import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class boj_12761 {
    static int A ;
    static int B;
    static int ans;
    static boolean visit[] = new boolean[100001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = -1;
        A =sc.nextInt();
        B =sc.nextInt();
        int N =sc.nextInt();
        int M =sc.nextInt();
        BFS(N,M);
        //ystem.out.println(ans);
    }

    public static void BFS( int N, int M){
        Queue q= new LinkedList<Stone>();
        // +A, +B, *A , *B, -A, -B +1, -1
        q.add(new Stone(0,N));
        while(!q.isEmpty()){
            Stone resentStone = (Stone) q.poll();
            int rNum = resentStone.num;
            int rCnt = resentStone.cnt;
            visit[rNum]=true;
            if(rNum==M){
                System.out.println(rCnt);
                return;
            }

            if(rNum+A<=100000&&!visit[rNum+A]) {
                visit[rNum + A] = true;
                q.add(new Stone(rCnt + 1, rNum + A));
            }
            if(rNum+B<=100000 && !visit[rNum+B]) {
                visit[rNum + B] = true;
                q.add(new Stone(rCnt + 1, rNum + B));
            }
            if(rNum+1<=M && !visit[rNum+1]) {
                visit[rNum+1]= true;
                q.add(new Stone(rCnt + 1, rNum + 1));
            }
            if(rNum-1>=M&& !visit[rNum-1]) {
                visit[rNum-1]= true;
                q.add(new Stone(rCnt + 1, rNum - 1));
            }
            if(rNum-A>=0&&!visit[rNum-A]) {
                visit[rNum-A] = true;
                q.add(new Stone(rCnt + 1, rNum - A));
            }
            if(rNum-B>=0&&!visit[rNum-B]) {
                visit[rNum - B] = true;
                q.add(new Stone(rCnt + 1, rNum - B));
            } if(rNum*A<=100000 && !visit[rNum*A]) {
                visit[rNum*A] = true;
                q.add(new Stone(rCnt + 1, rNum * A));
            }
            if(rNum*B<=100000 && !visit[rNum*B]) {
                visit[rNum * B] = true;
                q.add(new Stone(rCnt + 1, rNum * B));
            }
        }

        return;
    }

    static class Stone {
        int cnt;
        int num;

        public Stone(int cnt,int num){
            this.cnt = cnt;
            this.num = num;
        }
    }
}
