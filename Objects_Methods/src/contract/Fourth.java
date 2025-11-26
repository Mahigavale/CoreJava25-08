package contract;

public class Fourth {

	public static void main(String[] args) {
		
		
		Demo d=new Demo();
		
		System.out.println(d.equals(12));
		
		/**
		 * Non-nullity.... Object.equals(null) => always return false.
		 */
	}

}


class Demo
{
	public boolean equals(Object obj)
	{
		if(obj==null)
		{
			return false;
		}
		return true;
	}
}