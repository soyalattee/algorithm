import java.util.Scanner;

public class boj_1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 100~~ 2,000,000,000
        int F = sc.nextInt(); // ~~100
        N = (N/100)*100;
        int ans =0;
        while(true){
            if((N+ans)%F==0) break;
            ans++;
        }
        if(ans<10){
            System.out.println("0"+ans);
        }else{
            System.out.println(ans);
        }

    }
}
