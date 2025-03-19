package abstraction;

public class AbstractionChild  extends AbstractionParent {
	

	public static void main(String[] args) {
		AbstractionChild obj = new AbstractionChild();
		obj.display();
		obj.show();
		
	}
	public void display() {
		System.out.println("Display method");
	}

}
