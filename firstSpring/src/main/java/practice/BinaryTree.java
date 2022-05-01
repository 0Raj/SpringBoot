package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class BinaryTree {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		Employee myEmp = new Employee(1, "Raj", "Chennai", 60000);
//		
//		List<Employee> list = new ArrayList<>();
//		
//		list.add(myEmp);
//		list.add(new Employee(2, "Ram", "Bangalore", 80000));
//		list.add(new Employee(2, "Ram", "Bangalore", 80000));
//		list.add(new Employee(2, "Ram", "Bangalore", 80000));
//		list.add(new Employee(2, "Ram", "Bangalore", 80000));
//		
//		Object[] or= list.toArray();
//		Collections.sort(list,(a,b)->{
//			return b.getSalary()>a.getSalary() ? 1: -1;
//		});
		
		//Collections.sort(list);
		
		Employee e1=new Employee(10,"Ram","Chennai",500);
		Employee e2=new Employee(10,"Ram","Chennai",500);
		
		Set<Employee> employees = new HashSet<>();
		employees.add(new Employee(10,"Ram","Chennai",500));
		employees.add(new Employee(12,"Vishnu","Chennai",600));
		employees.add(new Employee(10,"Ram","Chennai",500)); //duplicate object
		employees.add(new Employee(14,"Srinu","Chennai",600));
		System.out.println(e1.equals(e2));
		
		System.out.println(employees.size());
		System.out.println(employees);
		System.out.println(Objects.hash(e1.getEmpAdress(), e1.getEmpId(), e1.getEmpName(), e1.getSalary()));
		System.out.println(Objects.hash(e2.getEmpAdress(), e2.getEmpId(), e2.getEmpName(), e2.getSalary()));
		//System.out.println(Arrays.toString(or));
		
		
	}
}
