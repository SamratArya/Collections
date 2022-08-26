package P6_Comparable_Comparator;

import java.util.Comparator;

public class Ex2_BrandComparator implements Comparator<Car>{

	@Override
	public int compare(Car c1, Car c2) {
		return c1.brand.compareTo(c2.brand);
	}

}
