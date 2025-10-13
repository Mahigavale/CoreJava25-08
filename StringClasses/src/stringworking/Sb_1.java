package stringworking;

public class Sb_1 {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("abc");
		System.out.println(sb);
		StringBuilder sb2=sb.append("def");
		System.out.println(sb);
		System.out.println(sb2);
		System.out.println(sb2==sb);
		//Single Object => at the line number 7
		
	}

}
