package sqrdocm;

import java.util.Scanner;

public class SquareRootDecomposition {
     static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int test = sc.nextInt();
		int size=sc.nextInt();
		int arr[] = new int[size];
		int blocksz=(int)Math.sqrt(size);
		//Handle non perfect square
		blocksz = (size%blocksz>0)?(size/blocksz)+1:blocksz;
		
		int block[]=new int [blocksz];
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		preproceesing(arr,blocksz,block);
		while(test-->0)
		{
           int l=sc.nextInt();
           int r=sc.nextInt();
           System.out.println(findsum(arr,blocksz,block,l,r));
		   
		}
	}
	private static int findsum(int[] arr, int blocksz, int[] block, int l, int r) {
		int sum=0;
		while(l<=r && l%blocksz!=0 && l!=0)
		{
			sum+=arr[l];
			l++;
		}
		while(l+blocksz<=r)
		{
			sum+=block[l/blocksz];
			l+=blocksz;
		}
		while(l<=r)
		{
			sum+=arr[l];
			l++;
		}
		
		return sum;
	}
	private static void preproceesing(int[] arr,int blocks, int[] block) {
		 int blokinx=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i%blocks==0 && i!=0)
			{  //increment block index
				blokinx++;
			}
			block[blokinx]+=arr[i];
		}
		
	}

}
