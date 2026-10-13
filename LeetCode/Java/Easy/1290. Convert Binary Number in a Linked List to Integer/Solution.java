/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        String ans="";
        ListNode curr=head;
        while(curr!=null){
            ans=ans+curr.val;
            curr=curr.next;
        }
        int sum=0;
        int base=0;
        for(int i=ans.length()-1;i>=0;i--){
            int n=ans.charAt(i)-'0';

            sum=sum+n*(int)Math.pow(2,base);
            base++;
        }
        return sum;
    }
}