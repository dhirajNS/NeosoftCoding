import org.w3c.dom.Node;

class ListNode{
    int data;
    ListNode next;
    ListNode(int d) {
        data = d; }
}
public class ReverseLinkedList {
    //1-2-3-4-5   >> 5-4-3-2-1

        public static ListNode reverseList(ListNode head) {
            ListNode currentNode=head;
            ListNode previousNode=null;
            ListNode nextNode=null;
            while(currentNode!=null) {
                nextNode = currentNode.next;
                currentNode.next = previousNode;
                previousNode = currentNode;
                currentNode=nextNode;
            }
            return previousNode;
        }
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        ListNode l4=new ListNode(4);
        ListNode l5=new ListNode(5);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        ReverseLinkedList.reverseList(l1);
        }
    }
