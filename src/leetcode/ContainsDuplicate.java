package leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String [] args){
        int[] nums = {1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> intSet = new HashSet();
        for(int i=0;i<nums.length;i++){
            if(!intSet.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
