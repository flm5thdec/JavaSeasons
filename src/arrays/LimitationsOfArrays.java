package arrays;

public class LimitationsOfArrays {
	
	public static void main(String[] args) {
		
		
		int[] a=new int[5];
		
		a[0]=10;
		a[1]=20;
		//a[2]=20.33; //Type mismatch: cannot convert from double to int
		//a[2]=9884022338L; //Type mismatch: cannot convert from long to int
		//a[2]="FLM"; //Type mismatch: cannot convert from String to int
		a[2]=25;
		a[3]=30;
		a[4]=35;
		//a[5]=40;
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		//at arrays.LimitationsOfArrays.main(LimitationsOfArrays.java:18)

		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
				
		
	}

}
