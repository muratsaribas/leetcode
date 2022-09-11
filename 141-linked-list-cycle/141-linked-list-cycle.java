/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        
        HashMap<ListNode, Integer> listMap = new HashMap<>();
        
        while(head != null){
            
            if(listMap.containsKey(head)) return true;
            
            else listMap.put(head, 1);
            
            head = head.next;
        }
        
        return false;
    }
}