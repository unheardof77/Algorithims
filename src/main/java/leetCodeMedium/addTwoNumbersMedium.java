package leetCodeMedium;

public class addTwoNumbersMedium {
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode previous = new ListNode(), first = previous;
        ListNode node1 = l1;
        ListNode node2 = l2;
        int carry = 0;
        while(node1 != null || node2 != null){
            int val1 = node1 == null? 0: node1.val;
            int val2 = node2 == null? 0: node2.val;
            int total = val1 + val2 + carry;
            if(total > 9 ){
                carry = 1;
                total = total -10;
            }else{
                carry = 0;
            }
            ListNode newNode = new ListNode(total);
            previous.next = newNode;
            previous = newNode;
            if(node1 != null){
                node1 =  node1.next;
            }
            if(node2 != null){
                node2 =  node2.next;
            }
        }
        if(carry == 1){
            previous.next = new ListNode(1);
        }
        return first.next;
    }
}
