package LeetCode;

/*
给定一个整数数组nums和一个目标值target,
请你在该数组中找出和为目标值的那两个整数，
并返回他们的数组下标。
你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

示例:
给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
*/
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 13;
        method(nums, target);
    }

    public static int[] method(int[] nums, int target) {
        //定义一个数组储存下标
        int[] arr = new int[2];
        //嵌套循环遍历数组
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                //判断和目标值相等时的数组元素下标
                if ((nums[i] + nums[j]) == target) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        //输出结果
        System.out.println("[" + arr[0] + "," + arr[1] + "]");
        return arr;
    }
}
