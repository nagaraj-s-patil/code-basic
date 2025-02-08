package collecctionProctice5Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListCollectionPractice {

	public static void main(String[] args) {
		
		Student s1=new Student(1, "nagu", 100);
		Student s2=new Student(2, "mallu", 80);
		Student s3=new Student(3, "sankit", 90);
	
		List<Student> l=new ArrayList<Student>();
		
		l.add(s1);
		l.add(s2);
		l.add(s3);
		
		System.out.println(l);
//		System.out.println();
//		System.out.println(s1.compareTo(s2));

//		Collections.sort(l);
		System.out.println("printing data of list data");
		for(int i=0;i<l.size();i++) 
		{
		 Student s= l.get(i);
			
			System.out.println(s);
		}
		
		System.out.println("--------sorting by name----------");
		
		Collections.sort(l);
		
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
	
	}
}
