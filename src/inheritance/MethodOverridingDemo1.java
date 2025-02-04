package inheritance;

public class MethodOverridingDemo1 {

	public static void main(String[] args) {
		
		//case 1 ==> no method overridding happened
		
		//P obj=new P(); 
		
		//case 2 ==> here method overridding happened
		
		//C obj=new C();
		
		//case 3  : Invalid (Type mismatch: cannot convert from P to C)
		
		//C obj=new P();
		
		//case 4 :
		P obj=new C();
		obj.m1();
		obj.greet("John");
		System.out.println(obj.x);

	}

}
