package P6_Comparable_Comparator;

import java.util.Comparator;

public class Ex4_TypeComparator implements Comparator<Car>{
	@Override
	public int compare(Car c1, Car c2) {
		return c1.type.compareTo(c2.type);
	}


}
