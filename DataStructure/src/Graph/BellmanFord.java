package Graph;

import java.util.ArrayList;
import java.util.Scanner;

class BellmanOperation
   {
	 int distance[];
	 ArrayList<ArrayList<Node>> gp ;
	 int vertex;
	 int edge;
	 boolean visited[];
	public BellmanOperation(int vertex)
	 {
		 gp=new ArrayList<ArrayList<Node>>();
		 this.vertex=vertex;
		 distance=new int[vertex];
		 visited=new boolean[vertex];
		 
		 while(vertex>0)
		 {
			 gp.add(new ArrayList<Node>());
			 --vertex;
			 distance[vertex]=Integer.MAX_VALUE;
			 visited[vertex]=false;
			 
		 }
	 }
	public void Display()
	{
		for(int i=0;i<vertex;i++)
		{
			for(int j=0;j<gp.get(i).size();j++)
			{
				System.out.println(i+"------->"+gp.get(i).get(j).vertex+" weight ---"+gp.get(i).get(j).weight);
			}
		}
	}
	public void BellmanFind(int src)
	{
		distance[src]=0;
		for(int i=0;i<vertex-1;i++)
		{
		  for(int j=0;j<gp.get(i).size();j++)
		  {   
			  int v=gp.get(i).get(j).vertex;
			  if(distance[i]!=Integer.MAX_VALUE && distance[i]+gp.get(i).get(j).weight<distance[v])
			  {
				  distance[v]=distance[i]+gp.get(i).get(j).weight;
			  }
		  }
		}
		for(int i=0;i<vertex;i++)
		{
			System.out.println(distance[i]);
		}
	}
	
   }
public class BellmanFord {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		int vertex=sc.nextInt();
		BellmanOperation obj =new BellmanOperation(vertex);
		
		boolean cont =true;
		int edge=0;
		while(cont)
		{
			obj.gp.get(sc.nextInt()).add(new Node(sc.nextInt(),sc.nextInt()));
			edge++;
			char chr = sc.next().charAt(0);
			if(chr=='n' || chr=='N')
				cont=false;
		}
		obj.edge=edge;
		obj.Display();
		obj.BellmanFind(1);
		sc.close();
	}
}
