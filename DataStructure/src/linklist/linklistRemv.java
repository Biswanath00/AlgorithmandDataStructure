package linklist;

import java.util.Scanner;

class linklistCreation
{
	Node  head = null,curr =null;
	public boolean isNull(Node head)
	{
		if(head == null)
			return true;
		else 
			return false;
	}
  public void addnode(Node x)
  {  
	  if(!isNull(curr))
	  curr.next=x;
	  curr=x;
  }
  public void display()
  {
	  Node temp =head;
	  if(temp==null)
		  System.out.print("empty linklist");
	  while(temp!=null)
	  {
		  System.out.print(temp.val+"-->");
		  temp=temp.next;
	  }
	  System.out.println();
  }
  public void nodeRemove(int rm)
  {
	  
	  
	  while(head.val==rm)
		  head=head.next;
	  Node  curr = head,pre =null;
	  while(curr!=null)
	  {
		  if(curr.val!=rm)
		  {
			  if(pre==null)
				  pre=curr;
			  else
			  {
				  pre.next=curr;
				  pre=curr;
			  }
			
		  }
		  curr=curr.next;
	  }
	 
	  
		  
		  pre.next=null;
	  
  }
}
public class linklistRemv {
	
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int size =sc.nextInt();
		linklistCreation obj = new linklistCreation();
		
		for(int i=0 ;i<size;i++)
		{     
			int x =sc.nextInt();
			if(obj.isNull(obj.head))
			{ 
				 obj.head=new Node(x) ;
				 obj.curr=obj.head;
			}
			
			else {
				Node temp =new Node(x);
				obj.addnode(temp);
			}
		}
		obj.display();
		int remv =sc.nextInt();
		
		obj.nodeRemove(remv);
		
		obj.display();
		
		
	}
	

}
