package ratinamaze;

public  class  RatInAMaze
   {
	  static int Maze[][]={
	  	            {1,1,0},
	  	            {1,1,1},
	  	            {1,1,1}
                   };
       static  int n=3;
      static int  MazeP[][]=new int [n][n];

      static int startx=0,starty=0,endx=2,endy=2;
  
         public static void pathFinder(int x,int y )
         {
                if(x==endx && y==endy)
                         {   
                         	MazeP[x][y]=1;
                        	display();
                        	MazeP[x][y]=0;
                        	return;
                         }

                 if(x>=0 && x<n && y>=0 && y<n && Maze[x][y]==1 && MazeP[x][y]==0)
                 {
                        
                        
                     MazeP[x][y]=1;    
                
                     
                     pathFinder(x+1,y);
                     pathFinder(x-1,y);
                     pathFinder(x,y+1);
                     pathFinder(x,y-1);
                     MazeP[x][y]=0;
                     return;
                 }

                 else 
                 {   
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

   