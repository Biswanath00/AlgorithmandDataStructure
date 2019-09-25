package SumpfPowerset;

import  java.util.*;

public class SumOfPowerSet
           {
                   
            public static void main(String[] args) {
            	

            	int set[]={1,2,3,4,5,6,7,8,9,10,11};
            	int setT[]=new int[set.length];
                
                int value=11;


               PowerSetFun(0,setT,set,value);
            }

        public static void display(int setT[] ,int counter,int  set[],int value)
            {
                boolean status=false;
                int sum=0;
                   
                for (int i=0;i<set.length ;i++ )
                 {
                     if(setT[i]==1)
                       {
          
                       	sum+=set[i];
                       	status=true;
                       }
                  
                 }

                  if(sum==value)
                    {
                    	System.out.print("{");
                    	for (int i=0;i<set.length ;i++ )
                          {
                     if(setT[i]==1)
                       {
                       	System.out.print(set[i]+" ");
                    
                       }
                  
                         }
                         System.out.println("}");
                    }
                   
                 sum=0;

            


                
            }

        public static void PowerSetFun(int counter,int setT[],int set[],int value)
        {
               
               if(counter==set.length-1)
               {
                 
                 setT[counter]=0;
                 display(setT,counter,set,value);
                 setT[counter]=1;
                 display(setT,counter,set,value);
                 return;
               }

               setT[counter]=0;
               PowerSetFun(counter+1,setT,set,value);
               setT[counter]=1;
               PowerSetFun(counter+1,setT,set,value);
           
        }



     }