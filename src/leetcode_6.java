public class leetcode_6 {
    public static void main(String[] args) {
        String input = "PAYPALISHIRING"; // maximum length is 1000
        int numRows = 3;
        String output = convert(input,numRows);
        System.out.println(output);
    }

    public static String convert(String s, int numRows){
        if(numRows==1) return s;
        StringBuilder sb = new StringBuilder();
        int cycle = numRows*2-2;
        int len = s.length();
        for(int i=0; i<numRows; i++) {
            for (int j = 0; j+i < len; j += cycle) {
                sb.append(s.charAt(i+j)); // always exist line
                if (i != 0 && i != numRows - 1 &&j+cycle-i<len){ //zigzig line
                    sb.append(s.charAt(j+cycle-i));
                }
            }
        }

        return sb.toString();
    }
}
