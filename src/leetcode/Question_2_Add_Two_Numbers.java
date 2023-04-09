package leetcode;


public class Question_2_Add_Two_Numbers {

    public static void main(String[] args) {
//        Input: l1 = [2,4,3], l2 = [5,6,4]
//        Output: [7,0,8]
//        Explanation: 342 + 465 = 807.
        //l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        ListNode listNode1 = new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9)))))));
        ListNode listNode2 = new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9))));

        ListNode resultListNode =null;
        ListNode head = null;
        ListNode tmpNode;
        int reminder=0;
        while(listNode1!=null || listNode2!=null || reminder!=0){
            int sum = reminder;
            if(listNode1!=null){
                sum+=listNode1.val;
                listNode1=listNode1.next;

            }
            if(listNode2!=null){
                sum+=listNode2.val;
                listNode2=listNode2.next;
            }

                reminder = sum/10;
                sum = sum%10;


            tmpNode = new ListNode(sum);

            if(resultListNode==null){
                resultListNode=tmpNode;
                head=tmpNode;
            }else{
                head.next=tmpNode;
                head=head.next;
            }


        }
        while(resultListNode!=null){
            System.out.println(resultListNode.val);
            resultListNode=resultListNode.next;
        }



    }
}
