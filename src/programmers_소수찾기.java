import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class programmers_소수찾기 {
    private static HashSet<Integer> set = new HashSet<>();
    public static void main(String[] args) {
        String numbers = "110"; // => 3 "011" =>2  만들 수 있는 소수 갯수
        System.out.println(solution(numbers));
    }
    public static int solution(String numbers) {
        int answer = 0;
        char[] numberArray =numbers.toCharArray();
        boolean[] visited = new boolean[numberArray.length];
        int len = numberArray.length;
        for (int i = 1; i <= len ; i++) {
            perm(numberArray,0,i);
        }

        for (Object number : set) {
            if(checkPrimeNumber((int)number)){
                System.out.println(number);
                answer++;
            }
        }
        return answer;
    }

    private static boolean checkPrimeNumber(int number) {
        if(number==1 || number==0) return false;
        int i = 2;
        int max = number/2;
        while(i<=max){
            if(number%i ==0) return false;
            else{
                i++;
                max = number/i;
            }
        }

        return true;
    }

    static void perm(char[] arr, int depth, int k) {
        if(depth == k) {
             save(arr, k);
            return ;
        }
        for(int i=depth; i<arr.length; i++) {
                swap(arr,i,depth);
                perm(arr,depth + 1, k);
                swap(arr,i,depth);
        }
    }

    public static void swap(char[] arr, int i, int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void save (char[] arr,int len){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
             sb.append(arr[i]);
        }
        //System.out.println(sb.toString());
        //return sb.toString();
        set.add(Integer.parseInt(sb.toString()));
    }

}
