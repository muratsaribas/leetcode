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
    public ListNode deleteMiddle(ListNode head) {
        ListNode tmp = head;
        int len = 0;
        
        while(tmp != null){
            tmp = tmp.next;
            len++;
        }
        
        if(len == 1) return null;
        
        tmp = head;
        len = len / 2;
        
        while(len > 1){
            tmp = tmp.next;
            len--;
        }
        
        tmp.next = tmp.next.next;
        
        return head;
        
    }
}