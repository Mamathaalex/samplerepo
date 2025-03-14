package inheritance;

public class MultilevelChildC extends MultilevelParentB {

	public static void main(String[] args) {
		MultilevelChildC obj =new MultilevelChildC();
		obj.display();
		obj.display1();
		obj.display2();


	}
	public void display2()
	{
		System.out.println("child class C");
	}

}
