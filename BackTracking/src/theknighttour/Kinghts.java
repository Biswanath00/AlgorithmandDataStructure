package theknighttour;

public  class Kinghts
 {
   static int n=8;
   static int  inparr[][]=new int[n][n],count=0;

 

   public static void KinghtsTour(int x,int y)
     {

             
              if ( x>=0 && x<n && y>=0 && y<n) 
              {
                if(inparr[x][y]==0)
                {
                inparr[x][y]=++count;
              
               KinghtsTour(x+2,y+1);
              if (count==n*n)
               {
                 return; 
               }
              KinghtsTour(x+1,y+2);
              if (count==n*n)
               {
                 return; 
               }
              KinghtsTour(x-1,y+2);
              if (count==n*n)
               {
                 return; 
               }
              KinghtsTour(x-2,y+1);
              if (count==n*n)
               {
                 return; 
               }
              KinghtsTour(x-2,y-1);
              if (count==n*n)
               {
                 return; 
               }
              KinghtsTour(x-1,y-2);
              if (count==n*n)
               {
                 return; 
               }
              KinghtsTour(x+1,y-2);
              if (count==n*n)
               {
                 return; 
               }
              KinghtsTour(x+2,y-1);
              if (count==n*n)
               {
                 return; 
               }
              inparr[x][y]=0;
              count=count-1; 
              }
         }  
     }
     public static void main(String[] args) {
     	
     	KinghtsTour(0,7);
      System.out.println();
     	 display();
     }

     public static void display()
     {
     	for (int i=0;i<n ;i++ )
     	 {
     	   for (int j=0;j<n ;j++ )
     	    {
     	    System.out.print(inparr[i][j]+" ");		
     	   	}
     	   	System.out.println();	
     	 }
     	 System.out.println();
     }
 }