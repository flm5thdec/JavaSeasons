package arrays;

public class TwoDimArraysDemo1 {

	public static void main(String[] args) {

		String[][] data=new String[2][4];
		
		System.out.println("length "+data.length);   //no of rows ==> 2
		 
		System.out.println(data[0].length);   // no of coulmns in row 0 ==> 4
		
		System.out.println(data[1].length);   // no of coulmns in row 1 ==> 4
		
		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<data[i].length;j++)
			{
				System.out.print(data[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		data[0][0]="reyaz";
		data[0][1]="reyaz123";
		data[0][2]="reyaz s";
		data[0][3]="abcd@gmail.com";
		
		data[1][0]="kumar";
		data[1][1]="kumar123";
		data[1][2]="kumar m";
		data[1][3]="xyz@gmail.com";
		
		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<data[i].length;j++)
			{
				System.out.print(data[i][j]+"\t");
			}
			System.out.println();
		}
		
		

		
	}

}
