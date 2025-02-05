package abstraction;

public class AbstarctDemo1 {

	public static void main(String[] args) {
		
		//Cannot instantiate the type Numbers
		//new Numbers();
		
		Numbers obj=new Sum();
		obj.compute(10, 20);
		obj.greet();
		
		Numbers obj2=new Sub();
		obj2.compute(30, 40);

	}

}
