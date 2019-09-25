package moalgo;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MosAlgorithm {
    static Scanner sc =new Scanner(System.in);
	static int moR=-1,moL=0,sum=0;
    public static void main(String[] args)
	{
	  int size=sc.nextInt();
	  int arr[]= new int[size];
	  
	  int blosiz = (int) Math.sqrt(size);
	  blosiz=(size%blosiz>0)?(size/blosiz)+1:blosiz;
	  
	  for (int i = 0; i < arr.length; i++) {
	   arr[i]=sc.nextInt();	
	   }
	 
	  int block[] =new int[blosiz];
	  
	  
	  
	  System.out.println("Enter set of query");
	  int setR=sc.nextInt();
	  PriorityQueue<QueueRange> pq =new PriorityQueue<QueueRange>(new MosSort());
	  while(setR-->0)
	  {
		 QueueRange obj = new QueueRange(sc.nextInt(), sc.nextInt(),blosiz);
		 pq.add(obj);
	  }
	  
	  for(QueueRange qr :pq)
	  {   
		  System.out.println(qr.L+"-"+qr.R);
		  System.out.println(findsum(arr,blosiz,qr.L,qr.R));
	  }
    }
	
	
	private static int findsum(int[] arr, int block, int l, int r) {
		while(moR<r)
		{
			moR++;
			sum+=arr[moR];
			
		}
		while(moR>r)
		{
			sum-=arr[moR];
			moR--;
		}
		while(moL<l+1)
		{
			
			sum-=arr[moL];
			moL++;
		}
		while(moL>l)
		{   moL--;
			sum+=arr[moL];
		}
		
		return sum;
	}
	
	
	
	
	
	
	
	
	
	
	
	//0 1 1 0 2 3 4 1 3 5 1 5 3 5 4 0 2 2
	/*
0 8
2 5
2 11
16 17
13 14
1 17
17 17

9
1 1 2 1 3 4 5 2 8
3
0 4
1 3 
2 4
	 */
	 
}
