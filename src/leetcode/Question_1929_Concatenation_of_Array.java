package leetcode;

public class Question_1929_Concatenation_of_Array {

    public static void main(String[] args){

        int nums[] = {1,2,1};
        int result[] = getConcatenation(nums);
        for(int i=0;i< result.length;i++){
            System.out.println(result[i]);
        }
    }

    public static int[] getConcatenation(int[] nums) {
        int result[] = new int[nums.length*2];
        for(int i =0;i< nums.length;i++)
        {
            result[i]=nums[i];
            result[nums.length+i]=nums[i];
        }
        return result;
    }
}
