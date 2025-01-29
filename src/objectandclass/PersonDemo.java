package objectandclass;

public class PersonDemo {

	public static void main(String[] args) {
		
		//2)using SFM (Static Factory Method)
		
		Person p2=Person.getPerson();
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.ph);

	}

}
