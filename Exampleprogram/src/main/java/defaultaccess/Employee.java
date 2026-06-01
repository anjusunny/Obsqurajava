package defaultaccess;

public class Employee 
{
	void id(int ide)
	{
		System.out.println("Employee id:"+ide);
	}
	public static void main(String[] args) 
	{
		Employee emp=new Employee();
		emp.id(2);
	}

}
