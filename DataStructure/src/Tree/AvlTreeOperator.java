package Tree;

public class AvlTreeOperator {
	
	public static void main(String args[]) 
	{
	    AVLTree tree =new AVLTree();
	    
	    tree.insert(10);
	    tree.insert(50);
	    tree.insert(40);
	    tree.insert(3);
	    tree.insert(11);
	    tree.insert(12);
	    tree.insert(9);
	    tree.insert(8);
	    tree.insert(14);
	    tree.display(tree.rootren());
	}

}
/*
      10
    /     \
   3       50
    \       /
     9     40
    /     /
   8    11
        / \
       12  14
*/