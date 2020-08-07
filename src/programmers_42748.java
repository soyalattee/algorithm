import java.util.Arrays;
import java.util.List;

class programmers_42748 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] ans = solution(array,commands);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }
    public static int[] solution(int[] array, int[][] commands) {
        int ansLen = commands.length;
        int[] answer = new int[ansLen];
        for (int i=0;i<ansLen;i++){
            int[] array_copy = array.clone();
            int fromIdx = commands[i][0]-1;
            int toIdx = commands[i][1];
            int count = commands[i][2]-1+fromIdx;
            Arrays.sort(array_copy,fromIdx,toIdx );

            answer[i]=array_copy[count];
        }
        return answer;
    }

}
