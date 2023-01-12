package leetCodeMedium;

public class removeNthNodeFromEndOfList {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val = val;}
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n){
        ListNode lastNode = head;
        if(head.next == null)return null;
        boolean se = true;
        while(se){
            ListNode lookAhead = lastNode;
            int i;
            for(i = 0; i< n +1; i++){
                if(lookAhead == null){
                    break;
                }
                lookAhead = lookAhead.next;
            }
            if(lookAhead == null){
                if(i == n)return head.next;
                if(lastNode.next != null){
                    lastNode.next= lastNode.next.next;
                }

                se = false;
            }
            lastNode = lastNode.next;
        }
        return head;
    }

}
