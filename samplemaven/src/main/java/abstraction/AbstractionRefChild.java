package abstraction;

public class AbstractionRefChild extends AbstractionRefParent {

	public static void main(String[] args) {
		AbstractionRefParent obj = new AbstractionRefChild();
		//AbstractionRefChild obj1 = new AbstractionRefChild();
		obj.printable();
		obj.showable();
		//obj.draw();
		
		

	}

	@Override
	public void printable() {
		System.out.println("printable");
		
	}
	public void draw()
	{
		System.out.println("draw");
	}

}
