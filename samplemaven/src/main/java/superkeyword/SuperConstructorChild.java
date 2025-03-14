package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent {

	public static void main(String[] args) {
		SuperConstructorChild obj= new SuperConstructorChild();
		
		

	}
	public SuperConstructorChild()
	{
		super(5,7);
		System.out.println("Child class constructor");
	}

}
