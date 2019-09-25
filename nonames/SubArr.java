import java.util.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
		Scanner sc =new Scanner (System.in);
	   int test = sc.nextInt();
	   
	   for(int k=0;k<test;k++)
	   {    
	       
		   int size=sc.nextInt();
		   //to store the element
		   ArrayList<Integer> arr = new   ArrayList<Integer>(size);
		   //to hash element to store init and final index;
		   HashMap<Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>(size,0.9f);
		   //store frq of element
		  HashMap<Integer,Integer> frq= new HashMap<Integer,Integer>(size,0.9f);
           Integer c=0,v=0;
		   for(int i=0;i<size;i++)
		      {
		          int num=sc.nextInt();
		          arr.add(i,num);
		          
		          if(frq.get(num)!=null)
		          {
		          	
		          frq.put(num,1+frq.get(num));
		           ArrayList <Integer> ar=map.get(num);
		           ar.set(1,i);
		           map.put(num,ar);
		          }
		          else
		          {
		              frq.put(num,1);
		           
		              ArrayList<Integer> ar= new ArrayList<Integer>();
		              ar.add(0,i);
		              ar.add(1,-1);
		              map.put(num,ar);
		          }
		      }
		         System.out.println(frq);
		         System.out.println(map);
		         System.out.println(arr);
		      Integer max=0;
		      //list of max frq elements

		      ArrayList <Integer>list =null;
		      for(int i=0,j=0;i<size;i++)
	          {
	              if(frq.get(arr.get(i))>max)
	                {   j=0;
	                    list = new ArrayList <Integer>();
	                    list.add(j,arr.get(i));
	                    max=frq.get(arr.get(i));
	                }
	              else if((frq.get(arr.get(i)))==max && list.contains(arr.get(i))==false)
	                {
	                    j++;
	                    list.add(j,arr.get(i));
	                }
	          }
	                 System.out.println(list);
	          Integer who=0,ele=0;
	          if(list!=null)
	          ele=list.get(0);
	          ArrayList <Integer>li = map.get(list.get(0));
	          if(li.get(1)>0)
	           c = li.get(1);
	           v = li.get(0);
	          who=(c-v)+1;
	          for(int i=1;i<list.size();i++)
	          {
	              
	               li = map.get(list.get(i));
	          if((int)li.get(1)>0)
	          {     c=(int)li.get(1);
	          	    v=(int)li.get(0);
	              Integer x=(c-v)+1;
	              System.out.println(x+" "+i);
	              if(who>x)
	              {
	                  ele=list.get(i);
	                  who=x;
	              }
	          }
	             
	          }
	          for(int i=(int)(map.get(ele)).get(0);i<=(int)(map.get(ele)).get(1);i++)
	          {
	              System.out.print(arr.get(i)+" ");
	          }
	          if(list.size()==arr.size())
		      System.out.print(arr.get(0));
		      System.out.println();
		      
	   }
	 }
}