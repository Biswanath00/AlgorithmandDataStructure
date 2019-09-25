package ropeProblem;

import java.util.Arrays;
import java.util.Scanner;

class Rope
{   int mi[]; 
	public Rope(int x)
	{
		mi = new int[x+1];
		Arrays.fill(mi, -1);
	}
	
	public int  rope(int n,int a,int b,int c)
	{  
	   if(n<0)
		   return -1;
	   if(n==0)
		   return 0;
	   if(mi[n]!=-1)
		   return mi[n];
	   int result =Math.max(rope(n-c, a, b, c), Math.max(rope(n-a, a, b, c),rope(n-b, a, b, c)));
	   if(result==-1)
		   return -1;
	   else
	   return mi[n]=result+1;
	}
}
public class RopePro {

	 public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter length of rope ");
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		Rope obj = new Rope(n);
		System.out.println(obj.rope(n, a, b, c));
		for(int i=0;i<=n;i++)
			System.out.print(obj.mi[i]+" ");
	}
}
