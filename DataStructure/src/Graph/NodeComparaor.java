package Graph;

import java.util.Comparator;

public class NodeComparaor implements Comparator<Node> {

	@Override
	public int compare(Node obj1, Node obj2) {
		// creating min heap on the basis of weight of the edge
		if( obj1.weight>obj2.weight)
			return 0;
		else if( obj1.weight<obj2.weight)
			return -1;
		else
			return 0;
			
	}

}
