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

//Efficient
class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
            return null;
        
        Node curr=head;
        
        while(curr!=null){
            Node temp =curr.next;
            curr.next=new Node(curr.val);
            curr.next.next=temp;
            curr=temp;
        }
        
        curr=head;
        
        while(curr!=null ){
            
            if(curr.next!=null)
             curr.next.random=(curr.random!=null)?curr.random.next:null;
            curr=curr.next.next;
        }
        
        curr=head.next;
        Node ans=curr;
        Node original = head;
        while(curr!=null && original!=null){
            original.next = (original.next!=null)? original.next.next : original.next;
            curr.next=(curr.next!=null)?curr.next.next:null;
            
            
            original = original.next;
            curr=curr.next;
        }
        return ans;
        
    }
}
