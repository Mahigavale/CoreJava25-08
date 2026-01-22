package operations;

import java.util.Comparator;
import java.util.List;

public class Third {

	public static void main(String[] args) {
		
		//7,11,12,21,23,43,56,68
		List.of(12,23,11,7,68,56,43,21)
		.stream()
		.sorted((i,j)->(Integer.compare(j, i)))
		.limit(2)
		.skip(1)
		.forEach((i)->{System.out.println(i);});
		
		
		
		
		//2nd heighest salary.
		
	long num=List.of(new Employee(1,"abc",7878),
				new Employee(34,"cdef",8898),
				new Employee(87,"abcd",4454),
				new Employee(89,"xyza",2323))
		.stream()
		.sorted(new SalaryComp())
		.limit(2)
		.count();
		

	System.out.println(num);
	}

}

class
Employee
{
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public String toString()
	{
		return this.name+" ["+this.salary+"]";
	}
}

class SalaryComp implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		return Double.compare(o2.salary, o1.salary);
	}
	
}
