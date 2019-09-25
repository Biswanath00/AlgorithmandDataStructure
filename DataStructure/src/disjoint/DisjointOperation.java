package disjoint;

import java.util.HashMap;
import java.util.Map;

public class DisjointOperation {
	
	public HashMap<Integer,Node> mp; 
	int set;
	
	

	public DisjointOperation(int set2) {
		// TODO Auto-generated constructor stub
		 this.set=set2;
	     mp= new HashMap<Integer,Node>();
	}
   
   public void display()
   {
	   for(Map.Entry<Integer,Node> mpElemrnt : mp.entrySet())
	   {
		   int key =(Integer) mpElemrnt.getKey();
		   Node tm=mp.get(key);
		   if(tm.parent==tm)
			   System.out.println(tm.data);
		   else
		   {    
			   //path compression
			Node parent = findParent(tm);
			tm.parent=parent;
			System.out.println(parent.data);
		   }
	   }
   }
   //single node path compression
   public void find(int x)
   {
	   Node temp2=mp.get(x);
	   Node temp=temp2;
	   while(temp2.parent!=temp2)
			temp2=temp2.parent;
	   temp.parent=temp2;
   }
	public void link(int num1, int num2) {
		
		Node temp1=(mp.get(num1));
		Node temp2=(mp.get(num2));
		if(temp1.parent==temp1 && temp2.parent==temp2)
		{
		     	temp2.parent=temp1;
		     	temp1.rank=temp1.rank+1;
		     	
		}
		else if(temp1.parent==temp1 && temp2.parent!=temp2)
		{
			Node tmpar= findParent(temp2);
			
			temp1.parent=tmpar;
		}
		else if(temp1.parent!=temp1 && temp2.parent==temp2)
		{
	Node tmpar= findParent(temp1);
			
			temp2.parent=tmpar;
		}
		else if(temp1.parent!=temp1 && temp2.parent!=temp2)
		{
			Node tmpar1=findParent(temp1);
			Node tmpar2=findParent(temp2);
			
			if(tmpar1.rank>tmpar2.rank)
				tmpar2.parent=tmpar1;
			else if(tmpar1.rank<tmpar2.rank)
				tmpar1.parent=tmpar2;
			else if(tmpar1.rank==tmpar2.rank)
				{tmpar2.parent=tmpar1;tmpar1.rank++;}
		}
	}



	public Node findParent(Node temp2) {
		
		while(temp2.parent!=temp2)
			temp2=temp2.parent;
		
		return temp2;
	}
                                              
}
