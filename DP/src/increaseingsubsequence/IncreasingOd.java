package increaseingsubsequence;

import java.util.Arrays;
import java.util.Scanner;

public class IncreasingOd {
	
	 static int longseq=0;
	 static int memo[];
	 static int ct=0;
		public static void main (String[] args)
		 {
			Scanner sc =new Scanner (System.in);
		   int test = sc.nextInt();
		   int arr[];
		   int size;
		   
		  
		   for(int k=0;k<test;k++)
		   {
			   size=sc.nextInt();
			   arr = new int[size];
			   for(int i=0;i<size;i++)
			       arr[i]=sc.nextInt();
			    memo=new int[size];
			    Arrays.fill(memo, 1);
               
              longseq= solve( arr,size);   
			 System.out.println(longseq);
			 longseq=0;
		//	for(int i=0;i<size;i++)
		//	System.out.print(memo[i]+" ");
			//System.out.println();
		   }
		 }
	   public static int solve(int arr[],int size)
	     {  
	        
		   for(int i=1;i<size;i++)
		   {
			   for(int j=0;j<i;j++)
			   {
				   if(arr[i]>arr[j])
				   {
					   memo[i]=Math.max(memo[i], memo[j]+1);
				   }
			   }
		   }
		   
		   int max=memo[0];
		   for(int i=1;i<size;i++)
		   {
			   if(max<memo[i])
				   max=memo[i];
		   }
		   return max;
	     }
	
}
/*
 *
1
16
0 8 4 12 2 10 6 14 1 9 5 13 3 11 7 15 
*/