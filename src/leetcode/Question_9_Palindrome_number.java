package leetcode;


/**
 *
 * Given an integer x, return true if x is a  palindrome  , and false otherwise.
 *
 * Example 1:
 *
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * Example 2:
 *
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 *
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 *
 *
 * Constraints:
 *
 * -231 <= x <= 231 - 1
 *
 *
 * Follow up: Could you solve it without converting the integer to a string?
 *
 *
 */
public class Question_9_Palindrome_number {

    public static void main(String [] args){

        int x = 12121;

        System.out.println(checkPalindromeWithString(x));
        System.out.println(checkPalindromeWithoutString(x));

    }
    private static boolean checkPalindromeWithoutString(int x) {
        char[] charArray = String.valueOf(x).toCharArray();
        int start =0;
        int end = charArray.length-1;
        while(start<end){
            if(charArray[start]!=charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    private static boolean checkPalindromeWithString(int x) {
        return String.valueOf(x).equals(new StringBuffer(String.valueOf(x)).reverse().toString());

    }


}
