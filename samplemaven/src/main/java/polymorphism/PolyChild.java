package polymorphism;

public class PolyChild extends PolyParent {


	public static void main(String[] args) {
		PolyChild obj = new PolyChild();
		obj.display(5, 7);
		

	}
	public void display(int a,int b)
	{
		int sum = a+b;
		System.out.println("Child sum : "+ sum);
		super.display(8, 2);
	}

}
