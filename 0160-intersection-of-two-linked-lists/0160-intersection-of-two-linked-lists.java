import java.util.ArrayList;

public class Solution {
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
HashSet<ListNode> l1 = new HashSet<>();
    ListNode temp = headA;
    while (temp != null) {
        l1.add(temp);
        temp = temp.next;
    }
    ListNode temp2 = headB;
    while (temp2 != null) {
        if (l1.contains(temp2)) {
            return temp2;
        }
        temp2 = temp2.next;
    }
    return null;
}
}
