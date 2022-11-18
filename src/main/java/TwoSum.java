//import java.util.Arrays;
//
//public class TwoSum {
//    public static void main(String[] args) {
//        int[] nums = {10, 2, 7, 11, 15};
//        int target = 9;
//        TwoSum.twoSum(nums, target);
//    }
//    public static int[] twoSum(int[] nums, int target) {
//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
//        int[] result = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                int sum = nums[i] + nums[j];
////                    System.out.println(sum);
//                if (sum == target) {
//                    System.out.println(nums[i] + " " + nums[j]);
//                    result[0] = nums[i];
//                    result[1] = nums[j];
//                }
//            }
//        }
//        System.out.println(Arrays.toString(result));
//        return result;
//    }
//
//}