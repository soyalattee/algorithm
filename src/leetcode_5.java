public class leetcode_5 {
    public static void main(String[] args) {
        String input = "a"; // maximum length is 1000
        String output = longestPalindrme(input);
        System.out.println(output);
    }

    public static String  longestPalindrme(String s){
        char[] chr = s.toCharArray();

        if(s.length()>=1) {
            for (int len = s.length(); len > 1; len--) {
                for (int start = 0; start + len <= s.length(); start++) {
                    boolean check = true;
                    //is it palindrom ?
                    for (int i = 0; i < len / 2; i++) {
                        if (chr[start + i] != chr[start + len - i - 1]) {
                            check = false;
                            break;
                        }
                    }

                    if (check) return s.substring(start, start + len);
                }
            }
            return s.substring(0,1);
        }else
            return "";

    }
}
