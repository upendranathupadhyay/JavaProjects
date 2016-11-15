package com.Tree;

public class Operations 
{
	Node root;

	public Operations() 
	{
		
		this.root = null;
	}
	public Node create(int data)
	{
		return new Node(data);
	}
	 public boolean isEmpty()
	 {
		return root==null; 
	 }
	 public void insert(int data)
	 {
		 insert(root,data);
	 }
	 private void insert(Node node, int data)
     {
         if (node == null)
             node = new Node(data);
         else
         {
             if (node.getData()< data)
                 insert(node.right, data);
             else
                 insert(node.left, data);             
         }
         
     } 
	  public void inorder()
	     {
	         inorder(root);
	     }
	     private void inorder(Node r)
	     {
	         if (r != null)
	         {
	             inorder(r.getLeft());
	             System.out.print(r.getData() +" ");
	             inorder(r.getRight());
	         }
	     }
}
