
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class LinkedListReverseAddition2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        ListNode l2 = new ListNode(4, new ListNode(6, new ListNode(5, null)));
        ListNode resultNode = addTwoNumbers(l1, l2);
        while (resultNode.next!=null){
            System.out.print(resultNode.val+" ");
            resultNode.next=resultNode.next.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode prev = head;
        int carry=0;

        while (l1!=null || l2!=null || carry!=0){
             int l=0;
             int m=0;
             if (l1.next!=null){
                 l=l1.val;
                 l1.next=l1.next.next;
             }
             if (l2.next!=null){
                 m=l2.val;
                 l2.next=l2.next.next;
             }

             int sum = l+m+carry;
             carry/=10;
             ListNode tempNode = new ListNode(sum-carry*10);
             prev.next=tempNode;
             prev=tempNode;

        }

        return head.next;
    }
}
