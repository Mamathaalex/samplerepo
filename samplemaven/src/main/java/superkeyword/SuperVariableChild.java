package superkeyword;

public class SuperVariableChild extends SuperVariable{

	public static void main(String[] args) {
		
		SuperVariableChild obj = new SuperVariableChild();
		obj.display();
		

	}
String colour = "White";
public void display()
{
	System.out.println(colour);
	System.out.println(super.colour);
}
}
