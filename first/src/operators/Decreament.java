package operators;

public class Decreament {

	public static void main(String[] args) {
		
		int age=34;
		--age; //33
		age++; //=>34
		++age;//35
		age--;//=>34
		System.out.println(age+(--age)+(++age)+(age--)-(--age));
                          //34+33+34+34-32
		                 //34+33+34+2
		
	}

}
