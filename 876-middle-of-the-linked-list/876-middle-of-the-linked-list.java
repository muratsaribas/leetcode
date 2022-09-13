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
    public ListNode middleNode(ListNode head) {
        
        ListNode tmp = head;
        int len = 0;
        
        while(tmp != null){
            tmp = tmp.next;
            len++;
        }
        
        tmp = head;
        len = len / 2;
        
        while(len != 0){
            tmp = tmp.next;
            len--;
        }
        
        return tmp;
        
    }
}