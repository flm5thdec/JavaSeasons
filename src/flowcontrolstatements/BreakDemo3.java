package flowcontrolstatements;

public class BreakDemo3 {

	public static void main(String[] args) {

reyaz:
for (int j = 1; j <= 10; j++) {
			
			for (int i = 1; i <= 10; i++) {
				if (i == 5) {
					break reyaz;
				} else {
					System.out.println(j+"\t"+i);
				}
			}
		}

		System.out.println("End of program..");

	}

	

}
