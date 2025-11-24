package throwskeyword;

public class Error_1 {

	public static void main(String[] args) {
		
		
		for(long i=0l;i<5000000000l;i++)
		{
			Student st=new Student((int)i,"AAAA"+i,"EEEEE"+i,"CCCC"+i, new int[] {34,56,765344,343,223});
		}
		
		
		
	}

}


class Student
{
	int id;  //4b
	String name; //40b
	String email; //40b
	String course;
	int[] nums;
	public Student(int id, String name, String email, String course, int[] nums)
	{
		this.id=id;
		this.name=name;
		this.email=email;
		this.course=course;
		this.nums=nums;
	}
}