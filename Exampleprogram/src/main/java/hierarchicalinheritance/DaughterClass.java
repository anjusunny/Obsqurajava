package hierarchicalinheritance;

public class DaughterClass extends FatherClass
{
	public void daughtermsg()
	{
		System.out.println("I am B's Sister");
	}
	public static void main(String[] args) 
	{
		DaughterClass obj2= new DaughterClass();
		obj2.parentmsg();
		obj2.daughtermsg();		
	}

}
