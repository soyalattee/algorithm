import java.util.Queue;
import java.util.Stack;

public class programmers_크레인인형뽑기 {
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}; //5~30
        int[] moves = {1,5,3,5,1,2,1,4}; //0~100
        System.out.println(solution(board,moves));
    }
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();
        int [] lastIdx = new int[board.length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j <board.length ; j++) {
                System.out.print(board[j][i]);
                if(board[j][i]!=0){
                    lastIdx[i]=j;
                    break;
                }
            }
            System.out.println();
        }

        for (int i = 0; i < moves.length; i++) {

        }
        return answer;
    }

}
