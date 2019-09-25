package mergesort;



    import  java.util.*;

    public  class MergeSort
             {
             	 
             	public static void main(String[] args)
                {
                	int arr[]={34,6,32,66,2,3,0};
                	int p=0;
                	int r=6;
                	for (int i=0;i<=r ;i++ ) {
        			System.out.print(arr[i]+" ");
        		}
                	
                  MERGESORT(arr,p,r);
                  System.out.println();
                  for (int i=0;i<=r ;i++ ) {
        			System.out.print(arr[i]+" ");
        		}
             		
             	}
            public static void MERGESORT(int arr[],int p,int r)
            {
            	if(p<r)
            	{
                 int q=(p+r)/2;
                 MERGESORT(arr,p,q);
                 MERGESORT(arr,q+1,r);
                 MERGE(arr,p,q,r);
                }
            }
            public static void MERGE(int arr[],int p,int q,int r)
            {
              int n1=q-p+1;
              int n2=r-q;
              int L[]=new int[n1];
              int R[]=new int [n2];
              
              for (int i=0;i<n1;i++ )
               {

                L[i]=arr[p+i];
                System.out.println(n1 +"  "+n2);	
               }
               
               for (int j=0;j<n2 ;j++) {
               	R[j]=arr[j+q+1];
               }
                
                int j=0,i=0,k=p;
               while(i< n1 && j<n2) {
               	
               	if(L[i]<=R[j] )
               	{
               		arr[k]=L[i];
               		i++;
               		
               	}
               	else 
               	{
               		arr[k]=R[j];
               		j++;
               		
               	}
               	k++;
               }
               while(i<n1)
               {
               	arr[k]=L[i];
               		i++;
               		k++;
               }
               while(j<n2)
               {
                    arr[k]=R[j];
               		j++;
               		k++;
               }
            }
            }
