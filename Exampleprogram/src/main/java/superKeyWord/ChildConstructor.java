package superKeyWord;


public class ChildConstructor extends ParentConstructor
{
	public ChildConstructor()
	{
		super();
		System.out.println("Message from Childconsructor");
	}
	
	public void display()
	{
		System.out.println("Use of super keyword");
	}

	public static void main(String[] args) 
	{
		ChildConstructor obj = new ChildConstructor();
		obj.display();
	}

}
