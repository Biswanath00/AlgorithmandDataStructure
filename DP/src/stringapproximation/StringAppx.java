package stringapproximation;


 class  StringOP
   {
 	 char str1[],str2[];
 	 int arr[][],insert=0,replace=0,remove=0;

 	 public StringOP(String s1,String s2)
 	   {
 	   	  str1=s1.toCharArray();
 	   	  str2=s2.toCharArray();
 	   	  arr=new int[s2.length()+1][s1.length()+1];
 	   	 
 	   }

 	  public void ReDeInOperation()
 	    {
 	    	if(str2.length==0)
 	    	{
 	    		System.out.println("operation ="+str1.length+" \ninsert="+str1.length);
 	    		return;
 	    	}
 	  
 	    	for (int i=0; i<=str1.length; i++) 
 	    	{
 	    	   arr[0][i]=i;	
 	    	}
 	    	for (int i=0; i<=str2.length; i++) 
 	    	{
 	    	   arr[i][0]=i;	
 	    	}

 	    	for (int i=0;i<str2.length ; i++ )
 	    	 {
 	    	    for (int j=0;j<str1.length ;j++ )
 	    	        { 
 	    	        

 	    	        	 if (str1[j]==str2[i] ) 
 	    	        	{
 	    	        		arr[i+1][j+1]=arr[i][j];
 	    	        	}
 	    	    		else if(str1[j]!=str2[i])
 	    	    		{
 	    	    			int min=min(arr[i][j],arr[i+1][j],arr[i][j+1]);
 	    	    			arr[i+1][j+1]=min;
 	    	    		}
 	    	    	    if (i==j) 
 	    	    		{
 	    	    			if(str1[i]!=str2[j])
 	    	    				replace++;
 	    	    		}
 	    	    

 	    	    	}	
 	    	 }
 	    if (str2.length>str1.length) 
 	         {
 	    	    insert=str2.length-str1.length; 	
 	    	 }	 
 	    	 else
 	    	 {
 	    	 	remove=str1.length-str2.length;
 	    	 }

 		 System.out.println("operation : "+arr[str2.length-1][str1.length-1]+" \nreplace="+replace+"\n insert="+insert+"\n remove="+remove);
 	    }
   public int min(int Insert,int Remove,int Replace)
     {
           int min;
           boolean flag1=false;
           if(Insert < Remove)
           	{
           		min=Insert;
           
            }
           else
           {
           	min=Remove;
           }
           if (min>Replace)
            {
           	min=Replace;
            }
            return  min +1;
     }
   }

   public class StringAppx
    {

    	public static void main(String[] args) {
    		StringOP ob=new StringOP("abcfgl","adcegl");//(string,compairing String)
    		ob.ReDeInOperation();
    	}
    }
