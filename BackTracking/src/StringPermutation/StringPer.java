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
        
         Permutation(count+1,arr);
         int add=1;
         while(count+add<arr.length)
         	 {
               swap(count,count+add,arr);
         	   Permutation(count+1,arr);
         	   swap(count,count+add,arr);
         	   add++;
         	 }

  	 }

  	 public static void swap(int x,int y,char arr[])
  	   {
  	   	  char tmp=arr[y];
  	   	  arr[y]=arr[x];
  	   	  arr[x]=tmp;

  	   }
  }