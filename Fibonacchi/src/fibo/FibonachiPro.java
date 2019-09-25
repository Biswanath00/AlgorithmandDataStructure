package fibo;

import java.util.Arrays;
import java.util.Scanner;

class Fibona
{
	int moriz[];
	public Fibona(int x)
	{
		moriz=new int [x+1];
		Arrays.fill(moriz, -1);
	}
	
 public int fibo(int n)
 {
	 if(moriz[n]!=-1)
	 {  
		 
		 return moriz[n];
	 }
	 if(n== 1 || n==0)
		 {
		 moriz[n]=n;
		 return n;
		 }
	 return moriz[n]=fibo(n-1)+fibo(n-2);
	// return fibo(n-1)+fibo(n-2);
 }
}
public class FibonachiPro {
   
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the nth number");
		int x=sc.nextInt();
		Fibona obj = new Fibona(x);
		
		System.out.println(obj.fibo(x));
         
        for(int i=0;i<obj.moriz.length;i++)
        {
        	System.out.print(obj.moriz[i]+" ");
        }
        System.out.println();
        sc.close();
	}
}
