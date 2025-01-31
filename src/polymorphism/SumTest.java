package polymorphism;

public class SumTest {

	public static void main(String[] args) {
		
		
		Sum obj=new Sum();
		obj.add(10, 20);
		//obj.addDouble(20.33, 30.44);
		//obj.addLong(2233344555L, 4433366444L);
		//obj.addThreeInt(10,20,30);
		obj.add(20.33, 30.44);
		obj.add(2233344555L, 4433366444L);
		obj.add(10,20,30);
		obj.add("Rama", "Krishna");


	}

}
