package datatypes;

public class Primitive {

	public static void main(String[] args) {
		//byte => 1 byte=>8 Bits
		//short=> 2 bytes=> 16 bits
		//int=>4 bytes=> 32 bits
		//float=> 4 bytes=> 32 bits
		//long=> 8 bytes=> 64 bits
		//double=> 8 bytes=> 64 bits
		//boolean=> 1 bit=>
		//char=> 2 bytes=> 16 bits
		
		byte age=12; // range=> 
		//-2^n-1 to 2^n-1-1 n=> no. of bits.(1 byte=> 8 bits)
		// -2^7 to 2^7-1
		//-128 to 127=> numerical value.
		
		 short sh=-32768;
      //-2^15 to 2^15-1=> Range of the Short.
	 //-32768 to 32767	
		 
		 int number=2147483647;
				 //4 bytes=> 32 bits
				 //-2^31 to 2^31-1
				 //-2147483648 to 2147483647
		 
		 float Float=2.12345678912f;
				 //4 bytes
				 //32 bits
		       //7 decimal points.
		 
		 double Double=1.123456789101112;
				 //8 bytes=> 64 bits
				 //-2^63 to 2^63-1
		     // 15 points precision.
	//	 System.out.println(Double);
				 
				 
		// System.out.println(Float);
		 
		 
		 boolean flag=true;
		 
		 long l=900000000000000000l;
		 
				 // 8 bytes=>64 bits
		                   
		 
		 char c='6';
		 // 2 bytes=> 16 bits.
		 
	}

}
