package objectandclass;

public class PersonTest {

	public static void main(String[] args) {
		
		//using new operation
		Person p1=new Person();
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.ph);
		p1.name="sivamani";
		p1.age=25;
		p1.ph=9848022338L;
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.ph);
		p1.greet();
		
		
		

	}

}
