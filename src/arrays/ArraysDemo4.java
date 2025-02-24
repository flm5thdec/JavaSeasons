package arrays;

import objectandclass.Person;

public class ArraysDemo4 {

	public static void main(String[] args) {
		
		
		Person[] p=new Person[5];
		
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i]);
		}
		
		p[0]=new Person();
		p[1]=new Person();
		p[2]=new Person();
		p[3]=new Person();
		p[4]=new Person();
		
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i].name);
			System.out.println(p[i].age);
			System.out.println(p[i].ph);
		}
		
		p[0].name="Ravi";
		p[0].age=30;
		p[0].ph=7788800022L;
		
		p[1].name="Sam";
		p[1].age=32;
		p[1].ph=7788800023L;
		
		p[2].name="Kumar";
		p[2].age=33;
		p[2].ph=7788800024L;
		
		p[3].name="Kiran";
		p[3].age=35;
		p[3].ph=7788800026L;
		
		p[4].name="Reyaz";
		p[4].age=40;
		p[4].ph=7788800036L;
		
		
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i].name);
			System.out.println(p[i].age);
			System.out.println(p[i].ph);
		}

	}

}
