package exceptionhandling;

public class ExampleEH {

	public static void main(String[] args) 
	{
		try 
		{
			int x;
			x=2/0;
			System.out.println(x);	
		}
		catch(ArithmeticException e) 
		{
			System.out.println("....................");
			System.out.println(e);
		}
		finally 
		{
			System.out.println("Message from finally block");
		}

	}

}
