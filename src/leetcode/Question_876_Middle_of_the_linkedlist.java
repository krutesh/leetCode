package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Question_876_Middle_of_the_linkedlist {

    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,new ListNode(6))))));

        ListNode result = middleNode(head);

        while(result!=null){
            System.out.println(result.val);
            result = result.next;
        }

    }

    public static ListNode middleNode(ListNode head) {
        //Step 1 : Iterate All nodes.
        int count =0;
        Map<Integer,ListNode> listNodeMap = new HashMap<>();
        while(head!=null){
            //Step 2 : Store Result Somewhere so next time no need to iterate.
            listNodeMap.put(count++,head);
            head = head.next;

        }
        // Step 3 : generate new ListNode with middle and return it.
        return listNodeMap.get(count/2);
    }
}
