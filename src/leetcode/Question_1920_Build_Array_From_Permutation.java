package leetcode;

public class Question_1920_Build_Array_From_Permutation {

    public static void main(String[] args) {

        int nums [] = {0,2,1,5,3,4};
        int result [] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            result[i] = nums[nums[i]];
        }
        System.out.println("----------------------------------------");

        int nums1 [] = {5,0,1,2,3,4};

        findPermutation(nums1,0);
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(nums1[i]);
        }

    }
    private static void findPermutation(int[] nums, int start) {

        if(start<nums.length){
            int tmp = nums[start];
            int result = nums[tmp];
            findPermutation(nums,start+1);
            nums[start]=result;
        }

    }
}
