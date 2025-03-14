package inheritance;

public class HierChildA extends HierParent {

	public static void main(String[] args) {
		HierChildA obj = new HierChildA ();
		obj.display();
		obj.display1();

	}
	public void display1() {
		System.out.println("HierChildA");
	}

}
