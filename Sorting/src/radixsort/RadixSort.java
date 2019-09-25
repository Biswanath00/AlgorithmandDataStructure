package radixsort;

import java.util.*;
import java.lang.Math;

public class RadixSort  {
    static  int  setInt[]={344,245,245,352,445,222,463,345,553,131};
  
      static  int   start=0,end=9,max;
     
     	

    static  int  tempInt[][]=new int[end+1][end+1];
    public static void main(String[] args) 
  {
      max=findMax();
      findDigit();
       display();
     
      
     
  }

  public static int findMax()
    {   int max=setInt[0];
    	for (int i=start+1;i<=end ;++i ) {
    		if(max<setInt[i])
    		   max=setInt[i];
    	}

    	return max;
    }

   public static void findDigit()
   {
  
   	int inx=0;
          
          while (max>0) {

          	max=max/10;
          	inx++;
          	

          	RadixSortFun(inx);
          	
          }

   }

   public static  void RadixSortFun(int inx)
     {
 
         int  frq[]=new int [10];
         int  output[]=new int [end+1];
         int  exp=(int)Math.pow(10,inx-1);
         int  mul=10;
     	for (int i=0;i<=end ;i++) {

     		int index=(setInt[i]/exp)%(mul);
     
     		frq[index]++;    		
     	}
     	for (int i=1;i<=9 ;i++ ) {

             frq[i]=frq[i]+frq[i-1];
     		
     	}

     	for (int i=end;i>=0 ;i-- )
     	 {
              
     	 	  output[frq[(setInt[i]/exp)%(mul)]-1]=setInt[i];
     	 	  frq[(setInt[i]/exp)%(mul)]--;
     		
     	 }

     	 for (int i=0;i<=end ; i++) {

     	 	setInt[i]=output[i];
     	 }


     }

     public static  void display()
     {
     	for (int i=0;i<=end ;i++ ) 
     	{
     	  System.out.print(setInt[i]+" ");	
     	}
     }

	
}
















