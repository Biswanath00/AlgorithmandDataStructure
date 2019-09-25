package nqueen;


import  java.util.*;

     public class Nqueen
     {
            
      static  int sizex,sizey,n;
      static  int chess[][];
      static  int counter=0,displayn=0;
      static  boolean row,col,dig,dis=true;  
   
        public static void main(String[] args)
         {
         	Scanner sc =new Scanner(System.in);

            System.out.println("Enter N Queen :"); 	
            n=sc.nextInt();
            sizey=sizex=n;
            chess=new int[sizex][sizey];
         	insert(0,0,n);
         
            System.out.println(displayn);
         } 
     	public static void  insert(int x,int y,int n)
     	   {

     	   	 if(y<sizey && x<sizex )
     	   	 {
     	   	 boolean proc=check(x,y);
     	   	         
              if (proc==false) 
              {
              counter++;
              chess[x][y]=1;
             
              insert(x+1,0,n);
              }
              else
              {
                insert(x,y+1,n);  
                     	
              }
              //if find a complect soln N
              if (counter==n)
               {
               	display();
              	counter--;
              	chess[x][y]=0;
              	insert(x,y+1,n);
               }
               //go back and Try from last soln 
               if (chess[x][y]==0) 
               {  
               	  return;
               }
               //this is  last soln (Here we try to find  another soln and then move on)
               else
               {
               	chess[x][y]=0;
               	counter--;
               	insert(x,y+1,n);
               	
               }  
               	return; 
               
     	     }
     	    }
     	public static boolean check(int x,int y)
     	   {
     	   	   
     	   	   int x1=x,y1=y;
     	   	   
     	   	    while (x1<sizex && y1<sizey) 
     	   	    {
     	   	    	if (chess[x1++][y1++]==1) 
     	   	    	{
     	   	    		return true;
     	   	    	}
     	   	    }
     	   	   	x1=x;y1=y;
     	   	   	while (y1<sizey) 
     	   	    {
     	   	    	if (chess[x1][y1++]==1) 
     	   	    	{
     	   	    		return true;
     	   	    	}
     	   	    }
     	   	    y1=y;
     	   	    while (x1<sizex) 
     	   	    {
     	   	    	if (chess[x1++][y1]==1) 
     	   	    	{
     	   	    		return true;
     	   	    	}
     	   	    }
     	   	    x1=x;

     	   	    while (x1>-1 && y1>-1) 
     	   	    {
     	   	    	if (chess[x1--][y1--]==1) 
     	   	    	{
     	   	    		return true;
     	   	    	}
     	   	    }
     	   	   	x1=x;y1=y;
     	   	   	while (y1>-1) 
     	   	    {
     	   	    	if (chess[x1][y1--]==1) 
     	   	    	{
     	   	    		return true;
     	   	    	}
     	   	    }
     	   	    y1=y;
     	   	    while (x1>-1) 
     	   	    {
     	   	    	if (chess[x1--][y1]==1) 
     	   	    	{
     	   	    		return true;
     	   	    	}
     	   	    }
     	   	    x1=x;

     	   	    while (x1>-1 && y1<sizey) 
     	   	    {
     	   	    	if (chess[x1--][y1++]==1) 
     	   	    	{
     	   	    		return true;
     	   	    	}
     	   	    }
     	   	    x1=x;y1=y;
     	   	    while (x1<sizex && y1>-1) 
     	   	    {
     	   	    	if (chess[x1++][y1--]==1) 
     	   	    	{
     	   	    		return true;
     	   	    	}
     	   	    }
              
     	   	    return false;
     	   }

     	   public static void display()
     	   {

     	   	for (int i=0;i<sizex ;i++ ) 
     	   	{
     	   		
     	   		for (int j=0;j<sizey ;j++ ) 
     	   		{
     	   	          if(chess[i][j]==1)
     	   	           System.out.print("( "+i+","+j+") ");		
     	   		}
     	   	}
     	   	System.out.println();
     	   	displayn++;
     	   }
     	

     }