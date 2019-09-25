package moalgo;

import java.util.Comparator;

public class MosSort implements Comparator<QueueRange>{

	@Override
	public int compare(QueueRange o1, QueueRange o2) {
		
		if(o1.L/o1.BloSiz<o2.L/o2.BloSiz || (o1.L/o1.BloSiz==o2.L/o2.BloSiz && o1.R<o2.R) )
			return -1;
		
		else 
			return 1;
	}

}
