public class leetcode_525 {
    public static void main(String[] args) {
        int num[] = {0,0,1,0,0,0,1,1};
        System.out.println(findMaxLength(num));
    }
    public static int findMaxLength(int[] nums) {
        int maxLen=0;
        int numsLen = nums.length;
        int total = 0; //값 = 0
        for (int i = 0; i < numsLen; i++) {
            if(nums[i]==0){
                nums[i]= -1;
            }
            total +=nums[i];
        }
        if(total==0) return numsLen;
        for (int i = 0; i <numsLen ; i++) {
            int subTotal = total;
            for (int j = numsLen-1; i < j; j--) {
                if(j-i<=maxLen) break;
                if(subTotal==0) {
                    //System.out.println("같다"+i+' '+j);
                    maxLen = maxLen < j-i+1 ? j-i+1 : maxLen;
                    break;
                }
                subTotal-= nums[j];
            }
            if(numsLen-i<maxLen) break;
            System.out.println(subTotal);
            total -= nums[i];
        }
        return maxLen;
    }
}
