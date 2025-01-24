package variables;

public class VariablesDemo1 {

	int a;
	
	public static void main(String[] args) {
		
		int x=0;
		
		int y=20;
		
		System.out.println(x);
		System.out.println(y);
		//  System.out.println(a);  ==> Cannot make a static reference to the non-static field a
		
		VariablesDemo1 obj=new VariablesDemo1();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(VariablesDemo2.j);
		

	}
	
	int b;
	

	public void m1()
	{
		
		int z=30;
		System.out.println(z);
	}
}
