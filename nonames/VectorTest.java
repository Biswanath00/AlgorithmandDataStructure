import java.util.*;


     public class VectorTest{


     	public static void main(String[] args) throws Exception {
     		@SuppressWarnings("unchecked")
     		Vector <Vector<Integer>>  v  = new Vector<Vector<Integer>>(10);

     		for(int i=0;i<10;i++)
     		{  Integer x = new Integer(10);
     		    
     		    Vector<Integer> v2 =new Vector<Integer>();
     		    v2.addElement(10);
     		     v2.addElement(20);
     			v.add(i,v2);
     			
     		}
     		for(int i=0;i<10;i++)
     		{
     			
     			System.out.println(v.get(i));
     		}
     	}
     }