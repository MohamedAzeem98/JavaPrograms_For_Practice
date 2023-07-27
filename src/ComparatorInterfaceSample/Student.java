package ComparatorInterfaceSample;

import java.util.Comparator;

public class Student {
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		
		this.id = id;
		this.name = name;
		this.age = age;
	}
}
	
	class NameComparator implements Comparator <Student>{

		@Override
		public int compare(Student o1, Student o2) {
			
			return o1.name.compareTo(o2.name);
		}
		
	}
	
	class AgeComparator implements Comparator <Student>{

		@Override
		public int compare(Student o1, Student o2) {
			
			
			if(o1.age==o2.age) {
				return 1;
			}else if(o1.age>o2.age) {
				return 0;
			}else
				return -1;
		}
		
	}
	
	
	
	
	
	


