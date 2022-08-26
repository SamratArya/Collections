package P5_PractiseQuestion;

import java.util.HashMap;
import java.util.StringJoiner;

public class Example {
	public static void main(String[] args) {
		
		HashMap<Integer, Employee> hmEmployee=new HashMap<Integer, Employee>();
		Employee employee=new Employee();
		employee.setAddress("assdsds");
		
		int iEmpId=1;
		if(!hmEmployee.containsKey(iEmpId)) {
			hmEmployee.put(iEmpId, employee);
		}
		else {
			employee=hmEmployee.get(iEmpId);
			
		}
	}

}
