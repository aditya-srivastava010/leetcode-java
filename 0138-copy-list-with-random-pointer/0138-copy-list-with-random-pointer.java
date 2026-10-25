class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        HashMap<Node, Node> map = new HashMap<>();

        // Pass 1: copies banao
        Node temp = head;
        while (temp != null) {
            map.put(temp, new Node(temp.val));
            temp = temp.next;
        }

        // Pass 2: next aur random jodo
        temp = head;
        while (temp != null) {
            Node copy = map.get(temp);
            copy.next = map.get(temp.next);       // temp.next null ho to map.get(null) = null
            copy.random = map.get(temp.random);   
            temp = temp.next;
        }

        return map.get(head);
    }
}