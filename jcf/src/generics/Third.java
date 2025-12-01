package generics;

public class Third {

	public static void main(String[] args) {
		
 
		StringtoInt sint=new StringtoInt();
		
		System.out.println(sint.convert("abcs", "defg"));
		
		
		StringtoArray arr=new StringtoArray();
		
		System.out.println(arr.convert("ajjsj k", "emormoedm"));
	}

}

interface IConverter <T,R>
{
	 R convert(T t1, T t2);
}

class StringtoInt implements IConverter<String , Integer>
{

	public Integer convert(String t1, String t2) {
		
		return t1.length()+t2.length();
	}
	
}


class StringtoArray implements IConverter<String , Character[]>
{

	@Override
	public Character[] convert(String t1, String t2) {
		
		
		char[] chars=t1.toCharArray();
		char[] chars2=t2.toCharArray();
		
		int j=chars.length+chars2.length;
	     Character[] charsmain=new Character[j];
	     
	      for(int i=0;i<chars.length;i++)
	      {
	    	  charsmain[i]=Character.valueOf(chars[i]);
	      }
		
	      return charsmain;
	}
	
}