package polymorphism;

public class ClockTest {

	public static void main(String[] args) {
		
		Clock c1=new Clock();
		//c1.setClock(7);
		//c1.setClock(7, 23);
		c1.setClock(7, 23, 55);
		c1.getClock();

	}

}
