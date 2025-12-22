package setif;

import java.util.Comparator;
import java.util.TreeSet;

public class Employee_Set {

	public static void main(String[] args) {
		
		TreeSet<Employee> set=new TreeSet<Employee>(new SalaryComparator());
		
		
		set.add(new Employee(13456.56,"IT","JOHN"));
		set.add(new Employee(13457.56,"HR","JOHNY"));
		set.add(new Employee(13455.56,"ACC","JOHNAnson"));
		set.add(new Employee(13455.56,"MAr","JO"));
		System.out.println(set);

	}

}
class Employee
{
	 double salary;
	 String dept;
	 String name;
	 public Employee(double salary, String dept, String name) {
		super();
		this.salary = salary;
		this.dept = dept;
		this.name = name;
	 }
	 
	 
	 public String toString()
	 {
		 return this.dept+" "+this.salary+" "+this.name;
	 }
}

class SalaryComparator implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2) {
		return Double.compare(o1.salary, o2.salary);
	}
}
