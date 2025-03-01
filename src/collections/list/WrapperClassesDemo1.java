package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WrapperClassesDemo1 {

	public static void main(String[] args) {
	
		List<Integer> al=new ArrayList<Integer>();
		
		al.add(10);
		
		al.add(20);
		
		al.add(30);
		
		System.out.println(al);
		
	List<Character> ch=new ArrayList<Character>();
		
		ch.add('A');
		
		ch.add('B');
		
		ch.add('Z');
		
		System.out.println(ch);
		
		
		
	}

}
