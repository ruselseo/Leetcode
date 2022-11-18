import java.util.Arrays;
import java.util.HashMap;

public class TwoSumImproved {
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2, 15};
        int target = 6;
        TwoSumImproved.twoSum(nums, target);

    }

    public static int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        HashMap<Integer,Integer> PrevNum = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(PrevNum.containsKey(target-nums[i])){
                result[0] = PrevNum.get(target-nums[i]);
                result[1] = i;
            }
            else PrevNum.put(nums[i], i);
        }
        System.out.println(Arrays.toString(result));
        return result;
    }


}
