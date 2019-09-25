package Sudoku;

import  java.util.*;


  class Sudoku 
      {
                 
         int sudoku[][]=
                       {
                    {8, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 3, 6, 0, 0, 0, 0, 0},
					{0, 7, 0, 0, 9, 0, 2, 0, 0},
					{0, 5, 0, 0, 0, 7, 0, 0, 0},
					{0, 0, 0, 0, 4, 5, 7, 0, 0},
					{0, 0, 0, 1, 0, 0, 0, 3, 0},
					{0, 0, 1, 0, 0, 0, 0, 6, 8},
					{0, 0, 8, 5, 0, 0, 0, 1, 0},
					{0, 9, 0, 0, 0, 0, 4, 0, 0}

                       };
         int user ,input,value;
         boolean stu=false;
     

       /* public void insert()
                 {
                 	 Scanner sc=new Scanner(System.in);
                     System.out.println("Enter the total input : ");
                     user=sc.nextInt();
                    
                 	 for (int i=0;i<user ; i++)
                 	  {
                 	    System.out.println("Enter the postion  :" );
                        input=sc.nextInt();
                        System.out.println("Enter the value :");
                        value=sc.nextInt();
                        if((input%9)!=0)
                         sudoku[input/9][input%9-1]=value;
                        else if(input%9==0)
                         sudoku[(input/9)-1][input/9-1]=value;
                        
                  	  } 
                 }*/
        public  void displaySudoku()
               {
               	for (int i=0;i<9 ;i++ ) 
               	{
               		
                 for (int j=0;j<9 ;j++ ) 
                  {
                   System.out.print(sudoku[i][j]+" ");	
                  }
                  System.out.println();
               	}
               	System.out.println();   
               }
             

        public boolean  checkSudoku(int x,int y,int value)
              {

              	int x1=x,y1=y;
               
                x1--;
                while(x1>=0)
              	{
              		if(sudoku[x1--][y1]==value)
              			return true;

              	}

              	x1=x; 
                y1--;
              while(y1>=0)
              	{
              		if(sudoku[x1][y1--]==value)
              			return true;

              	}

                y1=y;
                x1++;

              	while(x1<9)
              	{
              		if(sudoku[x1++][y1]==value)
              			return true;

              	}

              	x1=x;
              	y1++;

              	while(y1<9)
              	{
              		if (sudoku[x1][y1++]==value) 
              		{	
              		    return true;	
              		}
              	}

               y1=y;
              	
              	if(x1<=2)
              	{
                   if (y1<=2)
                    {
                   	   for (int i=0;i<=2 ;i++ )
                   	    {
                   	   	 for (int j=0;j<=2 ;j++ ) 
                   	   	 {
                      	 	if (sudoku[i][j]==value) 
              		       {	
              		          return true;	
              		       }
                   	   	 }
                   	   }
                    }


                    /////////////////////////////////////
                   else if (y1<=5)
                    {
                   	   for (int i=0;i<=2 ;i++ )
                   	    {
                   	   	 for (int j=3;j<=5 ;j++ ) 
                   	   	 {
                      	 	if (sudoku[i][j]==value) 
              		       {	
              		          return true;	
              		       }
                   	   	 }
                   	   }
                    }

                   else if (y1<=8)
                    {
                   	   for (int i=0;i<=2 ;i++ )
                   	    {
                   	   	 for (int j=6;j<=8 ;j++ ) 
                   	   	 {
                      	 	if (sudoku[i][j]==value) 
              		       {	
              		          return true;	
              		       }
                   	   	 }
                   	   }
                    }
                       
              	}
//---------------------------------------------------------------------------------------------------

              else	if(x1>2 && x1<=5)
              	{
                   if (y1<=2)
                    {
                   	   for (int i=3;i<=5 ;i++ )
                   	    {
                   	   	 for (int j=0;j<=2 ;j++ ) 
                   	   	 {
                      	 	if (sudoku[i][j]==value) 
              		       {	
              		          return true;	
              		       }
                   	   	 }
                   	   }
                    }


                    /////////////////////////////////////
                  else  if (y1<=5)
                    {
                   	   for (int i=3;i<=5 ;i++ )
                   	    {
                   	   	 for (int j=3;j<=5 ;j++ ) 
                   	   	 {
                      	 	if (sudoku[i][j]==value) 
              		       {	
              		          return true;	
              		       }
                   	   	 }
                   	   }
                    }

                  else if (y1<=8)
                    {
                   	   for (int i=3;i<=5 ;i++ )
                   	    {
                   	   	 for (int j=6;j<=8 ;j++ ) 
                   	   	 {
                      	 	if (sudoku[i][j]==value) 
              		       {	
              		          return true;	
              		       }
                   	   	 }
                   	   }
                    }
                       
              	}
//---------------------------------------------------------------------------------------------------

              	else if(x1>5 && x1<=8)
              	{
                   if (y1<=2)
                    {
                   	   for (int i=6;i<=8 ;i++ )
                   	    {
                   	   	 for (int j=0;j<=2 ;j++ ) 
                   	   	 {
                      	 	if (sudoku[i][j]==value) 
              		       {	
              		          return true;	
              		       }
                   	   	 }
                   	   }
                    }


                    /////////////////////////////////////
                   else if (y1<=5)
                    {
                   	   for (int i=6;i<=8 ;i++ )
                   	    {
                   	   	 for (int j=3;j<=5 ;j++ ) 
                   	   	 {
                      	 	if (sudoku[i][j]==value) 
              		       {	
              		          return true;	
              		       }
                   	   	 }
                   	   }
                    }

                  else if (y1<=8)
                    {
                   	   for (int i=6;i<=8;i++ )
                   	    {
                   	   	 for (int j=6;j<=8 ;j++ ) 
                   	   	 {
                      	 	if (sudoku[i][j]==value) 
              		       {	
              		          return true;	
              		       }
                   	   	 }
                   	   }
                    }
                       
             }
              	return false;

           }              	
              	
             



   public void solveSudoku(int x,int y,int value)
      {
           

           if (x<=8)
            {

            	if (value>9) 
            	{
            		return;
            	}

              if (y>=9) 
            	{   
            		
            	   	solveSudoku(x+1,0,1);
            		return;
               	  
            	}

            	if (sudoku[x][y]==0) 
            	{


            		boolean stu =checkSudoku(x,y,value);

            		if (stu==true)
            		 {
            			solveSudoku(x,y,value+1);
            	      
            		 }
            		 else
            		 {
            		 	sudoku[x][y]=value;
            		 	solveSudoku(x,y+1,1);
            		 	sudoku[x][y]=0;
            	        solveSudoku(x,y,value+1);
            		 
            		 }
                    
            		
            	}
            	else
            	 { 
            	   solveSudoku(x,y+1,1);
            	 
                 }
           	
            }

              
           if (x>8) {

          	displaySudoku();
            java.lang.System.exit(0) ;
            } 
    
      }

     }

 public  class SudokuApp
             {
             	public static void main(String[] args)
             	 {
             	    Sudoku su =new Sudoku();
             	 //   su.insert();
             	    su.displaySudoku();
             	    su.solveSudoku(0,0,1);
             	    System.out.println(su.checkSudoku(0,5,1));
             	  	su.displaySudoku();
             	 }
             }