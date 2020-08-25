import java.util.HashMap;
import java.util.Scanner;

public class boj_공 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        HashMap map = new HashMap<Integer,Integer>();
        map.put(1,1); //컵, 위치
        map.put(2,2);
        map.put(3,3);
        for (int i = 0; i <M ; i++) {
        int cup1 = sc.nextInt();
        int cup2 = sc.nextInt();
        int swap = (int)map.get(cup1);
        map.put(cup1,map.get(cup2));
        map.put(cup2,swap);
        }
        int ans = -1;
        for (int i = 1; i <=map.size() ; i++) {
            if((int)map.get(i)==1){
                ans= i; break;
            }
        }
        System.out.println(ans);
    }
}
