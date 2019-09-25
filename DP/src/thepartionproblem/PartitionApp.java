package thepartionproblem;

import java.util.Scanner;
public class PartitionApp
{
	static int arr[],key[],totsum[];
	static boolean stu=false;

    static Scanner sc=new Scanner(System.in);
	public static  void insert(int size,int k)
	 {
        arr=new int [size];
        totsum=new int[k];
        System.out.println("Enter the Element :");
        for (int i=0;i<size ;i++ )
         {
           arr[i]=sc.nextInt();     	
         }
         key=new int[k];
         setkey(k,size);
         storesum(k);
         Partition(k,size);
	 }
	 public static void storesum(int k)
	 {
	 	for (int i=0;i<k ;i++ )
           {
            totsum[i]=sum(i,k);	
           }
	 }

	 public static void setkey(int k,int size)
	 {
	 	 int tsize=size;
	 	for (int i=0;i<k ; i++) 
	 	{
	 	   if(tsize/k>0)
	 	    key[i]=k;
            else
            key[i]=tsize;

	 	    tsize-=k;
	 	    System.out.print (key[i]+" ");
	 	}
	 	System.out.println();
	 	for (int i=0;i<k-1 ;i++ )
	 	 {
	 	   key[i+1]+=key[i];	
	 	    System.out.print (key[i]+" ");
	 	 }
	 	 System.out.println("\n\n");
	 }

	 public static void Partition(int k,int size)
	  { 
	  	  stu=true;
             
          for (int i=0;i<k-1 ;i++ )
           {
              if(totsum[i]+arr[key[i]]<=totsum[i+1])
                 {
                  key[i]=key[i]+1;
                  stu=false;
                 }
               
           }

         if (stu==true)
          {
            return; 	
          }
          else
          {
           storesum(k);
           Partition(k,size);
          }
	  } 
	 public static int sum(int i,int k)
	 {
	 	 int sum=0;
	     int j;
	     if(i==0)
	      j=0;
	      else
	      j=key[i-1];
	      System.out.println(j+" "+key[i]);		 
	 	  while(j<key[i])
	 	  {
             sum+=arr[j];
             j++;
	 	  }
	 	
	 	  	return sum;

	 }
	 public static void main(String[] args) {
	 	insert(9,3);
        System.out.println("\n\n\n");
	 	for (int i=0;i<3 ;i++ )
	 	 {
	 	 System.out.println(key[i]);	
	 	}
	 }
}