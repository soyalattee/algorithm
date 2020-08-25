import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

//양심없게 쉬운문제..ㅎ
public class boj_12605 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack<String>();
        int N = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <=N ; i++) {
            String[] str = sc.nextLine().split(" ");
            stack.addAll(Arrays.asList(str));
            System.out.print("Case #"+i+": ");
            while(!stack.isEmpty()) {
                System.out.print(stack.pop()+" ");
            }
            System.out.println();
        }


    }
}
