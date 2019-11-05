package StringPermutation;


public  class StringPer
  {
     
  	public static void main(String[] args) {
  		 char arr[]={'d','a','t','a'};
  		 
  		Permutation(0,arr);

  	}

  	public static void Permutation(int count,char arr[])
  	 {  
  	 	
  	 	if(count==arr.length)
  	 	 {  
            String str=new String(arr);
  	 	 	System.out.println(arr);
  	 	 	return ;
         }
        
        for(int i=count ;i<arr.length;i++)
        {
        	swap(i,count,arr);
        	Permutation(count+1, arr);
        	swap(i,count,arr);
        }
  	 }

  	 public static void swap(int x,int y,char arr[])
  	   {
  	   	  char tmp=arr[y];
  	   	  arr[y]=arr[x];
  	   	  arr[x]=tmp;

  	   }
  }