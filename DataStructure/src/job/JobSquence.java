package job;


import java.util.PriorityQueue;
import java.util.Scanner;



import disjoint.DisjointOperation;
import disjoint.Node;

class Job
{
	char title;
	int deadline;
	int profit;
	public Job(char title, int deadline, int profit) {
		
		this.title = title;
		this.deadline = deadline;
		this.profit = profit;
	}
	
}
public class JobSquence 
 {
   public static void main(String[] args)
   {
	   Scanner sc =new Scanner(System.in);
	PriorityQueue<Job> pq =new PriorityQueue<Job>(1,new JobComparator());
	
		System.out.println("Enter total number of job");
		int job=sc.nextInt();
		int maxint=0;
		System.out.println("Enter job title deadline profit");
		for(int i=0;i<job;i++)
		{
			char title=sc.next().charAt(0);
			int deadline=sc.nextInt();
			int profit=sc.nextInt();
			if(maxint<deadline)
				maxint=deadline;
			pq.add(new Job(title,deadline,profit));
		}
		
		DisjointOperation dso = new DisjointOperation(maxint);
		for(int i=0;i<=maxint;i++)
		{
		
	    Node obj = new Node(i);
	    obj.parent=obj;
	    dso.mp.put(i, obj);
		}
		
		 int profit=0;
		 StringBuilder str =new StringBuilder("");
		  while (pq.isEmpty()==false) {
			
			  Job temp = pq.poll();
			 Node nt= dso.mp.get(temp.deadline);
		      if(nt.parent==nt)
		    	  {dso.link(temp.deadline-1, temp.deadline);
		    	  dso.find(temp.deadline);
		    	  profit+=temp.profit;
		    	  str.append(temp.title+" ");
		    	  }
		      else if(nt.parent.data-1>=0)
		      {
		    	  dso.link(nt.parent.data-1,nt.parent.data);
		    	  dso.find(temp.deadline);
		    	  profit+=temp.profit;
		    	  str.append(temp.title+" ");
		      }
		}
		System.out.println(profit);
		System.out.println(str);
		sc.close();
   }
 } 
