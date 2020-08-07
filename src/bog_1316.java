import java.util.Scanner;

public class bog_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        String [] arr = new String[n];
        for (int i = 0; i <n ; i++) {
            arr[i]= sc.next();
        }
//        System.out.println((int)arr[0].charAt(0)); // a = 97,z = 122
        for (String word : arr) {
            if(checkGroupWord(word)) ans++;
        }
        System.out.println(ans);
    }

    private static boolean checkGroupWord(String word) {
        int Ascii[] = new int[26]; // -97
        int beforeNum = -1;
        // a~z 까지 해당 알파벳이나오면 아스키 배열 ++ 해준다
        // 아스키 배열값 == 0이면 -> 아스키 배++ , 그 아스키 숫자 기억
        // 아스키 배열값 >0 이면 -> 기억값과 같은지 쳌 . 아니면 false 리턴
        for (int i = 0; i < word.length(); i++) {
            int recentNum = (int)word.charAt(i)-97;
            if(Ascii[recentNum]>0){
                if(beforeNum==recentNum){
                    Ascii[recentNum]++;
                }else{
                    return false;
                }
            }else{
                Ascii[recentNum]++;
                beforeNum = recentNum;
            }
        }
        return true;
    }
}
