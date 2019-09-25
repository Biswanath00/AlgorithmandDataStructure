package insertionSort;

public class InsertionSort 
{
        
	public static void main(String[] args) {
		
		int arr[]={2,3,13,5,2,45,22,53};
        int n=8;
        InsertionSortFun(arr,n);
        for (int i=0;i<n ;i++ )
         {
         	System.out.print(arr[i]+" ");
        	
        }
	}

	public static  void InsertionSortFun(int arr[],int n)
	  {

	  	for (int out=1;out<n;out++) {
	  		int in =out-1;
            
            if(arr[in]>arr[out])
            {  
            	int index=out;
                int temp=arr[out];
            	while(n>=0)
	  		   {
	  			 if(arr[in]>temp)
	  			 {
	  			 	arr[index]=arr[in];
	  			 	index=in;
	  			 }

	  			 else
	  			 {
                    arr[index]=temp;
                     break;
	  			 }
	  			 in--;
	  		   }
            }
	  		
	  	}
	  }
}