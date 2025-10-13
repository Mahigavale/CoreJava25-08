package stringworking;

public class Fifth {

	public static void main(String[] args) {
   
		
		String str1=new String("a");  //heap
		String str2="a";          //heap=>SCP
		String str3="a";
		
	
	}
}
class Demo
{
	public void demo()
	{
        String str=new String("abc"); //O1
		
		String str2=new String("abc"); //O2
		
		String str3="abc";   //O3
		
		String str4="abc";  //O3
	}
}