package inheritance;

public class App {

	public static void main(String[] args) {
		
		//Student s1=new Student();
		Marks s1=new Marks();
		s1.setDetails(1, "John");
		s1.getDetails();
		s1.setMarks(80, 90, 90);
		s1.getResults();

	}

}
