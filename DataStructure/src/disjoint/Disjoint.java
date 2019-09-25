package disjoint;


import java.util.Scanner;

public class Disjoint {
  
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of nodes");
		int set=sc.nextInt();
		
		System.out.println("Enter the data");
		
		DisjointOperation dso = new DisjointOperation(set);
		
		
		for(int i=1;i<=set;i++)
		{
		int data=sc.nextInt(); 
	    Node obj = new Node(data);
	    obj.parent=obj;
	    dso.mp.put(data, obj);
		}
		
		System.out.println("Enter the number of relation");
		int rel=sc.nextInt();
		
		while(rel>0)
		{
			dso.link(sc.nextInt(),sc.nextInt());
			rel--;
		}
		dso.display();
		sc.close();
   }
}
