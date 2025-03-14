package encapsulation;

public class Encapsulation1 {
	String name;
	int age;
	public void setDetails(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public void getDetails()
	{
		System.out.println(name + " " +age);
	}

}
