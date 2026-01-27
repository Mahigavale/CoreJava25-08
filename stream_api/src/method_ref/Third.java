package method_ref;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Third {

	public static void main(String[] args) {
		
		//{K=v}
		
//	Map<Integer, String>mp=	List.of("abcd","ssdd","abcdefg","aaaa")
//		.stream()
//		.collect(Collectors.toMap(String::length, String::new , (first, second)->{return second;}));
		
		
//		Map<Integer,List< String>>mp=	List.of("abcd","ssdd","abcdefg","aaaa")
//				.stream()
//				.collect(Collectors.groupingBy((i)->{return i.length();}));
//		
	//System.out.println(mp);
		
		
		
	Map<String,List<Employee>>mp=List.of(new Employee(10,7896,"IT"),new Employee(11,9992,"IT"),new Employee(9,6666,"IT"),new Employee(2,8879.98,"HR")
				,new Employee(90,7777.77,"HR"),new Employee(567,4444,"HR"))
		.stream()
		.collect(Collectors.groupingBy(Employee::getDept));
	
	System.out.println(mp);
	
	
	for(Map.Entry<String, List<Employee>> m: mp.entrySet())
	{
		
		System.out.println("Getting the second heighest salary::::");
		m.getValue().stream()
		.sorted((i,j)->{return Double.compare(i.getSalary(), j.getSalary());})
		.limit(1)
		.skip(1)
		.forEach(System.out::println);
		
	}
	}

}

class Employee
{
	int id;
	double salary;
	String dept;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Employee(int id, double salary, String dept) {
		super();
		this.id = id;
		this.salary = salary;
		this.dept = dept;
	}
	
	public String toString()
	{
		return this.id+" "+this.salary+" "+this.dept;
	}
	
}
