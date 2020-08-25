import java.util.ArrayList;
import java.util.List;

public class programmers_모의고사 {
    static List combs = new ArrayList();
    static boolean[] visited ;
    static int[] digits;
    public static void main(String[] args) {
        int[] answers={};
        int[] ans = solution(answers);
        System.out.println(ans);
    }
    public static int[] solution(int[] answers) {
        int[] answer = {};
        int[] one = {1,2,3,4,5} ;// 5
        int[] two ={2,1,2,3,2,4,2,5}; //8
        int[] three ={3,3,1,1,2,2,4,4,5,5} ;//10
        int[] cnt = {0,0,0};
        int idx = 0;
        while(idx < answers.length){
            if(one[idx%5] == answers[idx])
                cnt[0]++;
            if(two[idx%8] == answers[idx])
                cnt[1]++;
            if(three[idx%10] == answers[idx])
                cnt[2]++;
            idx++;
        }
        int winner = cnt[0]; //제일 많이 맞은 값
        for(int i =0; i<cnt.length;i++){
            if(winner < cnt[i]){
                winner = cnt[i];
            }
        }

        List<Integer> wins = new ArrayList<Integer>();
        for(int i =0; i<cnt.length;i++){
            if(winner == cnt[i]){
                wins.add(i);
            }
        }
        answer = new int[wins.size()];
        for(int i=0; i<wins.size();i++){
            answer[i]=wins.get(i)+1;
        }
        return answer;
    }
}
