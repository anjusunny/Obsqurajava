package singleinheritance;

public class Employeechild extends Employee 
{
	public void display()
	{
		System.out.println("Employee details are displayed");
	}

	public static void main(String[] args) 
	{
		Employeechild ec = new Employeechild();
		ec.display();
		ec.empdetails();
	}

}
