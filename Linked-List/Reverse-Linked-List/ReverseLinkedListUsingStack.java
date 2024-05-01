import java.util.Stack;

class ReverseLinkedListUsingStack {
    ListNode reverseLinkedList(ListNode head) {
        // Create a stack to store the values of the linked list nodes
        Stack<Integer> valueStack = new Stack<>();

        // Push the values of the linked list nodes onto the stack
        while (head != null) {
            valueStack.push(head.val);
            head = head.next;
        }

        // Create a new linked list to store the reversed values
        ListNode reverseList = new ListNode(Integer.MIN_VALUE);

        // Pointer to traverse the new reversed linked list
        ListNode ptr = reverseList;

        // Pop values from the stack and create new nodes to build the reversed linked list
        while (!valueStack.isEmpty()) {
            ptr.next = new ListNode(valueStack.pop());
            ptr = ptr.next;
        }
        // Return the reversed linked list, omitting the dummy node
        return reverseList.next;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ReverseLinkedListUsingStack reverseLinkedListUsingStack = new ReverseLinkedListUsingStack();

        ListNode reversedList = reverseLinkedListUsingStack.reverseLinkedList(head);

        while (reversedList != null) {
            System.out.print(reversedList.val + " ");
            reversedList = reversedList.next;
        }
    }
}

// Definition of ListNode class representing a node in a linked list
class ListNode {
    int val; // Value of the node
    ListNode next; // Reference to the next node

    //Constructors
    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
