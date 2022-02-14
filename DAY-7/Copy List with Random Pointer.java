/*https://leetcode.com/problems/copy-list-with-random-pointer/*/

//NAIVE
class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> hs = new HashMap<>();
        
        Node curr=head;
        while(curr!=null){
            hs.put(curr,new Node(curr.val));
            curr=curr.next;
        }
        
        curr=head;
        
        while(curr!=null){
            Node temp = hs.get(curr);
            temp.next=hs.get(curr.next);
            temp.random=hs.get(curr.random);
            
            curr=curr.next;
        }
        
        return hs.get(head);
    }
}
