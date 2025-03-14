package inheritance;

public class HierChildB extends HierParent{

	public static void main(String[] args) {
		HierChildB obj1 = new HierChildB ();
		obj1.display();
		obj1.display2();

	}
	public void display2()
	{
		System.out.println("HierChildB");
	}

}
