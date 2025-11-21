package throwskeyword;

public class Second {

	public static void main(String[] args) throws Exception{
		
		Demo demo=new Demo(12);
	}

}
class Demo
{
	
	public Demo() throws Exception
	{
		throw new Exception("HEllo");
	}
}

class Demo_1 extends Demo
{
	public Demo_1() throws Exception
	{
		super();
	}
	
}