package multilevelinheritance;

public class Son extends Father
{
	public void msgdisplay()
	{
		System.out.println("Wishes and Greetings");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Son obj1 = new Son();
		obj1.msgdisplay();
		obj1.display();
		obj1.welcomeMsg();
	}

}
