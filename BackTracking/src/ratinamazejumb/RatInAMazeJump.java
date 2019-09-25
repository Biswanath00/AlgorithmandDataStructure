package ratinamazejumb;

public  class  RatInAMazeJump
   {
	  static int Maze[][]={
	  	            {2,1,0,0},
	  	            {3,0,0,1},
	  	            {0,1,0,1},
                    {0,0,0,1}
                   };
       static  int n=4;
      static int  MazeP[][]=new int [n][n];

      static int startx=0,starty=0,endx=3,endy=3;
      static int count;
         public static void pathFinder(int x,int y )
         {
              
               
                if(x==endx && y==endy)
                         {   
                         	MazeP[x][y]=1;
                        	display();
                        	MazeP[x][y]=0;
                        	return;
                         }

                 if(x>=0 && x<n && y>=0 && y<n && Maze[x][y]>=1 && MazeP[x][y]==0)
                 {
                        
                        
                     
                     count=Maze[x][y];
                     while(count>=1)
                     {
                      MazeP[x][y]=1;    
                    
                     pathFinder(x+count,y);
                
                     pathFinder(x-count,y);
                    
                     pathFinder(x,y+count);
                     
                     pathFinder(x,y-count);
                     MazeP[x][y]=0;
                     count--;
                     }
                    
                    return;
                 }

                 else if(count>1 && x>=0 && x<n && y>=0 && y<n )
                 {   
                      count--;
                     pathFinder(x+count,y);
        
                     pathFinder(x-count,y);
                     
                     pathFinder(x,y+count);
                    
                     pathFinder(x,y-count);
                    
                 	return ;
                 }
                    
         }
           public static void display()
            {
            	for (int i=0;i<n ;i++ )
            	 {
            	 for (int j=0;j<n ;j++ )
            	    {    
            	    	if(MazeP[i][j]==1)
            	 		System.out.print("("+i+","+j+")"+" ");
            	 	}	          
            	 }
            	 System.out.println();
            }
            public static void main(String[] args) {
            
             pathFinder(startx,starty);
             display();
            }
      }

   