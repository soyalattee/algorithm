import java.util.ArrayList;
import java.util.List;

public class leetcode_3sum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        list = threeSum(nums);

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> set = new ArrayList<>();

        recursion(0,0,nums,set,list);

        return list;
    }

    public static void recursion(int start,int idx, int[]nums, List<Integer> set, List<List<Integer>> ans ){
        if(idx==3){
            int sum = 0;
            for(int i: set){
                sum += i;
            }
            if(sum==0){
                List<Integer> arr = new ArrayList<>();
                for (int i=0; i<3 ; i++) {
                    arr.add(set.get(i));
                }
                ans.add(arr);
            }
        }
        for (int i = start; i < nums.length ; i++) {
            set.add(idx,nums[i]);
            recursion(i+1,idx+1,nums,set,ans);
            set.remove(idx);
        }

    }
}
