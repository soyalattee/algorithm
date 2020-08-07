import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class programmers_소수 {
    private static List list = new ArrayList<String>();
    public static void main(String[] args) {
        String numbers = "110"; // => 3 "011" =>2  만들 수 있는 소수 갯수
        int ans = solution(numbers);
        System.out.println(ans);
    }
    public static int solution(String numbers) {
        int answer = 0;
        char[] numberArray =numbers.toCharArray();
        boolean[] visited = new boolean[numberArray.length];
        int len = numberArray.length;
        for (int i = 1; i <= len ; i++) {
            comb(numberArray,visited,0,len,i);
        }

        for (Object str : list) {
            int number = Integer.parseInt(str.toString());
            if(checkPrimeNumber(number)){
                answer++;
            }
        }

        return answer;
    }

    private static boolean checkPrimeNumber(int number) {
        if(number==1 || number==0) return false;
        int i = 2;
        int max = number/2;
        while(i<max){
            if(number%i ==0) return false;
            else{
                i++;
                max = number/i;
            }
        }

        return true;
    }

    static void comb(char[] arr, boolean[] visited, int start, int len, int r) {
        if(r == 0) {
             save(arr, visited, len);
            return ;
        }
        for(int i=start; i<len; i++) {
            visited[i] = true;
            comb(arr, visited, i + 1,len , r - 1);
            visited[i] = false;
        }
    }

    //조합
    static void perm (char[] arr,boolean[]visited,int len){

    }


    static void save (char[] arr,boolean[] visited,int len){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if(visited[i]){
                sb.append(arr[i]);
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
