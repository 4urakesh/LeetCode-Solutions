
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        // Move prev to the node just before left
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // First node of the sublist to be reversed
        ListNode curr = prev.next;

        // Reverse nodes from left to right
        for (int i = 0; i < right - left; i++) {
            ListNode nextNode = curr.next;

            curr.next = nextNode.next;
            nextNode.next = prev.next;
            prev.next = nextNode;
        }

        return dummy.next;
    }
}
