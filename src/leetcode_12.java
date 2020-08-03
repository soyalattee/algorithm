public class leetcode_12 {
    public static void main(String[] args) {
        int input = 3984;
        String ans = inToRoman(input);
        System.out.println(ans);
    }
    public static String inToRoman(int num){
        StringBuilder result = new StringBuilder();
        String roman [] = {"I","IV","V","IX" ,"X","XL" ,"L","XC" ,"C","CD" ,"D","CM","M"};
        int romanNum [] = {1,4,5,9,10,40,50,90,100,400,500,900,1000}; // 0~12
        int lastIdx = roman.length-1;
        for (int i = romanNum.length-1; i >= 0;) {
            if (num >= romanNum[i]) {
                result.append(roman[i]);
                num -= romanNum[i];
            } else {
                i--;
            }
        }
        return result.toString();
    }
}
