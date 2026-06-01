package superKeyWord;

public class ChildTwo extends ParentTwo
{
	public void result()
	{
		super.result();
		int a=1,b=3;
		int c=a*b;
		System.out.println("Product displayed:"+c);
	}
	public static void main(String[] args) 
	{
		System.out.println("Method Overriding");
		ChildTwo obj = new ChildTwo();
		obj.result();
	}

}
