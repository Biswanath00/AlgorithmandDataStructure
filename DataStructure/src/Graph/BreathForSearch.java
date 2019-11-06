package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;




public class BreathForSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<ArrayList<Integer>> gp = new ArrayList<ArrayList<Integer>>();
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter total number of vertex");
         int ver=sc.nextInt();
         for(int i=0;i<ver;i++)
        	 gp.add(new ArrayList<Integer>());
         boolean yes=true;
         System.out.println("Enter src node to target node number");
         while(yes)
         {
        	 int src =sc.nextInt();
        	 int dst =sc.nextInt();
        	 gp.get(src).add(dst);
        	 
        	 System.out.println("press y to cont..");
        	 {
        		 if('y'!=sc.next().charAt(0))
        			 yes=false;
        	 }
        	 
         }
        //let src node is 0
         BFS(gp,ver,0);
	}

	private static void BFS(ArrayList<ArrayList<Integer>> gp, int ver,int src) {
		// TODO Auto-generated method stub
		
	   boolean v [] =new boolean[ver];
	   
	   Queue<Integer> q =new LinkedList<>();
	   
	   q.add(src);
	   
	   while(q.isEmpty()==false)
	   {
		   
		   int curr=q.poll();
		   v[curr]=true;
		   System.out.println(curr);
		   
		   ArrayList<Integer> m = gp.get(curr) ;
		     
		     if(m.isEmpty()==false)
			  for(int x :m)
			  {
				  if(v[x]==false)
				  {
					  q.add(x);
					  v[x]=true;
				  }
					  
			  }
				   
		   
	   }
	   
	   
		
	}

}
