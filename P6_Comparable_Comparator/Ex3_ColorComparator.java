package P6_Comparable_Comparator;

import java.util.Comparator;

public class Ex3_ColorComparator implements Comparator<Car>{

	@Override
	public int compare(Car c1, Car c2) {
		return c1.color.compareTo(c2.color);
	}

}
