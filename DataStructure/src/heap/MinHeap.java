package heap;

import java.util.Scanner;

public class MinHeap {
    static int heap[] ;
    static int cap;
    static int size=-1;
    private static int parent(int inx)
    {   if(inx>0)
    	return (inx-1)/2;
       
        return 0;
    }
    private static int leftChild(int inx)
    {
    	return inx*2+1;
    }
    private static int rightChild(int inx)
    {
    	return inx*2+2;
    }
    private static boolean isfull(int inx)
    {
    	if(inx==cap)
    		return true;
    	
    		return false;
    }
    private static boolean isEmpty(int inx)
    {
    	if(inx<0)
    		return true;
    	
    		return false;
    }
    private static void display()
    {
    	for(int i=0;i<=size;i++)
    		System.out.print(heap[i]+" ");
    	System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the capacity of the array :");
		cap=sc.nextInt();
		
		heap = new int[cap];
		for(int i=0;i<cap;i++)
		{
			insert(sc.nextInt());
		}
		display();
       heapsort();
	}
	private static void heapsort() {
		// TODO Auto-generated method stub
		for(int i=0;i<=size;i++)
		{
			//heapfy start from root node
			delete();
			heapfy(0);
		}
	}
	private static void insert(int ele)
	{
		if(isfull(size+1))
       {
    	 System.out.println("Heap overflow");
    	 return;
       }      
	   size++;
	   
	   //insert
	   int up=size;
	   heap[size]=ele;
	   while(up>0 && heap[parent(up)]>ele)
	   {
		 	heap[up]=heap[parent(up)];
		 	up=parent(up);
		 	
		 	
	   }
	  heap[up]=ele; 
	}
	private static void delete()
	{   
		if(isEmpty(size-1))
			{
			System.out.println("Heap is empty");
			return ;
			}
		System.out.println(heap[0]);
		//root element
		heap[0]=heap[size];
		//delete
		
		size--;
		
		
	}
	private static void heapfy(int inx) {
		// TODO Auto-generated method stub
		if( isleaf(inx)==false)
		{
			if((heap[leftChild(inx)]<heap[inx] || heap[rightChild(inx)]<heap[inx]))
			{ 
	           if(heap[leftChild(inx)]<heap[inx])
	          {
	    	   swap(leftChild(inx),inx);
	    	   heapfy(leftChild(inx));
	          }
	          if(heap[rightChild(inx)]<heap[inx])
	          {
	         	swap(rightChild(inx),inx);
	         	heapfy(rightChild(inx));
	          }
			}
		}
	}
	private static boolean isleaf(int inx) {
		// TODO Auto-generated method stub
		if(inx<=size && inx>=(size/2))
			return true;
		
		return false;
	}
	private static void swap(int leftChild, int inx) {
		// TODO Auto-generated method stub
		int temp =heap[leftChild];
		heap[leftChild]=heap[inx];
		heap[inx]=temp;
	}


}
