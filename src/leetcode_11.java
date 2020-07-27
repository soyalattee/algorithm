public class leetcode_11 {
    public static void main(String[] args) {
        int height [] = new int[] {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int max=0;
        int len = height.length;
            for (int i=0;i<len-1; i++){
                for (int j=i+1; j<len;j++){
                    int wight = (j-i)*Math.min(height[i],height[j]);
                    if(wight>max){
                        max = wight;
                    }
                }
            }
        return max;
    }
}
