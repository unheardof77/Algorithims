
public class MergeSortedArrayEasy {
    static public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static public class HeadNode {
        ListNode head;
        ListNode tail;
        HeadNode(){};
        HeadNode(ListNode head){this.head = head;}
        HeadNode(ListNode head, ListNode tail){
            this.head = head;
            this.tail = tail;
        }
    }

    static public void pushNodeToEnd(ListNode larger, HeadNode headNode){
        headNode.tail.next = larger;
        headNode.tail = larger;

    }

    static public void addNodeToBeginning(ListNode smaller, HeadNode headNode){
        ListNode beginning = headNode.head;
        while (beginning.next.next != null){
            System.out.println("stuck");
            beginning = beginning.next;
        }
        beginning.next = smaller;
        smaller.next = headNode.tail;
    }

    static public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newListNode1 = new ListNode();
        ListNode newListNode2 = new ListNode();
        HeadNode newListHead = new HeadNode(list1, list2);
        ListNode firstListNode = list1;
        ListNode secondListNode = list2;

        while(firstListNode != null && secondListNode != null){
            if(firstListNode.val >= newListHead.tail.val ){
                pushNodeToEnd(firstListNode, newListHead);
            }else {
                addNodeToBeginning(firstListNode, newListHead);
            }
            if(secondListNode.val >= newListHead.tail.val){
                pushNodeToEnd(secondListNode, newListHead);
            }else {
                addNodeToBeginning(secondListNode, newListHead);
            }
            firstListNode = firstListNode.next;
            secondListNode = secondListNode.next;
        }
        return newListHead.head;
    }

    static public void main(String[] args){
        ListNode endList = new ListNode(4);
        ListNode secondToEnd = new ListNode(3, endList);
        ListNode thirdToEnd = new ListNode(2, secondToEnd);
        ListNode fourthToEnd = new ListNode(1, thirdToEnd);
        ListNode head = new ListNode(0, fourthToEnd);

        ListNode end2 = new ListNode(3);
        ListNode second2 = new ListNode(2, end2);
        ListNode third2 = new ListNode(1, second2);
        ListNode head2 = new ListNode(0, third2);

        ListNode returnedMerge = mergeTwoLists(head, head2);
        System.out.println(returnedMerge);
//        while(returnedMerge != null){
//            System.out.println(returnedMerge.val);
//            returnedMerge = returnedMerge.next;
//        }
    }

}
