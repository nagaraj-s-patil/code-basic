package collecctionProctice5Questions;

public class Student implements Comparable<Student>{

	int id;
	String name;
	int marks;
	Student(int id,String name,int marks){
		
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	//String overriding
	@Override
	public String toString() {
		return "id= "+id+" name "+name+" Marks "+marks;
	}
	@Override
	public int compareTo(Student o) {
		/*
		if(this.marks==o.marks)
		return 1;
		else if(this.marks>o.marks)
			return 0;
		else
			return -1;
			*/
		
		return this.name.compareToIgnoreCase(o.name);
		
		
	
	}
	
	
	
}
