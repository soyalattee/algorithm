import java.util.Arrays;
import java.util.Stack;

public class programmers_크레인인형뽑기 {
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int [] moves = {1,5,3,5,1,2,1,4};
        System.out.println(solution(board,moves));
    }
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack basket = new Stack<Integer>();
        int depth = board.length;
        int height[] = new int [depth]; //인형이 없는 칸은 depth 다
        Arrays.fill(height,depth);
        for (int i = 0; i <depth ; i++) {
            for (int j = 0; j < depth; j++) {
                if(board[j][i]!=0){
                    height[i]=j; //인형이 있으면 그 칸의 위치를 저장한다.
                    break;
                }
            }
        }
        for (int i: height
             ) {
            System.out.print(i+"f");
        }
        System.out.println();
        for (int i = 0; i < moves.length ; i++) {
            int crain = moves[i]-1; //board는 0부터 시작이니까
            if(height[crain]== depth) continue; //인형이 없다
            int doll = board[height[crain]][crain];
            System.out.println(doll+" 뽑았다");
            answer = putDoll(basket,doll,answer);
            height[crain]++;
        }

        return answer;
    }
    public static int putDoll(Stack basket,int doll,int ans){ // 바스켓에 인형을 넣는다. 인형이 일치하는게 있으면 인형을 터트려 없앤다.
        if(basket.empty()){
            basket.add(doll);
        }else if((int)basket.peek() == doll){
            basket.pop();
            ans+=2;
        }else{
            basket.add(doll);
        }


        return ans;
    }
}
