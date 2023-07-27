//Copy Constructor
public class Geek {

	String name;
	int id;

	Geek(String name, int id) {
		this.name = name;
		this.id = id;
	}

	Geek(Geek obj2) {                 //copy constructor
		this.name = obj2.name;
		this.id = obj2.id;
	}

}
