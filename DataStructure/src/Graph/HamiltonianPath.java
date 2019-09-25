package Graph;

import java.util.*;
    // for direct and indiract graph ;start from 0 node;
    public class HamiltonianPath
      {
      	final static int index =6;
        static  int arr[][] = {{0,1,0,0,0,0} ,
                               {0,0,0,1,0,0} ,
                               {1,0,0,0,0,1} ,
                               {0,0,1,0,1,1} ,
                               {0,0,1,0,0,1} ,
                               {1,0,0,0,1,0}} ;
         static Scanner sc = new Scanner(System.in);
         public static void main(String[] args) {
          	
          	//insert(arr,index);
          	//re
          	int output[] = new int [index];
          	findHamiltonPath(arr,0,0,0,index,output);
          } 

          public static void insert(int arr[][],int index)
          {        

                 for (int i=0;i<index ;i++ )
                  {
                    for (int j=0;j<index ;j++)
                     {
                          arr[i][j]=sc.nextInt();       		
                     }             	
                  }              
          }
          public static void findHamiltonPath(int arr[][],int i,int j,int count,int index,int output[])
          {
          	//System.out.println(i+" "+j+" "+count);
          	if(i>=index || j>=index)
          		return ;
          	if (0 == i && count== index )
          	 {   
          	 	// check , so no digit repeat
          	      int check[] = new int [index];
          	      for(int k= 0 ;k<index;k++)
          	      	   {
          	      	   	check[output[k]]++;
          	      	   	if (check[output[k]]>1) 
          	      	   	{
          	      	   		return;
          	      	   	}
          	      	   }

          	    for (int k=0;k<index ;k++ ) 
          	    {
          	     System.out.print(output[k]+" ");		
          	    }	
          	    System.out.println();
          	    return;
           	 }
           	 if( count >=index)
           	 	return;
           	 
           	  if (arr[i][j] == 1) 
           	  {
           	  	arr[i][j]=0;
           	  	output[count]=j;
           	  	findHamiltonPath(arr,j,0,count+1,index,output);
           	  	arr[i][j]=1;
           	  }
           	  findHamiltonPath(arr,i,j+1,count,index,output);
          }
      }