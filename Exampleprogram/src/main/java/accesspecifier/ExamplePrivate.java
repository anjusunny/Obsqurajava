package accesspecifier;


public class ExamplePrivate 
{
	private void salary(int sal)
	{
		System.out.println("My salary:"+sal);
	}
	public static void main(String[] args) 
	{
		ExamplePrivate obj = new ExamplePrivate();
		obj.salary(120000);
	}

}
