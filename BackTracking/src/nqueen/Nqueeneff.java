package nqueen;

import java.util.Scanner;

public class Nqueeneff {
	static int bucket[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter the NXN");
         int n=sc.nextInt();
          bucket =new int[n];
         for(int i=0;i<n;i++)
        	 bucket[i]=i;
         nqueenArrgenment(bucket,n,0);
	}

	private static void nqueenArrgenment(int[] bucket, int n, int i) {
		// TODO Auto-generated method stub
		if(i==n)
		{
			ppvalid(bucket,n);
			/*for(int l=0;l<n;l++)
				System.out.print(bucket[l]+" ");
			System.out.println();*/
			return;
		}
		
		for(int l=i;l<n;l++)
		{
			swap(l,i);
			nqueenArrgenment(bucket, n, i+1);
			swap(l,i);
		}
	}

	private static void ppvalid(int[] bucket, int n) {
		// TODO Auto-generated method stub
		if(isValid(bucket,n))
		{
			printArray(bucket,n);
			
		}
		
	}

	private static void printArray(int[] bucket, int n) {
		// TODO Auto-generated method stub
	int arr[][] =new int[n][n];
	
	 for(int i=0;i<n;i++)
	 {
		 
			arr[i][bucket[i]]=1;
		
	 }
	 System.out.println("hi");
	 printBord(arr,n);
	}

	private static void printBord(int[][] arr, int n) {
		// TODO Auto-generated method stub
		 for(int i=0;i<n;i++)
		 {
			 for (int j = 0; j <n; j++) {
				System.out.print(arr[i][j]+" ");
			}
			 System.out.println();
		 }
		
	}

	private static boolean isValid(int[] bucket, int n) {
		// TODO Auto-generated method stub
		
         for(int i=0;i<n;i++)
         {
          for(int j=i+1;j<n;j++)
          {
        	  if(Math.abs(i-j)==Math.abs(bucket[i]-bucket[j]))
        		  return false;
          }
         }
		return true;
	}

	private static void swap(int l, int i) {
		// TODO Auto-generated method stub
	  int temp = bucket[l];
	  bucket[l]=bucket[i];
	  bucket[i]=temp;
	}

}
