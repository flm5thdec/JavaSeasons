package abstraction;

public class MyTest {

	public static void main(String[] args) {
		
		//Cannot instantiate the type MyInter
		//new MyInter();
		
		MyInter obj=new MyClass();
		
		System.out.println(MyInter.PI);
		
		obj.display(100);
		
		

	}

}
