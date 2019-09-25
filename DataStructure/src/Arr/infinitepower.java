package Arr;

import java.util.*;

   class InfinitePower 
           {

           public static void main(String[] args) 
             {
           	   
                Scanner sc = new Scanner(System.in);

                int t=sc.nextInt();

                while(t>=1 && t<=1000000000)
                	 {
                	 	t--;
                	 	int x=sc.nextInt();
                     solve(x);    
                	 }
             }
        public static void solve(int x )
            {

            	int count= countDigit(x);
              System.out.println(count);
                int arr [] =new int [count];
                boolean check =true;
                int ng=0,nl=0;
                int mark=0;
            	for(int i=count-1;i>=0;i--)
            	{
            		arr[i]=x%10;
            		if(arr[i]%2!=0)
            			{
            				check=false;
            				mark=i;
            			}
            		x/=10;
            	}

            	if(check==true)
            	{
            		System.out.println("Ultimate Power");
            	}
            	else
            	  {
                     for(int i=mark;i<count;i++)
                     {
                     	int temp=arr[i]+1;
                      //System.out.println(temp);
                       // if(temp==10 && arr[i]%2!=0)
                          //{
                            ng=handelerNg(arr,mark,count); 
                            nl=handelerNl(arr,mark,count);
                          	break;
                         // }
                      //  else if(arr[i]%2!=0)
                      //  	arr[i]=temp;
                      
                     }
                    System.out.println(ng+"/"+nl);

            	  }	

            }
        public static int  handelerNg(int arr[],int mark,int count)
              {
              	    int flag_fill_2 =0;
                   //fill right side with 0  (6898 ------> 6800)
                    for(int i = mark ; i<count ; i++)
                    	 {
                    	 	arr[i]=0;
                    	 }
                    // handel left side with appropiate value
                    for(int i = mark-1 ; i>=0 ; i--)
                      {
                            int x = arr[i]+2;
                            if(x==10)
                            	arr[i]=0;
                            if(i-1<0 && x==10)
                      	     flag_fill_2 =2;
                      	    if(x!=10)
                      	    {
                      	    	arr[i]+=2;
                      	    }
                      }	 

                    String str = myToString(arr,count);
                    if (mark-1<0) {
                      if(flag_fill_2==2)
                    str=flag_fill_2+str;
                    }
                    int value=Integer.parseInt(str);
                    
                    
                   System.out.println(str);
                    return  value;

              }
        public static int handelerNl(int arr[],int mark,int count)
              {
                 int flag = 0;
              	for(int i=mark;i<count;i++)
              		 {
              		 	
              		 	if(arr[i]%2!=0 | flag == 1)
              		 		{    
              		 			if(arr[i]-1==0 && flag == 0)
              		 			 {
              		 			 	arr[i]-=1;
              		 			 	flag=2;
                                 }
                                 else
                                 {
                                 	arr[i] = 8;
                                 }
                            }
              		 }
              		 String str = myToString(arr,count);
                     int x =  Integer.parseInt(str);
                return x;
              }
      public static int countDigit(int x)
         {
                int count=0;
            while(x>0)
            {
             x/=10;
             count++;
            }
            return  count;
         }
      public static String myToString(int arr [] ,int count)
          {
                    String str ="";
                        for(int i=0;i<count;i++)
                            str=arr[i]+str;
                    return str;
          }                 

           }