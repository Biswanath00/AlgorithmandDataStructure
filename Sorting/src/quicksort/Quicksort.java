package quicksort;


public class Quicksort
        {
        static  int arr[]={2,9,6,7,3,5,34};
        	public static void main(String[] args) {
        		
        		
        		int r=6,p=0;


        		for (int i=0;i<=r ;i++ ) {
        			System.out.print(arr[i]+" ");
        		}
               
        		QuicksortFun(arr,p,r);
        		
                 System.out.println();

        		for (int i=0;i<=r ;i++ ) {
        			System.out.print(arr[i]+" ");
        		}
        		
        	}


        	public static void QuicksortFun(int arr[],int p,int r)
        	{
        	   if (p<r) {

        	   	int q=Partition(arr,p,r);
        	   	QuicksortFun(arr,p,q);
        	   	QuicksortFun(arr,q+1,r);        	   	
        	   }
        	}

        	public static int Partition(int arr[],int p,int r)
        	{
                  
             int x=arr[r];
             int i=p-1;

             for (int j=p;j<=r-1; j++) 
             {

             	if (arr[j]>=x) 
             	{

             		i+=1;

             		int temp=arr[i];
             		arr[i]=arr[j];
             		arr[j]=temp;
             	}
             	
             }

               swap(i+1,r);

               return i;


        

    /*           int x=arr[p];
               int i=p-1;
               int j=r+1;

         while (true) 
    {
      do{
          j--;
        }while (arr[j] > x) ; 
      
      do{
          i++;
        }while (arr[i] < x) ;
        if  (i >=j) 
          return j;

         swap(i,j);
    }
             */   
      
        }

public static void swap(int i,int j)
                {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;


               }

        	
           }
        