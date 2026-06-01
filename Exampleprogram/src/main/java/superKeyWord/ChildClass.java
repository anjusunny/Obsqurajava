package superKeyWord;

public class ChildClass extends ParentClass
{
	int x = 40;
	public void printMsg()
	{
		System.out.println("Child class value:"+x);
		System.out.println("Parent class value:"+super.x);
	}
	public static void main(String[] args) 
	{
		ChildClass obj = new ChildClass();
		obj.printMsg();
	}

}
