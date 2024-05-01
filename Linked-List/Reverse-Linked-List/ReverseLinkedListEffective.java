class ReverseLinkedListEffective {
    ListNode reverseLinkedList(ListNode head) {
        //Edge-Case if the list is empty
        if (head == null) {
            return null;
        }
        //Edge Case if the list has only 1 element
        if (head.next == null) {
            return head;
        }
        // Initialize pointers
        ListNode prevNode = null; // Previous node initially null
        ListNode currNode = head; // Current node starts from the head

        while (currNode != null) {
            ListNode nextNode = currNode.next; // Pointer Storing the next node reference
            currNode.next = prevNode; //Reverse pointer to previous node
            prevNode = currNode; // Move prevNode to current node
            currNode = nextNode; // Move current node to the next node
        }
        // After traversal, 'prevNode' will be the new head of the reversed list
        head = prevNode;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ReverseLinkedListEffective reversedLinkedListEffective = new ReverseLinkedListEffective();

        ListNode reversedList = reversedLinkedListEffective.reverseLinkedList(head);

        while (reversedList != null) {
            System.out.print(reversedList.val + " ");
            reversedList = reversedList.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
