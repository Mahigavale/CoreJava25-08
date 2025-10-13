package stringworking;

public class First {

	public static void main(String[] args) {
		
		Employee[] arr= {
		new Employee(1,1234.67),
		new Employee(2,7940.78),
		new Employee(3,45454.67),
		new Employee(4,8989.9)
		};

		Employee[] uss=new Employee[4];
		
		uss[0]=new Employee(1,1000);
		/**
		 * uss[3]=> new Employee(4,5945.78);
		 */
		
	 System.out.println(arr[3].getSalary());
	}
}

class Employee
{
	int id;
	double salary;
	
	public Employee(int id, double salary)
	{
		this.id=id;
		this.salary=salary;
	}
	
	public double getSalary()
	{
		return this.salary;
	}
	
	public int getId()
	{
		return this.id;
	}
}