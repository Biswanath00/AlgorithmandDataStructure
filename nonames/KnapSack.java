class Sack
{
	//int obj [];
	int weight[]={1,3,4,5};
	int profit[]={1,4,5,7};
	double ratio[]=new double [4];
	
	double x[]= new double[weight.length];
	int givWt=7;
	double value=0;
	int currWt=givWt;
	int flag;

	void iRatio()
	{

		for(int m = 0;m<weight.length;m++)
	{
		ratio[m]=profit[m]/(double)weight[m];
	}

	}

	int maxProfit()
	{
		double max=-1;
		for(int i=0;i<weight.length;i++)
		{
			if(ratio[i]>max)
			{
				max=ratio[i];
				flag=i;

			}

		}
		ratio[flag]=-1;
		return flag;

	}

	void calcValue(int flag)
	{

		if(currWt-weight[flag]>=0)
		{
			currWt=currWt-weight[flag];
			value=value+profit[flag];
			x[flag]=1;
		}

		 else {
		 	x[flag]=-1;
		 }
	}
}


 class KnapSack
{

	public static void main(String[] args) {
		Sack sk = new Sack();

		sk.iRatio();

 for (int i=0;i<4 ;++i )
          {
           
            	     System.out.println(sk.ratio[i]);	
            	
         }
        System.out.println();
		for(int i=0;i<sk.weight.length;i++)
		{
			int temp=sk.maxProfit();
			System.out.println(temp);
			sk.calcValue(temp);
			

		}
           System.out.println();
         for (int i=0;i<4 ;++i )
          {
            if (sk.x[i]!=-1)
                {
            	     System.out.println(sk.weight[i]);	
            	}	
         }
		System.out.println(sk.value);
			System.out.println(sk.currWt);


	}
}

