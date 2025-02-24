package arrays;

public class ArraysDemo2 {

	public static void main(String[] args) {
		
		int[] a=new int[5];
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
		
		a[0]=100;
		a[1]=200;
		
		a[4]=500;
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
		

	}

}
