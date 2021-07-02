package collection;

import java.util.Comparator;

public class ColgnameComparator implements Comparator<College>{

	@Override
	public int compare(College o1, College o2) {
	
	return	o1.code.compareTo(o2.code);
		
	}

	

}
