package Tree;

public class AVLTree {
	private class Node{
		int data;
		Node left;
		Node right;
		int height;
		
		Node(int data)
		{
			this.data=data;
			left=right=null;
			height=1;
		}
		
		
	}
	
	private Node root;
	
	void insert(int data)
	{
		 root= insert(root,data);
	}

	private Node insert(Node node, int data) {
		
		if(node==null)
		{
			Node N = new Node(data);
			return N;
		}
		if(data<node.data)
		{
			node.left = insert(node.left, data);
		}else
		{
			node.right=insert(node.right,data);
		}
		
		node.height = Math.max(height(node.left), height(node.right))+1;
		
		int bf = bfact(node);
		
		//LL rotation
		if(bf>1 && data <node.data)
		{
			return rightRotation(node);
		}
		if(bf <-1 && data>node.data)
		{
			return leftRotation(node);
		}
		if(bf>1 && data>node.left.data)
		{
			   node.left = leftRotation(node.left);
			   return rightRotation(node);
			   
		}
		if(bf<-1  && data<node.right.data)
		{
			node.right = rightRotation(node.right);
			return leftRotation(node);
		}
		
		return node;
	}

	private Node leftRotation(Node A) {
		
		Node B =A.right;
		Node Bl=B.left;
		
		A.right=Bl;
		B.left=A;
		
		A.height = Math.max(height(A.left), height(A.right))+1;
		B.height = Math.max(height(B.left), height(B.right))+1;
		
		return B;
	}
	

	private Node rightRotation(Node A) {
		
		
		Node B = A.left;
		Node Br = B.right;
		
		A.left=Br;
		B.right=A;
		
		//update the height
		/*
		 *            A       B
		 *            /      /  \ 
		 *            B     C   A
		 *            /
		 *            c
		 */
		//node --->A
		//root nodeis --->B
		A.height= Math.max(height(A.left), height(A.right))+1;
		B.height =Math.max(height(A.left), height(A.right))+1;
		
		
		
		return B;
	}

	private int bfact(Node node) {
	
		return height(node.left)-height(node.right);
	}

	private int height(Node nod) {
		if(nod==null)
			return 0;
		
		return nod.height;
	}
	
	public void display(Node root)
	{
		if(root==null)
			return;
		display(root.left);
		System.out.print(root.data+" ");
		display(root.right);
		
	}
   public Node rootren()
   {
	   return root;
   }
}
