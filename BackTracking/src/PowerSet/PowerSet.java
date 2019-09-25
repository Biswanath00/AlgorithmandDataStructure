package PowerSet;

import  java.util.*;

public class PowerSet
           {
                 
            public static void main(String[] args) {
            	

            	char set[]={'s','a','b','l'};
            	char setT[]=new char[set.length];
                


               PowerSetFun(0,setT,set);
            }

        public static void display(char setT[] ,int counter,char set[])
            {
                boolean status=false;
         
                   System.out.print("{");
                for (int i=0;i<set.length ;i++ )
                 {
                     if(setT[i]==1)
                       {
                       	System.out.print(set[i]+" ");
                       	status=true;
                       }
               
                 }

    

               if (status==false) 
               {
                  System.out.println("empty}");  	
               }  

               else
               {
               	System.out.println("}");
               }

                
            }

        public static void PowerSetFun(int counter,char setT[],char set[])
        {
               
               if(counter==set.length-1)
               {
                 
                 setT[counter]=0;
                 display(setT,counter,set);
                 setT[counter]=1;
                 display(setT,counter,set);
                 return;
               }

               setT[counter]=0;
               PowerSetFun(counter+1,setT,set);
               setT[counter]=1;
               PowerSetFun(counter+1,setT,set);
           
        }



     }