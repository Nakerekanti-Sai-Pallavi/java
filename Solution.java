import java.util.Arrays;
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                if((i!=j) && (nums[i] + nums[j] == target)){
                    if(j>i){
                        arr[0] = i;
                        arr[1] = j;
                        return arr;

                    }
                    arr[0] = j;
                    arr[1] = i;
                    return arr;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        Solution s = new Solution();
        int[] result = new int[2];
        result = s.twoSum(new int[]{1,2,3,4,5},7);
        System.out.println(Arrays.toString(result));
    }
} 
// time complexity O(n^2)