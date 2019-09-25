package optimalStrategeGame;

import java.util.Arrays;
import java.util.Scanner;

public class OptimalStratege {
	static int memo[][];
	public static void main (String[] args)
	 {
		Scanner sc =new Scanner (System.in);
	   int test = sc.nextInt();
	   int arr[];
	   for(int i=0;i<test;i++)
	   {
		   int size=sc.nextInt();
		    arr= new int [size];
		   for(int k=0;k<size;k++)
		   arr[k]=sc.nextInt();
		   memo=new int [size][size];
		   for(int k=0;k<size;k++)
		   Arrays.fill(memo[k],-1);
	    System.out.println(answer(arr,size,0,size-1));
	   }
	 }
	 public static int answer(int arr[],int size,int i,int j)
	 {
          if(i==j)
          return arr[i];
          if(j==i+1)
          return Math.max(arr[j],arr[i]);
          if(memo[i][j]!=-1)
           return memo[i][j];
          else
          return  memo[i][j]=Math.max(arr[i]+Math.min(answer(arr,size,i+1,j-1),answer(arr,size,i+2,j)),arr[j]+Math.min(answer(arr,size,i,j-2),answer(arr,size,i+1,j-1)));
	 
	 }
}
