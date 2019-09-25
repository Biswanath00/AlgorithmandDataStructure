package Arr;



class Pascal 
   {

   	public static void main(String[] args) {
   	       int index=2;
   	       int arr[][] =  new int [index][index] ;

   	       Pascaltri(arr,0,0,index);
   	       for (int i=0;i<index ;i++ )
   	        {
   	          for (int j=0;j<index ;j++ ) 
   	                {
   	           		System.out.print(arr[i][j]+" ");	
   	           		} 		
   	           		System.out.println();
   	       	}	
   	  }
   	  public static void Pascaltri(int arr[][],int i,int j,int index)
   	    {
            if (i==index)
             {
               return ;	
             }
             if (j==0)
              {
             	arr[i][j]=1;
             }
             if (i==j)
              {
              	arr[i][j]=1;
               Pascaltri(arr,i+1,0,index);
               return;	
              }
              if(i>=2 && j!=0)
              	arr[i][j]=arr[i-1][j-1]+arr[i-1][j];

              Pascaltri(arr,i,j+1,index);
   	    }
   }