//Copy Constructor
public class UseGeek {

	public static void main(String[] args) {

		Geek g1 = new Geek("Abcd", 123);

		System.out.println(g1.name + " " + g1.id);

		Geek g2 = new Geek(g1);

		System.out.println(g2.name + " " + g2.id);

	}

}
