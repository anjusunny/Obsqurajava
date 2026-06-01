package protectedaccess;

public class ExProtectClass 
{
	protected void display()
	{
		System.out.println("Example for protected access specifier");
	}

	public static void main(String[] args) 
	{
		ExProtectClass ex=new ExProtectClass();
		ex.display();
	}

}
