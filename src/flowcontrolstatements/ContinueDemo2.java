package flowcontrolstatements;

public class ContinueDemo2 {

	public static void main(String[] args) {

		for (int j = 1; j <= 10; j++) {
			
			if(j==5)
			{
				continue;
			}
			
			for (int i = 1; i <= 10; i++) {
				if (i == 5) {
					continue;
				} else {
					System.out.println(j+"\t"+i);
				}
			}
		}

		System.out.println("End of program..");

	}

}
