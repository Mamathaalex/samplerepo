package exceptionhandling;

public class CustomExcemption {

	public static void main(String[] args) throws VotingException {
		int age = 10;
		if (age > 18)
		{
			System.out.println("Eligible for vote");
		}
		else
		{
			throw new VotingException("Age under 18");
		}

	}

}
