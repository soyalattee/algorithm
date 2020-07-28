public class leetcode_12 {
    public static void main(String[] args) {
        int input = 3;
        String ans = inToRoman(input);
        System.out.println(ans);
    }
    public static String inToRoman(int num){
        String ans ="";
        String roman [] = {"I", "V", "X", "L", "C", "D","M"};
        int romanNum [] = {1,5,10,50,100,500,1000}; // 0~6
        int lastIdx = roman.length-1;
        int i = 1000;
        while(num >0){
            if(num/romanNum[lastIdx]>0){
                int pivotNum = num/romanNum[lastIdx]; // will be one digit, change to Romannum
                if(pivotNum == 4 || pivotNum ==9){
                    //내일하자
                }

            }

        }
        return ans;
    }
}
