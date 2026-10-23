class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode chotu = new ListNode(-1);
        ListNode badu = new ListNode(-1);    
        ListNode chotuTail = chotu;
        ListNode baduTail = badu;
        ListNode temp = head;
        while (temp != null) {
            if (temp.val < x) {
                chotuTail.next = temp;
                chotuTail = chotuTail.next;
            } else {
                baduTail.next = temp;
                baduTail = baduTail.next;
            }
            temp = temp.next;
        }
        baduTail.next = null;          
        chotuTail.next = badu.next;     
        return chotu.next;
    }
}