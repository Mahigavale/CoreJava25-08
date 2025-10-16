package logical;

public class First {

	public static void main(String[] args) {
		//"WELCOME" => "WeLCoMe"
		//"HELLO"=> "HeLLo"

		
		String str="WELCOME";
		
		
		StringBuffer sb=new StringBuffer(str);
		
		int size=sb.length();
		System.out.println(size);
		int counter=0;
		
		System.out.println(new StringBuffer(sb.charAt(1)).toString().toLowerCase());
		
		
		for(int i=0;i<sb.length();i++){
		{
			System.out.println("inside while");
			if(sb.charAt(i)=='E')
			{
			
				String st2=new StringBuffer(sb.charAt(i)).toString().toLowerCase();
				System.out.println(st2);
			}
		}
	}

	}
	}

//
//class Working 
//{
//	
//	public String changeString("WELCOME")
//	{
//		
//	}
//}