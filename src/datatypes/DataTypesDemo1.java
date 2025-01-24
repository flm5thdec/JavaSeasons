package datatypes;

public class DataTypesDemo1 {

	public static void main(String[] args) {
		
		// byte a=128; //cannot convert from int to byte

		byte a=-128;
		
		//short b=32768; //cannot convert from int to short
		
		short b= 32767;
		
		//int c=2147483648; //The literal 2147483648 of type int is out of range 
		
		int c=2147483647;
		
		//long d=2147483648; //The literal 2147483648 of type int is out of range 
		
		long d=2147483648L;
		
		//float e=3.1415926; //cannot convert from double to float
		
		float e=3.1415926F;
		
		double f=3.141592653589793238;
		
		char ch1='a';
		char ch2=97;
		char ch3=65;
		
		boolean status=false;
				
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(status);
		
	}

}
