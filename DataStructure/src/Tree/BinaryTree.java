package Tree;

class Tree
  {
    int data ;
    int datacount;
    Tree left;
    Tree right;
     
    public  Tree(int Data)
      {
        data=Data;
        left=right=null;
        datacount=1;
      }
    
  }

class TreeOpration
   {
      
    Tree te=null;
    Tree ptr=null;
    boolean test=true;
    public void Treeinsert(int data)
        {
             te=new Tree(data);
           
            if(ptr==null)
             {  ptr=te;System.out.println("+++"); }
           else
             {
              Tree temp=ptr;

              while(true)
                 {         
                 	       
                 	       if(data==temp.data)
                 	       	{  temp.datacount++;break;}

                          if(data<temp.data && temp.left!=null)
                                {
                                    temp=temp.left;
                                }
                           if(data>temp.data && temp.right!=null)
                                {
                                    temp=temp.right;
                                }
                           if(data<temp.data && temp.left==null)
                              {temp.left=te;break;}
                           if(data>temp.data && temp.right==null)
                              {temp.right=te;break;} 
                 }
             }                 
        }
    public void TreeDelete(int data)
       {
           //search
          // temp point to delete node , (if delete node have 2 child)go point to left most child
            boolean test=true;
            Tree temp=ptr;
            Tree pre=temp;
         while(temp!=null && test==true)
           {
                              if(data<temp.data )
                                {   
                                    pre=temp;
                                    temp=temp.left;
                                }
                             if(data>temp.data)
                                {   
                                    pre=temp;
                                    temp=temp.right;
                                } 
                             
                              if(data==temp.data)
                                 {    

                                      test =false;

                                      temp.datacount--;
                                 	  if(temp.datacount>=1)
                                 	  {System.out.println("Delete :"+temp.data);break;}

                                   System.out.println("Delete :"+temp.data);
                                   if(temp.left==null && temp.right==null)
                                      {
                                         if(data==pre.left.data)
                                             {
                                               pre.left=null; 
                                             }
                                         if(data==pre.right.data)
                                             {
                                               pre.right=null; 
                                             }
                                      }   
                                      else if(temp.left!=null && temp.right!=null)
                                         {
                                               Tree go=temp.right;
                                               boolean flag=false;
                                                while(go.left!=null)
                                                     {
                                                       pre=go;
                                                       go=go.left;
                                                       flag=true;  
                                                     }
                                                  
                                                    temp.data=go.data;
                                                    
                                                    if(flag==true)//if there is atleast one left most child exist
                                                    pre.left=go.right;
                                                    else// no left most child exist
                                                    temp.right=go.right; 
                                         }
                                     else if(temp.left!=null )
                                      {
                                          pre.left=temp.left;
                                      } 
                                     else if(temp.right!=null)
                                      {
                                          pre.right=temp.right;
                                      }                             

                                 }
                            
           }
                 
           if(test==true)
              {
               System.out.println("No element found !");
              }
                  
       }

  public void infixdisplay(Tree obj)
        {      
               if(obj==null)
                  return;
              
              infixdisplay(obj.left);
              System.out.println(obj.data+"("+obj.datacount+")");
              infixdisplay(obj.right);
        }  
  public void prefixdisplay(Tree obj) 
        {  
             if(obj==null)
                return;
           System.out.println(obj.data+"("+obj.datacount+")");
            prefixdisplay(obj.left);
            prefixdisplay(obj.right);   
        }
  public void postfixdisplay(Tree obj)
        {
              if(obj==null)
                return;    
             postfixdisplay(obj.left);
             postfixdisplay(obj.right); 
             System.out.println(obj.data+"("+obj.datacount+")"); 
        }
    public int findmax(Tree temp)
       {  
       	   if(temp.right==null)
       	   {
       	   	 
       	   	 return temp.data;
       	   }
       	   
       	  return findmax(temp.right);
       }    

    public int findmin(Tree temp)
       {  
       	   if(temp.left==null)
       	   {
       	   	 
       	   	 return temp.data;
       	   }
       	   
       	  return findmax(temp.left);
       }        
   }

public class BinaryTree
      {
         public static void main(String args[])
            {
                TreeOpration to=new TreeOpration();
                to.Treeinsert(2);
                to.Treeinsert(10);
                to.Treeinsert(1);
                to.Treeinsert(9);
                to.Treeinsert(30);
                to.Treeinsert(18);
                to.Treeinsert(31);
                to.Treeinsert(21);
                to.Treeinsert(6);
                to.Treeinsert(5);
                to.Treeinsert(2);
                System.out.println("max number");
                System.out.println( to.findmax(to.ptr));
                System.out.println("min number");
                System.out.println( to.findmin(to.ptr));
                System.out.println("???"); 
                to.infixdisplay(to.ptr);
                System.out.println("???");
                to.TreeDelete(2);
                to.infixdisplay(to.ptr);
                to.TreeDelete(2);
                to.infixdisplay(to.ptr);
                 System.out.println("post???");
                to.postfixdisplay(to.ptr);
                System.out.println("???");
                to.prefixdisplay(to.ptr);
            }        
      }
