package leetCodeEasy;

public class rotateListMedium {
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

    public ListNode rotateRight(ListNode head, int k){
        int count = 0;
        int iterations = 0;
        if(head == null)return head;
        while(k > iterations) {
            ListNode newHead = head;
            ListNode secondToLast = new ListNode();
            while (newHead.next != null) {
                secondToLast = newHead;
                newHead = newHead.next;
                if(iterations==0)count++;
            }
            if(iterations == 0){
                count++;
                if(k%count ==0 && k >=count)return head;
                k = k > count? k % count : k;
            }
            ListNode lastOne = newHead;
            lastOne.next = head;
            secondToLast.next = null;
            head = lastOne;
            iterations++;
        }
        return head;
    }
}
