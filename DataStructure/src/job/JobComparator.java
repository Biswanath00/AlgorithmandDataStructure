package job;

import java.util.Comparator;

public class JobComparator implements Comparator<Job>{

	@Override
	public int compare(Job o1, Job o2) {
		// TODO Auto-generated method stub
		if(o1.profit<o2.profit)
			return 1;
		else if(o1.profit>o2.profit)
			return -1;
		return 0;
	}

}
