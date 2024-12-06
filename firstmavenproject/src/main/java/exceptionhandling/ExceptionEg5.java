package exceptionhandling;

public class ExceptionEg5 {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try
		{
			int c=a/b;
			System.out.println("division result:" +c);
			
		}
		catch(ArithmeticException e) 
		{
			int c=a+b;
			System.out.println("Sum is" +c);
			System.out.println(e);
		}
		finally
		{
			System.out.println("Execution completed successfully");
		}
		
		// TODO Auto-generated method stub

	}

}
