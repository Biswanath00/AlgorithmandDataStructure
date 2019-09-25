package countongsort;

public  class CountSort
            {
            	public static void main(String[] args) {
            		
            		int arr[]={1,3,2,9,1,4,6,543,5,22,7};
            		int p=9,max=0;
            		for(int i=0;i<=p;i++)
            		{
            			if(max<arr[i])
            				max=arr[i];

            		}
            		int frq[]=new int [max+1];
            		QuickSortFun(arr,frq,p,max);
            		for(int i=0;i<=p ;++i) {
                         	System.out.print(arr[i]+" ");
                         }
            	}



               public static  void QuickSortFun(int arr[],int frq[],int p,int max)
                  {
                         for (int i=0;i<=p ;i++ ) {
                         	 int temp=arr[i];
                         	 
                         	 frq[temp]=frq[temp]+1;
                         }

                              for (int i=0,k=0;i<=max ;i++ ) {
                            	if(frq[i]!=0)
                            	{
                            		int j=frq[i];
                            		while (j>0) {
                            			
                            			arr[k]=i;
                            			k++;
                            			j--;
                            		}

                            	}
                            }
                         } 

                         
                  }
            