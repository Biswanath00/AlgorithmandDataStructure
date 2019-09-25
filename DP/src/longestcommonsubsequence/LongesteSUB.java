package longestcommonsubsequence;

import java.util.Scanner;

class Longest
 {
    int memorize[][];
    public Longest(int m,int n)
    {
    	memorize=new int[m+1][n+1];
    }
    
    public int LCS(String s1,String s2,int m,int n)
    {     
    	if(m==0 || n==0)
    		{
    		memorize[m][n]=0;
    		return 0;
    		}
    	if(s1.charAt(m-1)==s2.charAt(n-1))
    		return memorize[m][n]=1+LCS(s1,s2,m-1,n-1);
    	else
    		return memorize[m][n]=Math.max(LCS(s1,s2,m-1,n), LCS(s1,s2,m,n-1));
    }
 }
public class LongesteSUB {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter s1");
		String s1=sc.next();
		String s2=sc.next();
		int m=s1.length();
		int n=s2.length();
		Longest obj = new Longest(m, n);
		System.out.println(obj.LCS(s1, s2, m, n));
		for(int i=0;i<=m;i++)
			{
			for(int j=0;j<=n;j++)
		    	{
				 System.out.print(obj.memorize[i][j]+" ");
			    }
			System.out.println();
			}
			sc.close();	
	}

}
