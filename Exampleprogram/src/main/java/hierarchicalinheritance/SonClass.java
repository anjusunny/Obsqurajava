package hierarchicalinheritance;

public class SonClass extends FatherClass
{
	public void sonmsg()
	{
		System.out.println("My Father is A and Sister is C");
	}

	public static void main(String[] args) 
	{
		SonClass obj1 = new SonClass();
		obj1.parentmsg();
		obj1.sonmsg(); 
	}

}
