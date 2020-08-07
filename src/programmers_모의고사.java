import java.util.ArrayList;
import java.util.List;

public class programmers_모의고사 {
    static List combs = new ArrayList();
    static boolean[] visited ;
    static int[] digits;
    public static void main(String[] args) {
       String answers="";
        int ans = solution(answers);
        System.out.println(ans);
    }
    public static int solution(String numbers) { // 1~7
        int answer = 0;
        visited = new boolean[numbers.length()];
        digits = new int[numbers.length()];

        for (int i = 0; i <numbers.length() ; i++) {
            digits[i]=numbers.charAt(i)-'0';
        }

        comb(0,0);
        //1 숫자 조합을 만든다.
        //2 소수인지 체크


        return answer;
    }
    public static void comb (int now, int before){

    }

}
