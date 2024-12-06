package exceptionhandling;

public class ThrowsEg1 {

	public static void main(String[] args) throws VotingException {
		int age=2;
		if(age>=18)
		{
			System.out.println("eligible for voting");
		}
		else
		{
			throw new VotingException("under age");
		}
		// TODO Auto-generated method stub

	}

}
