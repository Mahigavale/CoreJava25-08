package stringBufferClass;

public class Second {

	public static void main(String[] args) {
		
		// reverse the string.
		//"welcome" => "emoclew", {'e','m','o','c','l','e','w'}
		
		 String str="welcome";
		 
		int i=str.length()-1; //6->5->4->3->2->1->0  (i>=0)
		String str2="";
		StringBuffer sb=new StringBuffer();
		
		while(i>=0)
		{
			//emoclew
			 sb.append(str.charAt(i));
			 i--;
		}
		 
		str2=sb.toString();
		System.out.println(str2);
		 
		char[] chars=str2.toCharArray();
		
	//	System.out.println(chars.length);
		int j=0;
		System.out.print("{ ");
		for(char c:chars)
		{
			j++;
			if(j<chars.length)
			{
			System.out.print("'"+c+"'"+",");
			}
			else
			{
				System.out.print("'"+c+"'");
			}
			
		}
		System.out.print("}");
	}

}
