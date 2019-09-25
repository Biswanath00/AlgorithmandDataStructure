package Graph;

import java.util.ArrayList;

import java.util.PriorityQueue;
import java.util.Scanner;

class Dijkstras{
	
	int vertex,edge;
	ArrayList<ArrayList<Node>> gp ;
	boolean visted[];
	
	
	int distance[] ;
	 public Dijkstras(int vertex)
	 {
		
		  gp =new ArrayList<ArrayList<Node>>(vertex);
		  edge=0;
		  distance= new int[vertex];
		  this.vertex=vertex;
		  visted=new boolean[vertex];
		  while(vertex>0)
		  {
			  gp.add(new ArrayList<Node>());
			  --vertex;
			  //making all node distance inf
			  distance[vertex]=Integer.MAX_VALUE;
			  visted[vertex]=false;
		  }
		 
	 }
	
 public void display()
 {  System.err.println();
	 for(int i=0;i<vertex;i++)
	 {  
		 for(int j=0;j<gp.get(i).size();j++)
		 {   
			 System.out.println(i+"----->"+gp.get(i).get(j).vertex+" weight "+gp.get(i).get(j).weight);
		 }
	 
     }
	

  }
 public void findDistance(int source)
 {                       
	 
	 PriorityQueue<Node> pq = new PriorityQueue<Node>(new NodeComparaor());
	 distance[source]=0;
	 
	 do {
	 for(int i=0;i<gp.get(source).size();i++)
	 {   
		 // if node is already visited don't don any things
		 if(visted[source]==false)
		 {
		 //put the nodes to the min heap on the basis of min weight edge 
		 pq.add(gp.get(source).get(i));
		 
		 Node temp =gp.get(source).get(i);
		 if(distance[source]+temp.weight<distance[temp.vertex])
			 distance[temp.vertex]=distance[source]+temp.weight;
		 }
	 }
	 //poll out the less weigth edage from min heap
	 Node temp = pq.poll();
	 //mark node visited
	 visted[source]=true;
	 //put new source to process throught other path
	 source=temp.vertex;
	 //if min heap is empty then break;
	 }while(pq.isEmpty()==false);
	 
	 // display the result
	 for(int k=0;k<distance.length;k++)
		 System.out.println(distance[k]);
 }
}

public  class DijkstrasSource {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total vertex");
		int vertex =sc.nextInt();
		Dijkstras obj =new Dijkstras(vertex);
	    int edges = 0;
	    boolean cont=true;
	    System.out.println(obj.gp.size());
	    while(cont)
	    {   
	       // System.out.println("weight  and vertex");
	      
	    	obj.gp.get( sc.nextInt()).add(new Node(sc.nextInt(),sc.nextInt()));
	    	edges++;
	    	//System.out.println("Enter y to add new edge");
	    	char chk=sc.next().charAt(0);
	    	if(chk=='n' || chk=='N')
	    		cont=false;
	    }
	    obj.edge=edges;
	    
	    obj.display();
	    obj.findDistance(0);
	    sc.close();
	}
}