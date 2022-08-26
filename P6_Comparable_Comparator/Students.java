package P6_Comparable_Comparator;

public class Students implements Comparable<Students>{
	
	String name;
	String address;
	int age;
	
	public Students(String name,String address,int age) {
		this.name=name;
		this.address=address;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Students s1) {
		if(this.age>s1.age)
		{
			return 1;
		}
		else if(this.age<s1.age)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
	

}
