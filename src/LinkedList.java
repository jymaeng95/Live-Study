public interface LinkedList {

    // add remove contains
    ListNode add(ListNode head, ListNode nodeToAdd, int position);
    ListNode remove(ListNode head, int positionToRemove);
    boolean contains(ListNode head, ListNode nodeToCheck);
}
