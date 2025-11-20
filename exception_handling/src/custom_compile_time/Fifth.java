package custom_compile_time;

public class Fifth {

	public static void main(String[] args) {
		
		
		int age=90;
		try {
		if(age>89)
		{
			throw new DemoRun("hello , Grand person!");
		}
		}
		catch(DemoRun run)
		{
			System.out.println(run.getMessage());
		}
	}

}

class DemoRun extends Exception
{
	public DemoRun(String str)
	{
		super(str);
	}
}
