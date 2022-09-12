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
    public ListNode reverseList(ListNode head) {
        
        Stack<ListNode> nodeStack = new Stack<>();
        
        while(head != null){
            nodeStack.push(head);
            head = head.next;
        }
        
        ListNode tmp = new ListNode();
        head = tmp;
        
        while(!nodeStack.isEmpty()){
            ListNode curr = nodeStack.pop();
            head.next = new ListNode(curr.val);
            head = head.next;
        }
        
        return tmp.next;
        
    }
}