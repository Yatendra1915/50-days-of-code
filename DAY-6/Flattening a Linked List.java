/*https://practice.geeksforgeeks.org/problems/flattening-a-linked-list/1#*/
class GfG
{
    Node flatten(Node root)
    {
	// Your code here
	
	    if(root==null || root.next==null)
	        return root;
	        
	    root.next=flatten(root.next);
	    
	    root= merge(root,root.next);
	    
	    return root;
    }
    
    Node merge(Node l1,Node l2){
        Node temp = new Node(-1);
        Node res = temp;
        while(l1!=null && l2!=null){
            
            if(l1.data>l2.data){
                temp.bottom=l2;
                temp=temp.bottom;
                l2=l2.bottom;
            }
            
            else{
                temp.bottom = l1;
                temp=temp.bottom;
                l1=l1.bottom;
            }
        }
        
        if(l1!=null)
            temp.bottom=l1;
        else if(l2!=null)
            temp.bottom=l2;
        
        return res.bottom;
    }
}
