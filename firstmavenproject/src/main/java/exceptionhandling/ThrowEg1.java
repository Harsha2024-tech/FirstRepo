package exceptionhandling;

public class ThrowEg1 {

	public static void main(String[] args) {
		int age=25;
		if(age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new ArithmeticException("The candidate is under age for voting");
		}
		// TODO Auto-generated method stub

	}

}
