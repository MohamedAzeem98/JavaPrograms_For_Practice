package ComparatorInterfaceSample;

import java.util.ArrayList;
import java.util.Collections;

public class UseStudent {
	public static void main(String[] args) {
		
		
	ArrayList<Student> al=new ArrayList<>();
	
	al.add(new Student(13,"Ajay",22));
	al.add(new Student(21,"Bala",17));
	al.add(new Student(45,"Shyam",19));
	
	
	Collections.sort(al,new AgeComparator());
	
	for(Student st:al) {
		System.out.println(st.name+" "+st.age+" "+st.id);
	}
		
		System.out.println();
		
	Collections.sort(al,new NameComparator());
	
	for(Student se:al) {
		System.out.println(se.id+" "+se.name+" "+se.age);
	}
		
		
		
		
	}

}
