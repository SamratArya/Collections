package P5_PractiseQuestion;

import java.io.Serializable;

public class Employee implements Serializable{
	
	String name;
	String address;
	int age;
	String id;
	
	public Employee(String name,String address,int age,String id) {
		this.name=name;
		this.address=address;
		this.age=age;
		this.id=id;
	}

	public Employee() {
		
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String toString()
	{
		return "Name is "+name+" Address is "+address+" Age is "+age+" Id is "+id;
	}

}
