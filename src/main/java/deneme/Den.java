package deneme;

public class Den {
    public static class ListNode{
        private ListNode next;   // null for an empty list
        int val;

        public ListNode(int val) {
            this.val = val;
        }

    }


    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(8);
        ListNode node3 = new ListNode(19);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(17);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode current = node5;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }



// Verilen linked listin başlangıç düğümü
        ListNode front = node1;

// Tersine çevrilmiş linked listi yazdır
        printReversed(front);
    }

    public static void printReversed(ListNode head) {
        if (head == null) {
            return;
        }
        printReversed(head.next);
        System.out.print(head.val + " ");
    }



}
